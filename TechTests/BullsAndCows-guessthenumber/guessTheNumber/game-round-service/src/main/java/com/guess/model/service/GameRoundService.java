package com.guess.model.service;

import java.util.List;

import com.guess.dto.entity.Game;
import com.guess.dto.entity.GameRound;
import com.guess.dto.entity.Round;

public interface GameRoundService {

	Round makeGuess(int gameId, int i);

	List<GameRound> getGameRoundByGameId(int gameId);

	String getResult(Game game, String guess);

	List<GameRound> getGameRoundByRoundId(String roundId);
}
