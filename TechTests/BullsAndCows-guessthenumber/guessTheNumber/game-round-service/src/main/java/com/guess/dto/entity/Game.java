package com.guess.dto.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Game {

	private int gameId;
	private String gameStatus;
	private int gameAnswer;

	@JsonCreator
	public Game(@JsonProperty("gameId") int gameId,
			@JsonProperty("gameStatus") String gameStatus,
			@JsonProperty("gameAnswer") int gameAnswer) {
		this.gameId = gameId;
		this.gameStatus = gameStatus;
		this.gameAnswer = gameAnswer;
	}
	public Game() {
		
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getGameStatus() {
		return gameStatus;
	}

	public void setGameStatus(String gameStatus) {
		this.gameStatus = gameStatus;
	}

	public int getGameAnswer() {
		return gameAnswer;
	}

	public void setGameAnswer(int gameAnswer) {
		this.gameAnswer = gameAnswer;
	}

	@Override
	public String toString() {
		return "Game [gameId=" + gameId + ", gameStatus=" + gameStatus + ", gameAnswer=" + gameAnswer + "]";
	}
}