package com.fo.dataaccess;

import java.util.LinkedList;

import com.fo.dto.Order;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.io.BufferedReader;
import java.util.Scanner;

public class FoOrderDataAccessImpl implements FoDataAccess {

	@Override
	public LinkedList<Order> readObjects(String FileName) throws Exception {
		LinkedList<Order> orders = new LinkedList<Order>();

		FileReader fileReader = new FileReader(FileName);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		Scanner scanner = new Scanner(bufferedReader);

		scanner.nextLine();

		while (scanner.hasNext()) {
			String currentLine = scanner.nextLine();

			String values[] = currentLine.split(",");

			Order order = new Order(Integer.parseInt(values[0]), values[1], values[2], new BigDecimal(values[3]),
					values[4], new BigDecimal(values[5]), new BigDecimal(values[6]), new BigDecimal(values[7]),
					new BigDecimal(values[8]), new BigDecimal(values[9]), new BigDecimal(values[10]),
					new BigDecimal(values[11]));

			orders.add(order);
		}
		try {
			fileReader.close();
			bufferedReader.close();
			scanner.close();
		} catch (Exception ex) {
			throw ex;
		}
		
		return orders;
	}

	public boolean writeObject(LinkedList<Order> orders, String FileName) throws Exception {
		FileWriter fileWriter = null;

		try {
			fileWriter = new FileWriter(FileName);
		} catch (IOException e) {
			throw e;
		}

		PrintWriter printWriter = new PrintWriter(fileWriter);
		printWriter.println(
				"OrderNumber,CustomerName,State,TaxRate,ProductType,Area,CostPerSquareFoot,LaborCostPerSquareFoot,MaterialCost,LaborCost,Tax,Total");

		for (Order order : orders) {
			String ordStr = order.getOrderNumber() + "," + order.getCustomerName() + "," + order.getState() + ","
					+ order.getTaxRate() + "," + order.getProductType() + "," + order.getArea() + ","
					+ order.getCostPerSquareFoot() + "," + order.getLaborCostperSquareFoot() + ","
					+ order.getMaterialCost() + "," + order.getLaborCost() + "," + order.getTax() + ","
					+ order.getTotal();

			printWriter.println(ordStr);
		}

		printWriter.flush();
		printWriter.close();

		try {
			fileWriter.close();
		} catch (IOException e) {
			throw e;
		}
		return true;
	}

}
