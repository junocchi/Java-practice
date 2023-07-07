package com.ju.dto.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "NewPerson")
public class Person {

	@Id
	@Column
	private int pID;
	@Column
	private String name;
	@Column
	private int age;

	@OneToMany
	private List<Vehicle> vehicleList = new ArrayList<Vehicle>();

	public Person () {
		
	}

	public Person(int pID, String name, int age) {
		super();
		this.pID = pID;
		this.name = name;
		this.age = age;
	}

	public int getpID() {
		return pID;
	}

	public void setpID(int pID) {
		this.pID = pID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Vehicle> getVehicleList() {
		return vehicleList;
	}

	public void setVehicleList(List<Vehicle> vehicleList) {
		this.vehicleList = vehicleList;
	}

	@Override
	public String toString() {
		return "Person [pID=" + pID + ", name=" + name + ", age=" + age + "]";
	}

}
