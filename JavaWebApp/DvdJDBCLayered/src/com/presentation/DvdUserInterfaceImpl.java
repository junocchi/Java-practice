package com.presentation;

import java.util.List;
import java.util.Scanner;

import com.entity.Dvd;
import com.service.DvdService;
import com.service.DvdServiceImpl;

public class DvdUserInterfaceImpl implements DvdUserInterface {

	DvdService dvdService=new DvdServiceImpl();
	
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
		Scanner scanner=new Scanner(System.in);
		switch(choice) {
		
		// Add a DVD to the table - choice 1
		case 1:
			Dvd newDvd=new Dvd();
			
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
			
			if(dvdService.addDvd(newDvd))
				System.out.println("New Dvd Added.");
			else
				System.out.println("Dvd Not Added.");
			break;
		
		// Remove a DVD from the Table - choice 2 not working
		case 2:
			System.out.println("Enter Dvd ID: ");
			int id=scanner.nextInt();

			if(dvdService.deleteDvdById(id))
				System.out.println("Dvd Deleted.");
			else
				System.out.println("Dvd Not Deleted.");
			break;
			
		// Edit DVD info - choice 3 not working
		case 3:
			System.out.println("Enter the title of the DVD you want to edit:");
			String titleCase3 = scanner.nextLine();
			if (dvdService.findDvdByTitle(titleCase3) != null) {
				System.out.println("Enter 1 to edit title");
				System.out.println("Enter 2 to edit MPAA Rating");
				System.out.println("Enter 3 to edit Director's Name");
				System.out.println("Enter 4 to edit Studio");
				System.out.println("Enter 5 to User Rating");
				System.out.println("Enter choice: ");
				int choiceCase3 = scanner.nextInt();
				Dvd dvdCase3 = dvdService.findDvdByTitle(titleCase3);

				switch (choiceCase3) {
				case 1:
					System.out.println("Enter new DVD title: ");
					dvdCase3.setTitle(scanner.next());
					break;
				case 2:
					System.out.println("Enter MPAA rating: ");
					dvdCase3.setMpaaRating(scanner.nextInt());
					break;
				case 3:
					System.out.println("Enter Director's Name: ");
					dvdCase3.setDirectorName(scanner.next());
					break;
				case 4:
					System.out.println("Enter studio: ");
					dvdCase3.setStudio(scanner.next());
					break;
				case 5:
					System.out.println("Enter User Rating: ");
					dvdCase3.setUserRating(scanner.nextInt());
					System.out.println("The information entered has been saved!");
					break;
				default:
					System.out.println("Invalid Choice");
				}
			}
			break;
			
		// Get all the DVDs in the Table
		case 4:
			List<Dvd> dvdList=dvdService.getAllDvds();
			for(Dvd dvd:dvdList)
			{
				
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