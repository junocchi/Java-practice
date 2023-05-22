package com.multi.level.inheritance;

public class Person {
	
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void inputPersonData(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public void displayPersonData() {
		System.out.println("Class Person");
		System.out.println("Id number: " + id + ".");
		System.out.println("Name: " + name + ".");
	}
	
}

// Person class (id, name)

