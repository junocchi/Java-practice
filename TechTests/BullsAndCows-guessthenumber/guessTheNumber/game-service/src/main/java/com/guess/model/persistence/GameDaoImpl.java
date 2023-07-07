package com.guess.model.persistence;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import java.sql.Statement;
import java.sql.PreparedStatement;

import com.guess.dto.entity.Game;
import com.guess.model.persistence.GameRowMapper;

@Repository
public class GameDaoImpl implements GameDao {

	private JdbcTemplate jdbcTemplate;
	
	@Autowired
    public GameDaoImpl(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
	
	@Override
	public int createGame(Game game) {
		KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(connection -> {
            PreparedStatement ps = connection.prepareStatement(
                    "INSERT INTO game (answer, status) VALUES (?, ?)",
                    Statement.RETURN_GENERATED_KEYS
            );
            ps.setLong(1, game.getGameAnswer());
            ps.setString(2, game.getGameStatus());
            return ps;
        }, keyHolder);
        return keyHolder.getKey().intValue();
	}

	@Override
	public Game getGameById(int gId) {
	    try {
	        List<Game> games = jdbcTemplate.query("SELECT * FROM game WHERE gameId=?", new GameRowMapper(), gId);
	        if (!games.isEmpty()) {
	            return games.get(0);
	        }
	    } catch (EmptyResultDataAccessException ex) {
	        return null;
	    }
	    return null;
	}

	@Override
	public List<Game> getAllGames() {
		String sql = "SELECT * FROM game";
        return jdbcTemplate.query(sql, new GameRowMapper());
	}

	@Override
	public void updateGame(Game game) {
		String sql = "UPDATE game SET gameStatus = ? WHERE gameId = ?";
        jdbcTemplate.update(sql, game.getGameStatus(), game.getGameId());
		
	}

}
