package com.juliana.modeling;

public class Car {

	// inventory system for a car dealership
	private String model;
	private String make;
	private String color;
	private String plate;
	private String fuelType;
	private int year;
	private double currentPrice;

	// video game
	private double maxSpeed;
	private String direction;
	private int acceletarion;

	// constructor
	public Car(String model, String make, String color, String plate, String fuelType, int year, double currentPrice,
			double maxSpeed, String direction, int acceletarion) {
		super();
		this.model = model;
		this.make = make;
		this.color = color;
		this.plate = plate;
		this.fuelType = fuelType;
		this.year = year;
		this.currentPrice = currentPrice;
		this.maxSpeed = maxSpeed;
		this.direction = direction;
		this.acceletarion = acceletarion;
	}

	// getters and setters
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public int getAcceletarion() {
		return acceletarion;
	}

	public void setAcceletarion(int acceletarion) {
		this.acceletarion = acceletarion;
	}

}

/*
 * Model a car as if the class were to be part of an inventory system for a car
 * dealership. Model a car as if the class were to be part of a video game.
 */