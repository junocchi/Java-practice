package com.guess.dto.entity;

import java.util.List;

public class RoundList {

	private List<Round> rounds;

	// Constructors

	public RoundList() {
	}

	public RoundList(List<Round> rounds) {
		super();
		this.rounds = rounds;
	}

	public List<Round> getRounds() {
		
		return rounds;
	}

}