package com.length;

public class NumberLength {
	
	private int number;
	private int numLength;

	public void setNumber(int number) {
		this.number = number;
	}
	public int getNumberLength() {
		checkNumLength(number);
		return numLength;
	}
	
	private void checkNumLength(int number) {
		numLength = String.valueOf(number).length();
	}

}
