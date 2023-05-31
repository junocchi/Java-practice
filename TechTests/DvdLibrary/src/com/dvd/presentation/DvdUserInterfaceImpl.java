package com.dvd.presentation;

import java.util.LinkedList;
import java.util.Scanner;
import com.dvd.dto.*;
import com.dvd.service.*;

public class DvdUserInterfaceImpl implements DvdUserInterface {

	private DvdBusinessLogic businessLogic = new DvdBusinessLogicImpl();

	@Override
	public void showMenu() {
		System.out.println("1. Add a DVD to the collection");
		System.out.println("2. Remove a DVD from the collection");
		System.out.println("3. Edit the information for an existing DVD in the collection");
		System.out.println("4. List all the DVDs in the collection");
		System.out.println("5. Display the information for a particular DVD");
		// We should say if this DVD is i our library or not
		System.out.println("6. Search for a DVD by title");
		System.out.println("7. Exit");

	}

	@Override
	public void performMenu(int choice) throws Exception {
		Scanner scanner = new Scanner(System.in);
		Dvd dvd = new Dvd();
		switch (choice) {
		// 1. Add a DVD to the collection
		case 1:
//			Dvd dvd = new Dvd();
			System.out.println("Enter new DVD title: ");
			dvd.setTitle(scanner.nextLine());
			System.out.println("Enter release date: ");
			dvd.setReleaseDate(scanner.nextLine());
			System.out.println("Enter MPAA rating: ");
			dvd.setRatingMPAA(scanner.nextLine());
			System.out.println("Enter studio: ");
			dvd.setStudio(scanner.nextLine());
			System.out.println("Enter DVD notes: ");
			dvd.setNotes(scanner.nextLine());

			boolean status = businessLogic.addDvd(dvd);

			if (status)
				System.out.println("The DVD has been added!");
			else
				System.out.println("The DVD could not be added.");
			break;

		// 2. Remove a DVD from the collection
		case 2:
			System.out.println("Enter the title of the DVD record you want to delete:");
			String TitleCase2 = scanner.next();
			if (businessLogic.deleteDvd(TitleCase2))
				System.out.println("DVD record deleted.");
			else
				System.out.println("The DVD with title " + TitleCase2 + "does not exist.");
			break;

		// 3. Edit the information for an existing DVD in the collection
		case 3:
			System.out.println("Enter the title of the DVD you want to edit:");
			String titleCase3 = scanner.nextLine();
			if (businessLogic.findDvdByTitle(titleCase3) != null) {
				System.out.println("Enter 1 to edit title");
				System.out.println("Enter 2 to edit Release Date");
				System.out.println("Enter 3 to edit MPAA Rating");
				System.out.println("Enter 4 to edit Studio");
				System.out.println("Enter 5 to edit notes");
				System.out.println("Enter choice: ");
				int choiceCase3 = scanner.nextInt();
				Dvd dvdCase3 = businessLogic.findDvdByTitle(titleCase3);

				switch (choiceCase3) {
				case 1:
					System.out.println("Enter new DVD title: ");
					dvdCase3.setTitle(scanner.next());
					break;
				case 2:
					System.out.println("Enter release date: ");
					dvdCase3.setReleaseDate(scanner.next());
					break;
				case 3:
					System.out.println("Enter MPAA rating: ");
					dvdCase3.setRatingMPAA(scanner.next());
					break;
				case 4:
					System.out.println("Enter studio: ");
					dvdCase3.setStudio(scanner.next());
					break;
				case 5:
					System.out.println("Enter DVD notes: ");
					dvdCase3.setNotes(scanner.next());
					System.out.println("The information entered has been saved!");
					break;
				default:
					System.out.println("Invalid Choice");
				}
			}

			// 4. List all the DVDs in the collection
		case 4:
			LinkedList<Dvd> dvds = businessLogic.getAllDvds();
			// for each object dvdCase4 found in Dvd's list, print object
			for (Dvd dvdCase4 : dvds) {
				System.out.println(dvdCase4);
			}
			break;

		// 5. Display the information for a particular DVD
		case 5:
			System.out.println("Enter the title of the DVD records you want to view:");
			String titleCase5 = scanner.next();
			if (businessLogic.findDvdByTitle(titleCase5) != null)
				System.out.println("DVD information: " + dvd);
			else
				System.out.println("The DVD with title " + titleCase5 + "does not exist.");
			break;

		// 6. Search for a DVD by title
		case 6:
			System.out.println("Enter the title of the DVD you want to search:");
			String titleCase6 = scanner.next();
			if (businessLogic.findDvdByTitle(titleCase6) != null)
				System.out.println("The DVD with title " + dvd.getTitle() + " exists in the library.");
			else
				System.out.println("The DVD with title " + titleCase6 + "does not exist in the library.");
			break;

		// 7. Exit
		case 7:
			businessLogic.saveAllDvds();
			System.out.println("Thanks for using our DVD Library System");
			System.exit(0);

		default:
			System.out.println("Invalid Choice");
		}
	}

}
