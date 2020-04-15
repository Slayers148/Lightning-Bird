package com.devtraining.mission3;

import com.devtraining.mission3.model.Game;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GameRowMapper implements RowMapper<Game> {
    @Override
    public Game mapRow(ResultSet rs, int rowNum) throws SQLException {
        Game game = new Game();

        game.setId(rs.getString("id"));
        game.setName(rs.getString("name"));
        game.setPublisher(rs.getString("publisher"));


        return game;
    }
}
