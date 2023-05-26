package com.multi.level.inheritance;

public class BusinessManMain {

	public static void main(String[] args) {

		BusinessMan businessMan = new BusinessMan();
		businessMan.inputBusinessManData(1, "Mari", "Programming", 200.000);
		businessMan.displayBusinessManData();

		System.out.println("===================");

		// The option below uses the "Super" implicit call from Class Employee
		Employee employee = new Employee();
		employee.inputEmployeeData(1, "Mari", "Developer", "IT", 40.000);
		
		//Alternatively we can keep input/display
		//employee.inputEmployeeData(1, "Mari", "Developer", "IT", 40.000);
		//employee.displayEmployeeWithPersonData();

		System.out.println("===================");

		Person person = new Person();
		person.inputPersonData(1, "Mari");
		person.displayPersonData();

		System.out.println("===================");

	}

}
