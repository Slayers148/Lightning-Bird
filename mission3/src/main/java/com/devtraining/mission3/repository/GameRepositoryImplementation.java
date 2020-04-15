//package com.devtraining.mission2.repository;
//
//import com.devtraining.mission2.model.Game;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.BeanPropertyRowMapper;
//import org.springframework.jdbc.core.JdbcTemplate;
//
//import java.util.List;
//import java.util.Optional;
//
//public class GameRepositoryImplementation implements GameRepository {
//
//    private JdbcTemplate jdbcTemplate;
//
//    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }
//
//    @Override
//    public List<Game> getAllGames() {
//        String sql = "select * from tbl_game";
//
//        List<Game> listSale = jdbcTemplate.query(sql,
//                BeanPropertyRowMapper.newInstance(Game.class));
//
//        return listSale;
//    }
//
//    @Override
//    public Game findById(String id) {
//        return null;
//    }
//
//    @Override
//    public void addGame(Game music) {
//
//    }
//
//    @Override
//    public void updateGame(String id, Game music) {
//
//    }
//
//    @Override
//    public void deleteGame(String id) {
//
//    }
//}
