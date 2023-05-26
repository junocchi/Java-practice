package com.multi.level.inheritance;

public class BusinessMan extends Person {
	
	private String natureOfBusiness;
	private double annualTurnover;
	
	public String getNatureOfBusiness() {
		return natureOfBusiness;
	}
	public void setNatureOfBusiness(String natureOfBusiness) {
		this.natureOfBusiness = natureOfBusiness;
	}
	public double getAnnualTurnover() {
		return annualTurnover;
	}
	public void setAnnualTurnover(double annualTurnover) {
		this.annualTurnover = annualTurnover;
	}
	
	public void inputBusinessManData(int id, String name, String natureOfBusiness, double annualTurnover) {
		inputPersonData(id, name);
		this.natureOfBusiness = natureOfBusiness;
		this.annualTurnover = annualTurnover;
	}
	
	public void displayBusinessManData() {
		displayPersonData();
		System.out.println("Class BusinessMan");
		System.out.println("Nature of Business: " + natureOfBusiness + ".");
		System.out.println("Annual Turnover: " + annualTurnover + ".");
	}
}


//Businessman class (everything in person, nature of business and annual turnover)