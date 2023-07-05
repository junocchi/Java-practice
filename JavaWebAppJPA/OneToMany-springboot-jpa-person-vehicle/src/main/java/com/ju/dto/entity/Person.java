package com.ju.dto.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class Person {
	
	@Id
	@Column
	private int pID;
	@Column
	private String name;
	@Column
	private int age;

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

	@Override
	public String toString() {
		return "Person [pID=" + pID + ", name=" + name + ", age=" + age + "]";
	}

}
