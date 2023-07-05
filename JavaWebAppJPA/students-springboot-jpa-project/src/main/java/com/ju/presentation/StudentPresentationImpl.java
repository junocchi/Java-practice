package com.ju.presentation;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ju.dto.entity.Student;
import com.ju.service.StudentService;

@Component
public class StudentPresentationImpl implements StudentPresentation {

	@Autowired
	private StudentService studentService;

	@Override
	public void showMenu() {
		System.out.println("1. Add a new student to the program");
		System.out.println("2. Search a student by their class");
		System.out.println("3. Update student's address");
		System.out.println("4. Delete a student by their ID");
		System.out.println("5. Exit");

	}

	@Override
	public void performMenu(int choice) {
		Scanner scanner = new Scanner(System.in);
		switch (choice) {
		
		// Add a new student to the program
		case 1:
			Student newStudent = new Student();

			System.out.println("Enter Student ID: ");
			newStudent.setRollNo(scanner.nextInt());
			System.out.println("Enter Student Name: ");
			newStudent.setName(scanner.next());
			System.out.println("Enter Student Class: ");
			newStudent.setStuClass(scanner.next());
			System.out.println("Enter Student Address: ");
			newStudent.setAddress(scanner.next());
			System.out.println("Enter Student Phone Number: ");
			newStudent.setPhoneNumber(scanner.next());

			if (studentService.addNewStudent(newStudent))
				System.out.println("New Student Added.");
			else
				System.out.println("Student Not Added.");
			break;
		
		// Search a student by their class
		case 2:
			System.out.println("Enter Student Class: ");
			String stuClass = scanner.next();

			if (studentService.deleteStudent(stuClass))
				System.out.println("Student Deleted.");
			else
				System.out.println("Student Not Deleted.");
			break;
	
		// Update student's address
		case 3:
			System.out.println("Enter the Student ID: ");
			int rollNo = scanner.nextInt();
			System.out.println("Enter new address: ");
			String newAddress = scanner.next();
			if (studentService.updateStudentAddress(rollNo, newAddress))
				System.out.println("Student has a new address!");
			else
				System.out.println("Unable to process address change");
			break;
			
		// Delete a student by their ID
			
		// Exit
				case 5:
					System.out.println("Thank you for using the program");
					System.exit(0);
				default:
					System.out.println("Invalid Choice");
				}
}
