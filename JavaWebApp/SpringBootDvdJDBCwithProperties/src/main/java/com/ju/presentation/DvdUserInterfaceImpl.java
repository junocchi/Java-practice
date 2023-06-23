package com.ju.presentation;

import java.util.List;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.ju.entity.Dvd;
import com.ju.service.DvdService;
import com.ju.service.DvdServiceImpl;

@Component("dvdPresentation")
public class DvdUserInterfaceImpl implements DvdUserInterface {

	DvdService dvdService;

	public DvdUserInterfaceImpl(@Autowired DvdService dvdService) {
		super();
		this.dvdService = dvdService;
	}

	@Override
	public void showMenu() {
		System.out.println("1. Add a new DVD to the library");
		System.out.println("2. Delete a DVD by ID");
		System.out.println("3. Edit DVD information");
		System.out.println("4. Display all DVDs");
		System.out.println("5. Exit");

	}

	@Override
	public void performMenu(int choice) {
		Scanner scanner = new Scanner(System.in);
		switch (choice) {

		// Add a DVD to the table - choice 1
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

		// Remove a DVD from the Table
		case 2:
			System.out.println("Enter Dvd ID: ");
			int id = scanner.nextInt();

			if (dvdService.deleteDvdById(id))
				System.out.println("Dvd Deleted.");
			else
				System.out.println("Dvd Not Deleted.");
			break;

		// Edit DVD Rating
		case 3:
			System.out.println("Enter the DVD ID: ");
			int dvdId = scanner.nextInt();
			System.out.println("Enter new user rating: ");
			int newRating = scanner.nextInt();
			if (dvdService.updateRating(dvdId, newRating))
				System.out.println("DVD has a new user rating!");
			else
				System.out.println("Unable to process user rating change");
			break;

		// Get all the DVDs in the Table
		case 4:
			List<Dvd> dvdList = dvdService.getAllDvds();
			for (Dvd dvd : dvdList) {

				System.out.println(dvd);
			}
			break;

		// Exit
		case 5:
			System.out.println("Thank you for using the Dvd library");
			System.exit(0);
		default:
			System.out.println("Invalid Choice");
		}

	}

}