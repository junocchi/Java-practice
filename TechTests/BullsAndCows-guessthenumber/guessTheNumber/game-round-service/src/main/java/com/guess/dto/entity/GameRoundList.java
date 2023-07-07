package com.guess.dto.entity;

import java.util.List;

public class GameRoundList {

	List<GameRound> gameRounds;

	public GameRoundList(List<GameRound> gameRounds) {
		super();
		this.gameRounds = gameRounds;
	}

	public List<GameRound> getGameRounds() {
		return gameRounds;
	}

	public void setGameRounds(List<GameRound> gameRounds) {
		this.gameRounds = gameRounds;
	}

}