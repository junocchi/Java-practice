package com.juliana.modeling;

public class Airplane {

	// part of an air traffic control system
	private boolean permissionToTakeOff;
	private boolean permissionToLand;
	private int flightNumber;
	private String departureAirport;
	private String destination;
	private String direction;
	private double speed;
	private double altitude;

	// for current position
	private double currentLatitude;
	private double currentLongitude;

	// constructor
	public Airplane(boolean permissionToTakeOff, boolean permissionToLand, int flightNumber, String departureAirport,
			String destination, String direction, double speed, double altitude, double currentLatitude,
			double currentLongitude) {
		super();
		this.permissionToTakeOff = permissionToTakeOff;
		this.permissionToLand = permissionToLand;
		this.flightNumber = flightNumber;
		this.departureAirport = departureAirport;
		this.destination = destination;
		this.direction = direction;
		this.speed = speed;
		this.altitude = altitude;
		this.currentLatitude = currentLatitude;
		this.currentLongitude = currentLongitude;
	}

	// getters and setters
	public boolean isPermissionToTakeOff() {
		return permissionToTakeOff;
	}

	public void setPermissionToTakeOff(boolean permissionToTakeOff) {
		this.permissionToTakeOff = permissionToTakeOff;
	}

	public boolean isPermissionToLand() {
		return permissionToLand;
	}

	public void setPermissionToLand(boolean permissionToLand) {
		this.permissionToLand = permissionToLand;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getDepartureAirport() {
		return departureAirport;
	}

	public void setDepartureAirport(String departureAirport) {
		this.departureAirport = departureAirport;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getAltitude() {
		return altitude;
	}

	public void setAltitude(double altitude) {
		this.altitude = altitude;
	}

	public double getCurrentLatitude() {
		return currentLatitude;
	}

	public void setCurrentLatitude(double currentLatitude) {
		this.currentLatitude = currentLatitude;
	}

	public double getCurrentLongitude() {
		return currentLongitude;
	}

	public void setCurrentLongitude(double currentLongitude) {
		this.currentLongitude = currentLongitude;
	}

}

/*
 * Model an airplane as if the class were to be part of an air traffic control
 * system. Model an airplane as if the class were to be part of a flight
 * simulator.
 */