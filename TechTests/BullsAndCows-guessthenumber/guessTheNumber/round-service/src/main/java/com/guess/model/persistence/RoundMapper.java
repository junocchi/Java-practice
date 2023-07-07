package com.guess.model.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.guess.dto.entity.Round;

public class RoundMapper implements RowMapper<Round> {

	@Override
    public Round mapRow(ResultSet rs, int rowNum) throws SQLException {
        Round round = new Round();
        round.setRoundId(rs.getInt("roundId"));
        round.setGameId(rs.getInt("gameId"));
        round.setGuess(rs.getString("guess"));
        round.setResult(rs.getString("result"));
        round.setTimeOfGuess(rs.getTimestamp("timeOfGuess").toLocalDateTime());
        return round;
    }

}
