package com.fo.service;

import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import com.fo.dataaccess.*;
import com.fo.dto.Order;
import com.fo.dto.Product;
import com.fo.dto.Tax;
import com.fo.utility.EntryNotFoundException;
import com.fo.dataaccess.FoDataAccess;
import com.fo.dataaccess.FoOrderDataAccessImpl;
import com.fo.dataaccess.FoProductDataAccessImpl;
import com.fo.dataaccess.FoTaxDataAccessImpl;
import com.fo.presentation.FoUserInterfaceImpl;
import com.fo.utility.InvalidDateException;
import com.fo.utility.InvalidInputException;
import com.fo.utility.NoOrdersFoundException;

public class FoBusinessLogicImpl implements FoBusinessLogic {

	private FoOrderDataAccessImpl dataAccess;
	private FoUserInterfaceImpl ui;
	private LinkedList<Product> products;
	private LinkedList<Tax> taxes;
	private LinkedList<Order> temporaryOrderStorage;
	private static LinkedList<Order> orders;
	private static LocalDate orderDate;
	private static int currentHighestNumber;

	public FoBusinessLogicImpl() {
		this.dataAccess = new FoOrderDataAccessImpl();
		FoDataAccess taxDataAccess = new FoTaxDataAccessImpl();
		FoDataAccess productDataAccess = new FoProductDataAccessImpl();
		this.ui = new FoUserInterfaceImpl();

		try {
			taxes = taxDataAccess.readObjects("Taxes.txt");
			products = productDataAccess.readObjects("Products.txt");
		} catch (FileNotFoundException ex) {
			System.out
					.println("Fatal error: data files could not be found. We apologise for any inconvinience caused.");
			System.exit(0);
		} catch (Exception ex) {
			System.out.println("Fatal error: unhandled error occured. We apologise for any inconvinience caused.");
			System.exit(0);
		}

		if (currentHighestNumber == 0)
			currentHighestNumber = getHighestOrderNumber();
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	private void setOrderDate(LocalDate date) {
		orderDate = date;
	}

	@Override
	public LinkedList<Order> getAllOrdersForDate(LocalDate date) throws FileNotFoundException {
		setOrderDate(date);
		String fileName = "Orders_" + date.format(DateTimeFormatter.ofPattern("MMddyyyy")) + ".txt";

		try {
			this.orders = dataAccess.readObjects(fileName);
			return this.orders;
		} catch (FileNotFoundException ex) {
			throw new FileNotFoundException("");
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return null;
	}

	@Override
	public Order createOrder(LocalDate date, String customerName, String state, String productType, BigDecimal area) {
		Optional<Tax> optional = taxes.stream().filter((t) -> t.getStateAbbreviation().equalsIgnoreCase(state))
				.findFirst();
		Tax tax = optional.get();

		Optional<Product> optional2 = products.stream().filter((p) -> p.getProductType().equalsIgnoreCase(productType))
				.findFirst();
		Product product = optional2.get();

		return calculateOrder(date, currentHighestNumber, customerName, tax, product, area);
	}

	public Order createOrder(int orderNumber, LocalDate date, String customerName, String state, String productType,
			BigDecimal area) {
		// CODE STARTS - Don't delete
		Optional<Tax> optional = taxes.stream().filter((t) -> t.getStateAbbreviation().equalsIgnoreCase(state))
				.findFirst();
		Tax tax = optional.get();

		Optional<Product> optional2 = products.stream().filter((p) -> p.getProductType().equalsIgnoreCase(productType))
				.findFirst();
		Product product = optional2.get();

		return calculateOrder(date, orderNumber, customerName, tax, product, area);

//		 CODE ENDS - Don't delete
	}

	@Override
	public boolean checkName(String name) throws InvalidInputException {
		if (name == null || name.isEmpty()) {
			return false;
		}

		if (!name.matches("[a-zA-Z\\s,]+")) {
			throw new InvalidInputException("Invalid characters in name: " + name);
		}
		return true;
	}

	@Override
	public boolean checkStateAbbreviation(String stateAbbreviation) throws EntryNotFoundException {
		if (stateAbbreviation.equals(""))
			return false;

		List<String> statesAbbreviationList = new LinkedList<String>();

		for (Tax aTax : taxes) {
			statesAbbreviationList.add(aTax.getStateAbbreviation());
		}

		for (String state : statesAbbreviationList) {
			if (state.equalsIgnoreCase(stateAbbreviation)) {
				return true;
			}
		}

		throw new EntryNotFoundException("Please enter a valid state's abbreviation.");
	}

	@Override
	public boolean checkArea(String area) throws InvalidInputException {
		if (area.equals(""))
			return false;

		try {
			BigDecimal areaBigDecimal = new BigDecimal(area);

			if (areaBigDecimal.compareTo(new BigDecimal("100")) != -1)
				return true;
			else
				throw new InvalidInputException("");

		} catch (Exception ex) {
			throw new InvalidInputException("");
		}
	}

	@Override
	public boolean checkDate(String date) throws InvalidDateException {
		try {
			LocalDate parsedDate = LocalDate.parse(date);
			LocalDate currentDate = LocalDate.now();

			return parsedDate.isAfter(currentDate);
		} catch (Exception e) {
			throw new InvalidDateException("Invalid date format: " + date);
		}
	}

	@Override
	public void placeOrder(Order order, LocalDate orderDate) {
		FoTrackerDataAccess foTrackerDataAccess = new FoTrackerDataAccess();
		if (orders != null) {
			this.orders.add(order);
			currentHighestNumber = currentHighestNumber + 1;
		} else {
			try {
				getAllOrdersForDate(orderDate);
				this.orders.add(order);
				currentHighestNumber = currentHighestNumber + 1;
			} catch (FileNotFoundException ex) {
				orders = new LinkedList<>();
				this.orders.add(order);
				setOrderDate(orderDate);
				currentHighestNumber = currentHighestNumber + 1;
			}
		}
	}

	@Override
	public Order calculateOrder(LocalDate orderDate, int orderNumber, String customerName, Tax tax, Product product,
			BigDecimal area) {
		BigDecimal materialCost = (area.multiply(product.getCostPerSquareFoot()));
		BigDecimal laborCost = (area.multiply(product.getLaborCostPerSquareFoot()));
		BigDecimal taxCost = (materialCost.add(laborCost)).multiply(tax.getTaxRate().divide(new BigDecimal(100))); // division

		// Calculate the order's Total price
		BigDecimal getTotal = materialCost.add(laborCost).add(taxCost).setScale(2, RoundingMode.HALF_UP);

		return new Order(orderNumber, customerName, tax.getStateAbbreviation(), tax.getTaxRate(),
				product.getProductType(), area, product.getCostPerSquareFoot(), product.getLaborCostPerSquareFoot(),
				materialCost, laborCost, taxCost, getTotal);
	}

	@Override
	public boolean checkProductType(String productType) throws EntryNotFoundException {
		LinkedList<Product> matches = new LinkedList<Product>();

//		for (Product product : products) {
//			if (productType.toLowerCase().contains(product.getProductType().toLowerCase())) {
//				matches.add(product);
//			} else if (matches.size() == 0) {
//				throw new EntryNotFoundException("No product with the inserted type exists");
//			}
//		}
//		return true;

		if (productType.equals(""))
			return false;

		for (Product product : products) {
			if (productType.toLowerCase().contains(product.getProductType().toLowerCase())) {
				matches.add(product);
			}
		}

		if (matches.size() == 0) {
			throw new EntryNotFoundException("");
		}
		return true;
	}

	@Override
	public Order getOrder(LocalDate date, int orderNumber) throws FileNotFoundException {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMddyyyy");
		String fileName = "Orders_" + date.format(formatter) + ".txt";

		try {
			LinkedList<Order> orders = dataAccess.readObjects(fileName);

			for (Order anOrder : orders) {
				if (anOrder.getOrderNumber() == orderNumber) {
					return anOrder;
				}
			}
		} catch (FileNotFoundException ex) {
			throw new FileNotFoundException("");
		} catch (Exception ex) {
			throw new FileNotFoundException("");
		}

		return null;
	}

	@Override
	public LinkedList<Order> editOrder(int orderNumber, Order order) {

		LinkedList<Order> newOrders = this.orders;
		int index = 0;
		for (Order anOrder : orders) {
			if (anOrder.getOrderNumber() == orderNumber) {
				index = newOrders.indexOf(anOrder);
			}
		}
		newOrders.set(index, order);
		return newOrders;
	}

	@Override
	public void removeOrder(Order order) throws NoOrdersFoundException {
		boolean status = false;

		for (Order currentOrder : orders) {
			if (currentOrder.getOrderNumber() == order.getOrderNumber()) {
				status = orders.remove(currentOrder);
				break;
			}
		}
		if (!status) {
			throw new NoOrdersFoundException("Order number " + order.getOrderNumber() + " not found.");
		}
	}

	@Override
	public void saveOrdersToAFile() throws NoOrdersFoundException {
		if (orders == null) {
			throw new NoOrdersFoundException("");
		} else {
			try {
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMddyyyy");
				String fileName = "Orders_" + orderDate.format(formatter) + ".txt";
				dataAccess.writeObject(orders, fileName);
				FoTrackerDataAccess foTrackerDataAccess = new FoTrackerDataAccess();
				foTrackerDataAccess.writeOrderNumberTracker(currentHighestNumber);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private int getHighestOrderNumber() {
		FoTrackerDataAccess foTrackerDataAccess = new FoTrackerDataAccess();
		return foTrackerDataAccess.readOrderNumberTracker();
	}

	@Override // stretch goal
	public void exportData() {
		// CODE STARTS - Don't delete

		// CODE ENDS - Don't delete
	}

}