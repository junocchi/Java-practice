package com.fo.presentation;

import com.fo.dto.Order;
import com.fo.service.*;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

import com.fo.utility.EntryNotFoundException;
import com.fo.utility.InvalidDateException;
import com.fo.utility.InvalidInputException;
import com.fo.utility.NoOrdersFoundException;

public class FoUserInterfaceImpl implements FoUserInterface {
	private FoBusinessLogicImpl foBusinessLogic;

	@Override
	public void showMenu() {
		System.out.println("------------------------------------");
		System.out.println("\t1. Display Orders");
		System.out.println("\t2. Add an Order");
		System.out.println("\t3. Edit an Order");
		System.out.println("\t4. Remove an Order");
		System.out.println("\t5. Export data");
		System.out.println("\t6. Quit");
		System.out.println("------------------------------------");
	}

	@Override
	public void performMenu(String choice) {
		foBusinessLogic = new FoBusinessLogicImpl();
		Scanner scanner = new Scanner(System.in);
		switch (choice) {

		// 1 - DISPLAY ORDERS
		case "1":
			System.out.println("Which date would you like the orders for? (YYYY-MM-DD)");
			String dateString = scanner.nextLine();

			try {
				foBusinessLogic.checkDate(dateString);
				LocalDate date = LocalDate.parse(dateString);
				System.out.println(foBusinessLogic.getAllOrdersForDate(date));
			} catch (InvalidDateException ex) {
				System.out.println("Invalid date format. Please enter date as YYYY-MM-DD.");
			} catch (FileNotFoundException ex) {
				System.out.println("No orders found for the given date.");
			}

			break;

		// 2 - ADD ORDER
		case "2":
			boolean test = false;
			String date;
			do {
				System.out.println("Enter order date (YYYY-MM-DD):");
				date = scanner.nextLine();

				try {
					test = foBusinessLogic.checkDate(date);
				} catch (InvalidDateException ex) {
					System.out.println("Invalid date format. Please enter date as YYYY-MM-DD.\n");
					continue;
				}

				if (test == false)
					System.out.println("Invalid input. Please provide a future date.\n");
			} while (test == false);

			test = false;
			String name;
			do {
				System.out.println("Enter your name:");
				name = scanner.nextLine();

				try {
					test = foBusinessLogic.checkName(name);
				} catch (InvalidInputException ex) {
					System.out.println("Invalid input. Name can only contain numbers, letters, commas and periods.\n");
					continue;
				}

				if (test == false)
					System.out.println("Name cannot be blank.\n");
			} while (test == false);

			test = false;
			String state;
			do {
				System.out.println("Enter state abbreviation:");
				state = scanner.nextLine();

				try {
					test = foBusinessLogic.checkStateAbbreviation(state);
				} catch (EntryNotFoundException ex) {
					System.out.println("The state you entered is invalid.\n");
					continue;
				}

				if (test == false)
					System.out.println("State cannot be blank.\n");
			} while (test == false);

			test = false;
			String product;
			do {
				// show list of products
				System.out.println("Enter product name:");
				product = scanner.nextLine();

				try {
					test = foBusinessLogic.checkProductType(product);
				} catch (EntryNotFoundException ex) {
					System.out.println("Invalid input. Please choose one of the options above.\n");
					continue;
				}

				if (test == false)
					System.out.println("Product name cannot be blank. Please choose one of the options above.\n");
			} while (test == false);

			test = false;
			String area;
			do {
				System.out.println("Enter the area of flooring you desire:");
				area = scanner.nextLine();

				try {
					test = foBusinessLogic.checkArea(area);
				} catch (InvalidInputException ex) {
					System.out.println("Invalid input. Area must be a positive integer larger than 100.\n");
					continue;
				}

				if (test == false)
					System.out.println("Area cannot be blank.\n");
			} while (test == false);

			LocalDate setDate = LocalDate.parse(date);

			Order order = foBusinessLogic.createOrder(setDate, name, state, product, new BigDecimal(area));

			System.out.println("\nHere is your order summary:");

			System.out.println("=============================");
			System.out.println("Order Date: \t" + setDate);
			System.out.println("Customer Name: \t" + order.getCustomerName());
			System.out.println("State: \t\t" + order.getState());
			System.out.println("Product Type: \t" + order.getProductType());
			System.out.println("Area: \t\t" + order.getArea() + " sq feet");
			System.out.println("Material cost: \t" + order.getMaterialCost().setScale(2, RoundingMode.HALF_UP));
			System.out.println("Labor cost: \t" + order.getLaborCost().setScale(2, RoundingMode.HALF_UP));
			System.out.println("Tax: \t\t" + order.getTax().setScale(2, RoundingMode.HALF_UP));
			System.out.println("Total Price: \t" + order.getTotal());
			System.out.println("=============================");

			System.out.println("\nPlace the order? (Y/N):");
			String placeOrderAnswer = scanner.nextLine();

			if (placeOrderAnswer.equalsIgnoreCase("Y")) {
				foBusinessLogic.placeOrder(order, setDate);
				System.out.println("Order data saved. Don't forget to export data before quitting.");
			} else {
				System.out.println("Order not placed. Returning to the main menu.");
			}

			break;

		// 3 - EDIT EXISTING ORDER
		case "3":
			String dateToEditString;
			test = false;

			do {
				System.out.println("Enter the order's date(YYYY-MM-DD):");
				dateToEditString = scanner.nextLine();

				try {
					foBusinessLogic.checkDate(dateToEditString);
					test = true;
				} catch (InvalidDateException ex) {
					System.out.println("Invalid date format. Please enter date as YYYY-MM-DD.\n");
					continue;
				}
			} while (test == false);

			System.out.println("Enter the order number:");
			String orderNumberToEdit = scanner.nextLine();

			Order orderToEdit;
			try {
				orderToEdit = foBusinessLogic.getOrder(LocalDate.parse(dateToEditString),
						Integer.parseInt(orderNumberToEdit));
				foBusinessLogic.getAllOrdersForDate(LocalDate.parse(dateToEditString));
			} catch (FileNotFoundException e) {
				System.out.println("No orders match date and order number. Returning to menu.");
				break;
			} catch (NumberFormatException ex) {
				System.out.println("Order number does not exist. Returning to menu.");
				break;
			}

			if (orderToEdit == null) {
				System.out.println("No orders match date and order number. Returning to menu.");
				break;
			}

//			Edit name
			test = false;
			do {
				System.out.println("Enter customer name (" + orderToEdit.getCustomerName() + "):");
				name = scanner.nextLine();
				try {
					if (foBusinessLogic.checkName(name))
						orderToEdit.setCustomerName(name);
					test = true;
				} catch (InvalidInputException ex) {
					System.out.println("Invalid input. Name can only contain numbers, letters, commas and periods.\n");
					continue;
				}
			} while (test == false);

//			Edit state
			test = false;
			do {
				System.out.println("Enter state abbreviation (" + orderToEdit.getState() + "):");
				state = scanner.nextLine();
				try {
					if (foBusinessLogic.checkStateAbbreviation(state))
						orderToEdit.setState(state);
					test = true;
				} catch (EntryNotFoundException ex) {
					System.out.println("The state you entered is invalid.\n");
					continue;
				}
			} while (test == false);

//			Edit product
			test = false;
			do {
				System.out.println("Enter product (" + orderToEdit.getProductType() + "):");
				product = scanner.nextLine();
				try {
					if (foBusinessLogic.checkProductType(product))
						orderToEdit.setProductType(product);
					test = true;
				} catch (EntryNotFoundException ex) {
					System.out.println("Invalid input. Please choose one of the options above.\n");
					continue;
				}
			} while (test == false);

//			Edit area
			test = false;
			do {
				System.out.println("Enter area (" + orderToEdit.getArea() + "):");
				area = scanner.nextLine();
				try {
					if (foBusinessLogic.checkArea(area))
						orderToEdit.setArea(new BigDecimal(area));
					test = true;
				} catch (InvalidInputException ex) {
					System.out.println("Invalid input. Area must be a positive integer larger than 100.\n");
					continue;
				}
			} while (test == false);

			orderToEdit = foBusinessLogic.createOrder(orderToEdit.getOrderNumber(), LocalDate.parse(dateToEditString),
					orderToEdit.getCustomerName(), orderToEdit.getState(), orderToEdit.getProductType(),
					orderToEdit.getArea());

			System.out.println("\nHere is your order summary:");

			System.out.println("=============================");
			System.out.println("Order Date: \t" + dateToEditString);
			System.out.println("Customer Name: \t" + orderToEdit.getCustomerName());
			System.out.println("State: \t\t" + orderToEdit.getState());
			System.out.println("Product Type: \t" + orderToEdit.getProductType());
			System.out.println("Area: \t\t" + orderToEdit.getArea() + " sq feet");
			System.out.println("Material cost: \t" + orderToEdit.getMaterialCost().setScale(2, RoundingMode.HALF_UP));
			System.out.println("Labor cost: \t" + orderToEdit.getLaborCost().setScale(2, RoundingMode.HALF_UP));
			System.out.println("Tax: \t\t" + orderToEdit.getTax().setScale(2, RoundingMode.HALF_UP));
			System.out.println("Total Price: \t" + orderToEdit.getTotal());
			System.out.println("=============================");

			System.out.println("\nSave changes? (Y/N):");
			placeOrderAnswer = scanner.nextLine();

			if (placeOrderAnswer.equalsIgnoreCase("Y")) {
				foBusinessLogic.editOrder(orderToEdit.getOrderNumber(), orderToEdit);
//				foBusinessLogic.saveOrdersToAFile();
				System.out.println("Changes saved. Don't forget to export data before quitting.");
			} else {
				System.out.println("Changes were not saved. Returning to the main menu.");
			}

			break;

		// 4 - REMOVE ORDER
		case "4":
			System.out.println("Enter order date (YYYY-MM-DD):");
			String dateToCheck = scanner.nextLine();
			System.out.println("Enter the order number that you want to remove:");
			int orderToCheck = scanner.nextInt();

			try {
				foBusinessLogic.checkDate(dateToCheck);
			} catch (Exception InvalidDate) {

				System.out.println("You have entered an invalid date");
				break;
			}

			LocalDate localDate = LocalDate.parse(dateToCheck);
			
			DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("MMddyyyy");
			String formattedDateToBeRemoved = localDate.format(dateTimeFormatter2);

			try {
				Order orderToRemove = foBusinessLogic.getOrder(localDate, orderToCheck);
				if (orderToRemove == null) {
					System.out.println("You have entered an invalid order number");

				} else {

					String fileName = "Orders_" + formattedDateToBeRemoved + ".txt";
					foBusinessLogic.removeOrder(orderToRemove);
					System.out.println("Order successfully removed.");
				}
			} catch (NoOrdersFoundException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}

			break;

		// 5 - SAVE ORDER TO A FILE
		case "5":
			try {
				foBusinessLogic.saveOrdersToAFile();
				System.out.println("Your data has been stored");
			} catch (NoOrdersFoundException ex) {
				System.out.println("Operation failed. No data to export.\nReturning to menu.");
			}
			break;

		// 6 - QUIT APPLICATION
		case "6":
			System.out.println("Thanks you for your purchase, we look forward to seeing you again!");
			System.exit(0);

			// INVALID choice
		default:
			System.out.println("Invalid Choice. Please pick a menu item.");
		}
	}
}
