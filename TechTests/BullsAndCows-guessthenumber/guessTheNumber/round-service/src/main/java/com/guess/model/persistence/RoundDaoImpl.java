package com.guess.model.persistence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.guess.dto.entity.Round;

@Repository
public class RoundDaoImpl implements RoundDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	// Constructor 
	public RoundDaoImpl(JdbcTemplate jdbcTemplate2) {
		this.jdbcTemplate = jdbcTemplate2;
	}

	@Override
	public List<Round> getAllRounds(int gameId) {
		
		return jdbcTemplate.query("SELECT * FROM ROUND", new RoundMapper());
	}

	@Override
	public Round getSingleRound(int roundId) {
		
		Round round = jdbcTemplate.queryForObject("SELECT * FROM ROUND WHERE roundId =?", new RoundMapper(), roundId);
		return round;
	}
	
	@Override
	public Round addNewRound(Round round) {
		
		String query = "INSERT INTO round (gameId, guess, result, timeOfGuess) VALUES (?, ?, ?, ?)";

	    // Inserting the new round 
		
	    jdbcTemplate.update(query, round.getGameId(), round.getGuess(), round.getResult(), round.getTimeOfGuess());
	    
	 // Getting the new round
	    
	    int lastInsertId = jdbcTemplate.queryForObject("SELECT LAST_INSERT_ID()", Integer.class);

	    String selectSql = "SELECT * FROM round WHERE roundId = ?";
	    return jdbcTemplate.queryForObject(selectSql, new Object[]{lastInsertId}, new RoundMapper());
	}

}
