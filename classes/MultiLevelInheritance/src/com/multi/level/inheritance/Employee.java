package com.multi.level.inheritance;

public class Employee extends Person {
	private String designation;
	private String department;
	private double salary;
	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void inputEmployeeData(int id, String name, String designation, String department, double salary) {
		inputPersonData(id, name);
		this.designation = designation;
		this.department = department;
		this.salary = salary;
	}
	
	
	public void displayEmployeeWithPersonData() {
		displayPersonData();
		System.out.println("Class Employee");
		System.out.println("Designation: " + designation + ".");
		System.out.println("Department: " + department + ".");
		System.out.println("Salary: " + salary + ".");
	}
	

}

//Employee class (everything in person, designation, department, salary)