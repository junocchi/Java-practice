package com.guess.model.persistence;
import java.util.List;

import com.guess.dto.entity.Round;

public interface RoundDao {
	

		List<Round> getAllRounds(int gameId);
		Round getSingleRound(int roundId);
		Round addNewRound(Round round);

}
