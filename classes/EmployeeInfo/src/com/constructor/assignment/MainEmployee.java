package com.constructor.assignment;

public class MainEmployee {

	public static void main(String[] args) {
		
		//All these data members should be initialized using constructors. Use constructor overloading and demonstrate by creating different employee objects with
		//1.Employee  name alone
		Employee employee1=new Employee("Nath");
		System.out.println("Employee name: " + employee1.getEmpName());

		//2. Employee name and id
		Employee employee2=new Employee("Nath", 18);
		System.out.println("Employee name: " + employee1.getEmpName() + " and ID: " + employee2.getEmpId());
		
		
		//3. Employee name, id and age
		Employee employee3=new Employee("Nath", 18, 27);
		System.out.println("Employee name: " + employee3.getEmpName() + ", ID: " + employee3.getEmpId() + " and age: " + employee3.getEmpAge());
		
		
		//4. Employee name, id and designation
		Employee employee4=new Employee("Nath", 18, "Developer");
		System.out.println("Employee name: " + employee4.getEmpName() + ", ID: " + employee4.getEmpId() + " and designation: " + employee4.getEmpDesgn());
		
		
		//5. Employee name, id, age and designation
		
		
		//6. Employee name, id, age and location
		
		
		//7. Employee name, id, age and experience
		
		
		//8. Employee name, id, designation and experience
		
		
		//9. Employee name, id, designation, location and experience
		
		
		//10. Employee name, id, age, designation, location and experience

		
	}

}
