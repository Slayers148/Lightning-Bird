package com.devtraining.mission3.service;

import com.devtraining.mission3.GameRowMapper;
import com.devtraining.mission3.config.SpringJdbcConfig;
import com.devtraining.mission3.model.Game;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.*;

@Service
public class GameService {
    DataSource dataSource = new SpringJdbcConfig().mysqlDataSource();

    JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

    public List<Game> getAllGames() {
        String sql = "SELECT * FROM game";
        return jdbcTemplate.query(sql, new GameRowMapper());
    }

    public Game getGame(String id) {
        String sql = "select * from game where id = ?";
        return (Game) jdbcTemplate.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper(Game.class));
    }
    public void addGame(Game game) {
        String sql = "insert into game (id, name, publisher) values(?,?,?)";
        Object[] values = new Object[]{game.getId(), game.getName(), game.getPublisher()};
        jdbcTemplate.update(sql, values);
    }

    public void updateGame(Game game) {
        String sql = "update game set name = ?, publisher = ? where id = ?";
        jdbcTemplate.update(sql, game.getName(), game.getPublisher(),game.getId());
    }

    public void deleteGame(String id) {
        String sql = "delete from game where id="+id+"";
        jdbcTemplate.update(sql);
    }
//
//    private List<Game> gameList = new ArrayList<>(Arrays.asList(
//
//            new Game(1, "ff7", "sqex"),
//            new Game(2, "ff8", "sqex"),
//            new Game(3, "ff9", "sqex")
//
//    ));
//
//    public List<Game> getAllGamesList(){
//        return gameList;
//    }
//    public Game getGame(Long id){
//        return gameList.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
//    }
//    public void addGame(Game game){
//        gameList.add(game);
//    }
//    public void updateGame(Game game, Long id){
//        int counter = 0;
//        for (Game game1 : gameList){
//            if(game1.getId().equals(id)){
//                gameList.set(counter, game);
//            }
//            counter++;
//        }
//    }
//    public void deleteGame(Long id){
//        gameList.removeIf(game -> game.getId().equals(id));
//    }
}