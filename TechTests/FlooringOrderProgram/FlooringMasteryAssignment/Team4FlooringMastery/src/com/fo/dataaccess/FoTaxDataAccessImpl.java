package com.fo.dataaccess;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.Scanner;

import com.fo.dto.*;

public class FoTaxDataAccessImpl implements FoDataAccess {

	@Override
	public LinkedList<Tax> readObjects(String fileName) throws Exception {
		try {
			LinkedList<Tax> items = new LinkedList<Tax>();

			FileReader fileReader = new FileReader(fileName);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			Scanner scanner = new Scanner(bufferedReader);

			scanner.nextLine();

			while (scanner.hasNext()) {
				String tax[] = scanner.nextLine().split(",");

				Tax item = new Tax(tax[0], tax[1], new BigDecimal(tax[2]));

				items.add(item);
			}

			try {
				fileReader.close();
				bufferedReader.close();
				scanner.close();
			} catch (Exception ex) {
			}

			return items;
		} catch (FileNotFoundException ex) {
			throw ex;
		}
	}
}
