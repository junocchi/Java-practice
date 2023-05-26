package com.juliana.height.calculator;

public class HeightCalculator {
	
	private int ftNum, inchNum;
	private int totalFt, totalInches;
	

	public int getTotalFt() {
		return totalFt;
	}

	public int getTotalInches() {
		return totalInches;
	}

	public void setFtNum(int ftNum) {
		this.ftNum = ftNum;
	}

	public void setInchNum(int inchNum) {
		this.inchNum = inchNum;
	}
	
	public void validInputHeights(int ftNum, int inchNum) {
		this.ftNum = ftNum;
		this.inchNum = inchNum%12;
	}

	public void sum(int ftNum, int inchNum) {
	//return height in feet
	totalFt = ftNum + (inchNum / 12);
	//calculates inches
	totalInches = inchNum % 12;
	}
}
