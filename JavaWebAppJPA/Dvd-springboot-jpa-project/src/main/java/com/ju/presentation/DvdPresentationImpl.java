package com.ju.presentation;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ju.dto.entity.Dvd;
import com.ju.service.DvdService;
import com.ju.service.DvdServiceImpl;

@Component
public class DvdPresentationImpl implements DvdPresentation {

	@Autowired
	private DvdService dvdService;

//	public DvdPresentationImpl(DvdService dvdService) {
//		super();
//		this.dvdService = dvdService;
//	}

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
			Dvd dvd = new Dvd();

			System.out.println("Enter Dvd ID: ");
			dvd.setDvdId(scanner.nextInt());
			System.out.println("Enter Dvd Title: ");
			dvd.setTitle(scanner.next());
			System.out.println("Enter Dvd MPAA Rating: ");
			dvd.setMpaaRating(scanner.nextInt());
			System.out.println("Enter Dvd Director Name: ");
			dvd.setDirectorName(scanner.next());
			System.out.println("Enter Dvd Studio: ");
			dvd.setStudio(scanner.next());
			System.out.println("Enter Dvd User Rating: ");
			dvd.setUserRating(scanner.nextInt());

			if (dvdService.insertDvd(dvd) != null)
				System.out.println("New Dvd Added.");
			else
				System.out.println("Dvd Not Added.");
			break;

		// Remove a DVD from the Table
		case 2:
			System.out.println("Enter Dvd ID: ");
			int dvdId = scanner.nextInt();

			if (dvdService.deleteDvdById(dvdId) != null)
				System.out.println("The Dvd with id " + dvdId + " was deleted");
			else
				System.out.println("Dvd with id " + dvdId + " does not exist");
			break;

		// Update DVD Rating
		case 3:
			System.out.println("Enter the DVD ID: ");
			int dId = scanner.nextInt();
			System.out.println("Enter new user rating : ");
			int newRating = scanner.nextInt();
			Dvd updatedDvdUserRating = dvdService.updateDvdUserRating(dId, newRating);
			if (updatedDvdUserRating != null) {
				System.out.println("DVD has a new user rating of:");
				System.out.println(updatedDvdUserRating);
			} else
				System.out.println("Unable to process rating change because Dvd with id " + dId + " does not exist");
			break;

		// Get all the DVDs in the Table
		case 4:
			List<Dvd> dvds = dvdService.getAllDvds();
			for (Dvd eachDvd : dvds) {

				System.out.println(eachDvd);
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