package com.presentation;

import java.util.List;
import java.util.Scanner;

import com.entity.Dvd;
import com.service.DvdService;
import com.service.DvdServiceImpl;

public class DvdUserInterfaceImpl implements DvdUserInterface {

	DvdService dvdService = new DvdServiceImpl();

	@Override
	public void showMenu() {
		System.out.println("1. Add a new DVD to the library");
		System.out.println("2. Display all DVDs");
		System.out.println("3. Exit");

	}

	@Override
	public void performMenu(int choice) {
		Scanner scanner = new Scanner(System.in);
		switch (choice) {

		// Add a DVD to the database - choice 1
		case 1:
			Dvd newDvd = new Dvd();

			System.out.println("Enter Dvd ID: ");
			newDvd.setDvdID(scanner.nextInt());
			System.out.println("Enter Dvd Title: ");
			newDvd.setTitle(scanner.next());
			System.out.println("Enter Dvd MPAA Rating: ");
			newDvd.setMpaaRating(scanner.nextInt());
			System.out.println("Enter Dvd Director Name: ");
			newDvd.setDirectorName(scanner.next());
			System.out.println("Enter Dvd Studio: ");
			newDvd.setStudio(scanner.next());
			System.out.println("Enter Dvd User Rating: ");
			newDvd.setUserRating(scanner.nextInt());

			if (dvdService.addDvd(newDvd))
				System.out.println("New Dvd Added.");
			else
				System.out.println("Dvd Not Added.");
			break;

		// show all DVDs - choice 2
		case 2:
			List<Dvd> dvdList = dvdService.getAllDvds();
			for (Dvd dvd : dvdList) {

				System.out.println(dvd);
			}
			break;

		// Exit
		case 3:
			System.out.println("Thank you for using the Dvd library");
			System.exit(0);
		default:
			System.out.println("Invalid Choice");
		}

	}

}