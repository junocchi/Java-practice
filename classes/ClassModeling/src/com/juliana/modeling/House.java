package com.juliana.modeling;

public class House {

	// part of a GPS mapping system
	private double latitude;
	private double longitude;

	// part of a 3-D design system
	private double length;
	private double height;
	private double width;
	private double marketValue;
	private String material;

	public House(double latitude, double longitude, double length, double height, double width, double marketValue,
			String material) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
		this.length = length;
		this.height = height;
		this.width = width;
		this.marketValue = marketValue;
		this.material = material;
		
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getMarketValue() {
		return marketValue;
	}

	public void setMarketValue(double marketValue) {
		this.marketValue = marketValue;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

}


/*
 * Model a house as if the class were to be part of a GPS mapping system. Model
 * a house as if the class were to be part of a 3-D design system.
 */