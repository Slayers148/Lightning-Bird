package com.devtraining.mission3.service;

import com.devtraining.mission3.GameRowMapper;
import com.devtraining.mission3.config.SpringJdbcConfig;
import com.devtraining.mission3.model.Game;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import com.devtraining.mission2.repository.GameRepository;

import javax.sql.DataSource;
import java.util.*;

@Service
public class GameService implements GameRepository{
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
}
