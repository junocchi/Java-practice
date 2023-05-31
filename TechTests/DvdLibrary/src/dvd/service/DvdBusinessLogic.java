package com.dvd.service;

import java.util.LinkedList;

import com.dvd.dto.Dvd;

public interface DvdBusinessLogic {
	// Allow the user to add a DVD to the collection
	boolean addDvd(Dvd dvd);

	// Allow the user to remove a DVD from the collection (search by title)
	boolean deleteDvd(String title);

	// Allow the user to edit the information for an existing DVD in the collection
	boolean editDvd(String title);

	// Allow the user to list the DVDs in the collection
	LinkedList<Dvd> getAllDvds();

	// Allow the user to display the information for a particular DVD (search by
	// title)
	LinkedList<Dvd> getDvd(String title);

	// Allow the user to search for a DVD by title
	Dvd findDvdByTitle(String title);
	
	public void saveAllDvds();

}

//Load the DVD library from a file
// Save the DVD library back to the file when the program completes
// Allow the user to add, edit, or delete many DVDs in one session