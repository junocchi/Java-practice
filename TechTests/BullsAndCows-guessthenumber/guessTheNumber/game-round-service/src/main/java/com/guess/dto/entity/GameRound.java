package com.guess.dto.entity;

import java.time.LocalDateTime;

public class GameRound {

	// Confirm:
	// decide which variables we will use
	// generate constructor
	// generate getters and setters
	// generate toString

	// variables from Game
	private int gameId;
	private String gameStatus;
	private int gameAnswer;
	// variables from Round
	private int roundId;
	private LocalDateTime timeOfGuess;
	private int guess;
	private String result;

	public GameRound(int gameId, String gameStatus, int gameAnswer, int roundId, LocalDateTime timeOfGuess, int guess,
			String result) {
		super();
		this.gameId = gameId;
		this.gameStatus = gameStatus;
		this.gameAnswer = gameAnswer;
		this.roundId = roundId;
		this.timeOfGuess = timeOfGuess;
		this.guess = guess;
		this.result = result;
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

	public int getRoundId() {
		return roundId;
	}

	public void setRoundId(int roundId) {
		this.roundId = roundId;
	}

	public LocalDateTime getTimeOfGuess() {
		return timeOfGuess;
	}

	public void setTimeOfGuess(LocalDateTime timeOfGuess) {
		this.timeOfGuess = timeOfGuess;
	}

	public int getGuess() {
		return guess;
	}

	public void setGuess(int guess) {
		this.guess = guess;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "GameRound [gameId=" + gameId + ", gameStatus=" + gameStatus + ", gameAnswer=" + gameAnswer
				+ ", roundId=" + roundId + ", timeOfGuess=" + timeOfGuess + ", guess=" + guess + ", result=" + result
				+ "]";
	}

}
