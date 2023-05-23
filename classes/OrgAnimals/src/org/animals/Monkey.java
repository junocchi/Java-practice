package org.animals;

public class Monkey extends Animal {

	public Monkey(String color, double weight, int age) {
		super(color, weight, age, true, true);
	}

	public void informationString() {
		System.out.println("Monkey's information: ");
	}

	public void soundType() {

		System.out.println("The monkey makes a hoot sound.");
	}

}
