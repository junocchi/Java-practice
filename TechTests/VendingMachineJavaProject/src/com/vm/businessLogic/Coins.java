package com.vm.businessLogic;

public enum Coins {

	// constants and their associated value
	QUARTER(25), DIMES(10), NICKLES(5), PENNIES(1);

	// coinValue is associated to i

	private int value;

	Coins(int i) {
		value = i;
	}

	public int getValue() {
		return value;
	}

}
