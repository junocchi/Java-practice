package com.client;

import java.util.Scanner;

import com.presentation.DvdUserInterface;
import com.presentation.DvdUserInterfaceImpl;

public class DvdClient {

	public static void main(String[] args) {
		DvdUserInterface DvdUserInterface = new DvdUserInterfaceImpl();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			DvdUserInterface.showMenu();
			System.out.println("Enter choice: ");
			int choice = scanner.nextInt();
			DvdUserInterface.performMenu(choice);

		}

	}

}