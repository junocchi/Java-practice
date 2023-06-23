package com.client;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.presentation.DvdUserInterface;
import com.presentation.DvdUserInterfaceImpl;

public class DvdClient {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext springContainer = new AnnotationConfigApplicationContext(DvdConfig.class);
		DvdUserInterface dvdUserInterface = (DvdUserInterface) springContainer.getBean("dvdPresentation");

		Scanner scanner = new Scanner(System.in);
		while (true) {
			dvdUserInterface.showMenu();
			System.out.println("Enter choice: ");
			int choice = scanner.nextInt();
			dvdUserInterface.performMenu(choice);

		}

	}

}