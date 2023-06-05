package com.sujata.employee.client;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.employee.presentation.EmployeeUserInterface;
import com.sujata.employee.presentation.EmployeeUserInterfaceImpl;

public class EmployeeClient {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext springContainer = new AnnotationConfigApplicationContext();
		springContainer.scan("com.sujata.employee");
		springContainer.refresh();
		
//		ApplicationContext springContainer=new ClassPathXmlApplicationContext("employee.xml");
		
//		EmployeeUserInterface employeeUserInterface=new EmployeeUserInterfaceImpl();
		
		EmployeeUserInterface employeeUserInterface=(EmployeeUserInterface)springContainer.getBean("userInterface");
		Scanner scanner=new Scanner(System.in);
		while(true) {
			employeeUserInterface.showMenu();
			System.out.println("Enter Choice : ");
			int choice=scanner.nextInt();
			employeeUserInterface.performMenu(choice);
			
		}

	}

}
