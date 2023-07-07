package com.guess.model.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.guess.dto.entity.Game;

public class GameRowMapper implements RowMapper<Game> {

	@Override
    public Game mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Game game = new Game();
        game.setGameId(resultSet.getInt("gameId"));
        game.setGameStatus(resultSet.getString("gameStatus"));
        game.setGameAnswer(resultSet.getInt("gameAnswer"));
        return game;
    }

}
