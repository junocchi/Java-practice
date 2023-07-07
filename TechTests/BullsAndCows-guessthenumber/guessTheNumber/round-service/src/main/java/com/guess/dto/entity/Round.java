package com.guess.dto.entity;

import java.time.LocalDateTime;

public class Round {
	
	private int roundId;
	private int gameId;
	private String guess;
	private String result;
	private LocalDateTime timeOfGuess;
	
	
	// Constructors
	
	public Round(int roundId, int gameId, String guess, String result, LocalDateTime timeOfGuess) {
		super();
		this.roundId = roundId;
		this.gameId = gameId;
		this.guess = guess;
		this.result = result;
		this.timeOfGuess = timeOfGuess;
	}
	
	public Round() {
		
	}
	
	// Getters and Setters
	
	public int getRoundId() {
		return roundId;
	}
	public void setRoundId(int roundId) {
		this.roundId = roundId;
	}
	public int getGameId() {
		return gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	public String getGuess() {
		return guess;
	}
	public void setGuess(String guess) {
		this.guess = guess;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public LocalDateTime getTimeOfGuess() {
		return timeOfGuess;
	}
	public void setTimeOfGuess(LocalDateTime timeOfGuess) {
		this.timeOfGuess = timeOfGuess;
	}

	//ToString
	
	@Override
	public String toString() {
		return "Round [roundId=" + roundId + ", gameId=" + gameId + ", guess=" + guess + ", result=" + result
				+ ", timeOfGuess=" + timeOfGuess + "]";
	}
	

}
