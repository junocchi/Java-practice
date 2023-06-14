package com.fo.dataaccess;

import java.util.LinkedList;

import java.io.FileReader;
import java.math.BigDecimal;
import com.fo.dto.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FoProductDataAccessImpl implements FoDataAccess {

	@Override
	public LinkedList<Product> readObjects(String filename) throws Exception {
		LinkedList<Product> products = new LinkedList<>();

		try {
			FileReader fileReader = new FileReader(filename);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			Scanner scanner = new Scanner(bufferedReader);

			scanner.nextLine();

			while (scanner.hasNext()) {
				String currentLine = scanner.nextLine();
				String[] values = currentLine.split(",");

				Product value = new Product(values[0], new BigDecimal(values[1]), new BigDecimal(values[2]));

				products.add(value);
			}

			try {
				fileReader.close();
				bufferedReader.close();
				scanner.close();
			} catch (Exception ex) {
			}

		} catch (FileNotFoundException e) {
			throw new FileNotFoundException("File not found: " + filename);
		}

		return products;
	}

}
