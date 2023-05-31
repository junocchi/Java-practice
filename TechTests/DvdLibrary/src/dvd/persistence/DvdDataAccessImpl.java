package com.dvd.persistence;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Scanner;

import com.dvd.dto.Dvd;

public class DvdDataAccessImpl implements DvdDataAccess {

	@Override
	public boolean writeRecords(LinkedList<Dvd> dvds) throws Exception {
		
		//LinkedList<Dvd> dvds = new LinkedList<Dvd>();

		dvds.add(new Dvd("Wonder Woman", "June 2, 2017", "PG-13", "Patty Jenkins", "Warner Bros. Pictures", "-"));
		dvds.add(new Dvd("Black Widow", "July 9, 2021", "PG-13", "Cate Shortland", "Marvel Studios", "-"));
		dvds.add(new Dvd("Mad Max: Fury Road", "May 15, 2015", "R", "George Miller", "Warner Bros. Pictures", "-"));
		dvds.add(new Dvd("Little Women", "December 25, 2019", "PG", "Greta Gerwig", "Columbia Pictures", "-"));
		dvds.add(new Dvd("Kill Bill: Volume 1", "October 10, 2003", "R", "Quentin Tarantino", "Miramax Films", "-"));
		dvds.add(new Dvd("Erin Brockovich", "March 17, 2000", "R", "Steven Soderbergh", "Universal Pictures", "-"));
		dvds.add(new Dvd("Mulan", "September 4, 2020", "PG-13", "Niki Caro", "Walt Disney Pictures", "-"));

		
		FileWriter fileWriter = new FileWriter("DvdsData");
		PrintWriter printWriter = new PrintWriter(fileWriter);

		for (Dvd dvd : dvds) {
			String empStr = dvd.getTitle() + "," + dvd.getReleaseDate() + "," + dvd.getRatingMPAA() + ","
					+ dvd.getStudio() + "," + dvd.getNotes();

			printWriter.println(empStr);
		}

		printWriter.flush();
		printWriter.close();
		fileWriter.close();
		return true;
	}

	@Override
	public LinkedList<Dvd> readRecords() throws Exception {
		LinkedList<Dvd> dvds = new LinkedList<Dvd>();

		FileReader fileReader = new FileReader("DvdsData");

		BufferedReader bufferedReader = new BufferedReader(fileReader);

		Scanner scanner = new Scanner(bufferedReader);

		while (scanner.hasNext()) {
			String currentLine = scanner.nextLine();
			String values[] = currentLine.split(",");

			Dvd dvd = new Dvd((values[0]), (values[1]), (values[2]), (values[3]), (values[4]), (values[5]));
			dvds.add(dvd);
		}
		fileReader.close();
		bufferedReader.close();

		return dvds;
	}

}
