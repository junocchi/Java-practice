package com.ju.dto.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "NewVehicle")
public class Vehicle {

	@Id
	@Column
	private int vehicleNo;
	@Column
	private String type;
	@Column
	private String model;
	@Column
	private String color;

	public Vehicle () {
		
	}
	public Vehicle(int vehicleNo, String type, String model, String color) {
		super();
		this.vehicleNo = vehicleNo;
		this.type = type;
		this.model = model;
		this.color = color;
	}

	public int getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(int vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleNo=" + vehicleNo + ", type=" + type + ", model=" + model + ", color=" + color + "]";
	}

}
