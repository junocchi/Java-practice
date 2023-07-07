package com.guess.model.service;

import java.util.List;

import com.guess.dto.entity.Round;

public interface RoundService {
	
	List<Round> getAllRoundsByGameId(int gameId);
	Round getSingleRoundByRoundId(int roundId);
	Round createRound(Round round);

}
