package com.guess.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guess.dto.entity.Round;
import com.guess.model.persistence.RoundDao;

@Service
public class RoundServiceImpl implements RoundService {
	
	@Autowired
	private RoundDao roundDao;
	

	@Override
	public List<Round> getAllRoundsByGameId(int gameId) {
		return roundDao.getAllRounds(gameId);
	}

	@Override
	public Round getSingleRoundByRoundId(int roundId) {
		
		return roundDao.getSingleRound(roundId);
	}

	@Override
	public Round createRound(Round round) {
		
		
		return roundDao.addNewRound(round);
		
	}
}
