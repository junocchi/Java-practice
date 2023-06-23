package com.ju.client;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.ju.presentation.DvdUserInterface;

@SpringBootApplication(scanBasePackages = "com.ju")
public class SpringBootDvdJdbCwithPropertiesApplication {

	public static void main(String[] args) {
		ApplicationContext springContainer = SpringApplication.run(SpringBootDvdJdbCwithPropertiesApplication.class,
				args);
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