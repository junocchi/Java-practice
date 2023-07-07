package com.guess.dto.entity;

public class Guess {
// An object used when the user makes a guess, passes these two values as specified in the task
	private int gameId;
	private int guess;
	
	// Constructors
	
	public Guess() {}
	
	public Guess(int gameId, int guess) {
		super();
		this.gameId = gameId;
		this.guess = guess;
	}


	// Getters and Setters

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public int getGuess() {
		return guess;
	}

	public void setGuess(int guess) {
		this.guess = guess;
	}

	@Override
	public String toString() {
		return "Guess [gameId=" + gameId + ", guess=" + guess + "]";
	}
	
	
	
}
