package com.client;

import java.util.Scanner;

import com.presentation.EmployeeUserInterface;
import com.presentation.EmployeeUserInterfaceImpl;

public class EmployeeClient {

	public static void main(String[] args) {
		EmployeeUserInterface employeeUserInterface=new EmployeeUserInterfaceImpl();
		Scanner  scanner=new Scanner(System.in);
		while(true) {
			employeeUserInterface.showMenu();
			System.out.println("Enter Choice : ");
			int choice=scanner.nextInt();
			employeeUserInterface.performMenu(choice);
			
		}

	}

}