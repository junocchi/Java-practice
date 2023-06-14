package com.fo.dataaccess;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FoTrackerDataAccess {

	public int readOrderNumberTracker() {
		int highestOrderNumber = 0;
		try {
			FileReader fileReader = new FileReader("OrderNumberTracker");
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			Scanner scanner = new Scanner(bufferedReader);

			highestOrderNumber = scanner.nextInt();
		} catch (Exception ex) {
		}

		return highestOrderNumber;
	}

	public void writeOrderNumberTracker(int currentHighestOrder) {
		try {
			File trackerFile = new File("OrderNumberTracker");
			trackerFile.createNewFile();
			FileWriter fileWriter = new FileWriter(trackerFile);
			PrintWriter printWriter = new PrintWriter(fileWriter);
			
			printWriter.println(currentHighestOrder);
			
			printWriter.flush();
			printWriter.close();
		} catch (IOException ex) {
			System.out.println("error writeOrderNumberTracker");
		}

	}

}
