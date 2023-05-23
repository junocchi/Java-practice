package org.animals;

abstract public class Animal {

	private String color;
	private double weight;
	private int age;
	private boolean vegetarian;
	private boolean climb;

	public Animal(String color, double weight, int age, boolean vegetarian, boolean climb) {
		super();
		this.color = color;
		this.weight = weight;
		this.age = age;
		this.vegetarian = vegetarian;
		this.climb = climb;
	}


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	
	public void isVegetarian() {
		System.out.println("Vegetarian: " + vegetarian + ".");
	
	}


	public void setIsVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}


	public void canClimb() {
		System.out.println("Can climb: " + climb + ".");
	}


	public void setCanClimb(boolean climb) {
		this.climb = climb;
		
	}


	public void colorWeightAndAge() {
		System.out.println("Its color is " + color + ", it weights " + weight + " and it is " + age + " years old.");
	}

}

/*
 * Create Java project in which create a package named org.animals. In that
 * create a super class called Animal and various sub classes like Lion, Tiger,
 * Deer, Monkey, Elephant and Giraffe. In each class create data members like
 * color, weight,age etc. Create methods like isVegetarian, canClimb, sound etc.
 * create a package called org.zoo and create a class called ABCZoo and create
 * objects for the animals that are existing in zoo and print the characteristic
 * of each animal.
 */
