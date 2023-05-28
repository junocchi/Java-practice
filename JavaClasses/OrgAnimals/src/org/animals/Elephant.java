package org.animals;

public class Elephant extends Animal {

	public Elephant(String color, double weight, int age) {
		super(color, weight, age, true, false);
	}

	public void informationString() {
		System.out.println("Elephant's information: ");
	}

	public void soundType() {

		System.out.println("The elephant makes a trumpet sound.");
	}

}
