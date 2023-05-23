package org.animals;

public class Deer extends Animal {

	public Deer(String color, double weight, int age) {
		super(color, weight, age, true, false);
	}

	public void informationString() {
		System.out.println("Deer's information: ");
	}

	public void soundType() {
		System.out.println("The deer makes a grunting sound.");
	}

}
