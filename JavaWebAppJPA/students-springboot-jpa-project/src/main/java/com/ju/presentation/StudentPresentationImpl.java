package com.ju.presentation;

import java.util.Scanner;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ju.dto.entity.Student;
import com.ju.service.StudentService;

@Component
public class StudentPresentationImpl implements StudentPresentation {

	@Autowired
	StudentService studentService;

	@Override
	public void showMenu() {
		System.out.println("1. Create a new student");
		System.out.println("2. Get a student by their class");
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
			Student student = new Student(choice, null, choice, choice, null, choice);

			System.out.println("Enter Student ID : ");
			student.setRollNo(scanner.nextInt());
			scanner.nextLine();
			System.out.println("Enter Student Name : ");
			student.setName(scanner.nextLine());
			System.out.println("Enter Age : ");
			student.setAge(scanner.nextInt());
			scanner.nextLine();
			System.out.println("Enter Address : ");
			student.setAddress(scanner.nextLine());
			System.out.println("Enter Class Number : ");
			student.setClassNo(scanner.nextInt());
			scanner.nextLine();
			System.out.println("Enter Phone Number : ");
			student.setPhoneNumber(scanner.nextLong());

			if (studentService.createNewStudent(student) != null)
				System.out.println("Student Added");
			else
				System.out.println("Student Not Added");
			break;

		// Get a student by their class
		case 2:
			System.out.println("Enter Class Number : ");
			int classNo = scanner.nextInt();
			scanner.nextLine();

			List<Student> students = studentService.getStudentsByClassNo(classNo);

			if (students == null)
				System.out.println("No Students enrolled in class " + classNo);

			for (Student aStudent : students) {
				System.out.println(aStudent);
			}
			break;

		// Update student's address
		case 3:
			System.out.println("Enter Student ID : ");
			int id = scanner.nextInt();
			scanner.nextLine();

			if (studentService.getStudentById(id) == null) {
				System.out.println("Incorrect ID. Student could not be found.");
				break;
			}

			System.out.println("Enter New Address : ");
			String address = scanner.nextLine();

			if (studentService.updateAddress(id, address) == null)
				System.out.println("Unable to proceed. Address could not be updated.");
			else
				System.out.println("Address updated successfully.");
			break;

		// Delete a student by their ID
		case 4:
			System.out.println("Enter Student ID: ");
			int rollNo = scanner.nextInt();
			scanner.nextLine();

			if (studentService.deleteStudentById(rollNo) != null)
				System.out.println("Student deleted successfully.");
			else
				System.out.println("Some error occured. Student does not exist");
			break;

		// Exit
		case 5:
			System.out.println("Thank you for using the program");
			System.exit(0);
		default:
			System.out.println("Invalid Choice");
		}
	}
}
