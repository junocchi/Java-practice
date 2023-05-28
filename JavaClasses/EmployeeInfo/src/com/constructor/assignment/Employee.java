package com.constructor.assignment;

public class Employee {

	private String empName;
	private int empId;
	private int empAge;
	private String empDesgn;
	private String empLocation;
	private double empExpInYrs;

//	1.Employee name alone
	public Employee(String empName) {
		this.empName = empName;
	}

//	2. Employee name and id
	public Employee(String empName, int empId) {
		super();
		this.empName = empName;
		this.empId = empId;
	}

//	3. Employee name, id and age
	public Employee(String empName, int empId, int empAge) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empAge = empAge;
	}

//	4. Employee name, id and designation
	public Employee(String empName, int empId, String empDesgn) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empDesgn = empDesgn;
	}

// 5. Employee name, id, age and designation
	public Employee(String empName, int empId, int empAge, String empDesgn) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empAge = empAge;
		this.empDesgn = empDesgn;
	}

//	6. Employee name, id, age and location
	public Employee(String empName, int empId, String empLocation, int empAge) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empAge = empAge;
		this.empLocation = empLocation;
	}

//	7. Employee name, id, age and experience
	public Employee(String empName, int empId, int empAge, double empExpInYrs) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empAge = empAge;
		this.empExpInYrs = empExpInYrs;
	}

//	8. Employee name, id, designation and experience
	public Employee(String empName, int empId, String empDesgn, double empExpInYrs) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empDesgn = empDesgn;
		this.empExpInYrs = empExpInYrs;
	}

//	9. Employee name, id, designation, location and experience
	public Employee(String empName, int empId, String empDesgn, String empLocation, double empExpInYrs) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empDesgn = empDesgn;
		this.empLocation = empLocation;
		this.empExpInYrs = empExpInYrs;
	}

	// 10. Employee name, id, age, designation, location and experience
	public Employee(String empName, int empId, int empAge, String empDesgn, String empLocation, double empExpInYrs) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empAge = empAge;
		this.empDesgn = empDesgn;
		this.empLocation = empLocation;
		this.empExpInYrs = empExpInYrs;
	}

	public String getEmpName() {
		return empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public String getEmpDesgn() {
		return empDesgn;
	}

	public void setEmpdesgn(String empdesgn) {
		this.empDesgn = empdesgn;
	}

	public String getEmpLocation() {
		return empLocation;
	}

	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}

	public double getEmpExpInYrs() {
		return empExpInYrs;
	}

	public void setEmpExpInYrs(double empExpInYrs) {
		this.empExpInYrs = empExpInYrs;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

}