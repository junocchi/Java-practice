package org.animals;

public class Lion extends Animal {

	public Lion(String color, double weight, int age) {
		super(color, weight, age, false, false);
	}

	public void informationString() {
		System.out.println("Lion's information: ");
	}

	public void soundType() {

		System.out.println("The lion makes a roar sound.");
	}

}
