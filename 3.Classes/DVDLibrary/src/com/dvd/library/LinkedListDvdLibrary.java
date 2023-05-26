package com.dvd.library;

import java.util.LinkedList;

public class LinkedListDvdLibrary {

	public static void main(String[] args) {

		LinkedList<DvdLibrary> dvdList = new LinkedList<DvdLibrary>();

		dvdList.add(new DvdLibrary("Moana", "2000", "4.5", "Mari Rui", "Paramound", "Great for kids"));
		dvdList.add(new DvdLibrary("Pinocchio", "1975", "3.5", "Rose Lee", "Studio42", "Great for kids"));
		dvdList.add(new DvdLibrary("The Omen", "1955", "4.0", "Lila Roberts", "Paramound", "Intense"));

		for (DvdLibrary element : dvdList) {
			System.out.println(element);
		}

	}

}

/*
 * Title Release date MPAA rating Director's name Studio User rating or note
 * (allows the user to enter additional information, e.g., "Good family movie")
 */

/* Output:
DvdLibrary [title=Moana, relDate=2000, rating=4.5, director=Mari Rui, studio=Paramound, notes=Great for kids]
DvdLibrary [title=Pinocchio, relDate=1975, rating=3.5, director=Rose Lee, studio=Studio42, notes=Great for kids]
DvdLibrary [title=The Omen, relDate=1955, rating=4.0, director=Lila Roberts, studio=Paramound, notes=Intense]
*/