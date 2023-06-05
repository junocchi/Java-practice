package com.vm.dao;

import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Scanner;
import com.vm.storage.Item;

public class ItemDataAccessImpl implements ItemDataAccess {

	@Override
	public boolean writeRecords(LinkedList<Item> items) throws Exception {

		FileWriter fileWriter = new FileWriter("ItemsData");
		PrintWriter printWriter = new PrintWriter(fileWriter);

		for (Item item : items) {
			String empStr = item.getId() + "," + item.getName() + "," + item.getPrice() + "," + item.getQuantity();

			printWriter.println(empStr);
		}

		printWriter.flush();
		printWriter.close();
		fileWriter.close();
		return true;
	}

	@Override
	public LinkedList<Item> readRecords() throws Exception {
		LinkedList<Item> items = new LinkedList<Item>();

		FileReader fileReader = new FileReader("ItemsData");

		BufferedReader bufferedReader = new BufferedReader(fileReader);

		String currentLine;
		while ((currentLine = bufferedReader.readLine()) != null) {
			String[] values = currentLine.split(",");

			int id = Integer.parseInt(values[0]);
			String name = values[1];
			double price = Double.parseDouble(values[2]);
			int quantity = Integer.parseInt(values[3]);

			Item item = new Item(id, name, price, quantity);
			items.add(item);
		}

		fileReader.close();
		bufferedReader.close();

		return items;
	}

}