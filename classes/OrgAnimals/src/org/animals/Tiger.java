package org.animals;

public class Tiger extends Animal {

	public Tiger(String color, double weight, int age) {
		super(color, weight, age, false, false);
	}

	public void informationString() {
		System.out.println("Tiger's information: ");
	}

	public void soundType() {

		System.out.println("The tiger makes a growl sound.");
	}

}
