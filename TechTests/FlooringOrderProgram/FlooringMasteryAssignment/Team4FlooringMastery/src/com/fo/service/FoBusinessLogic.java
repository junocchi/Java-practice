package com.fo.service;

import com.fo.dto.Order;
import com.fo.dto.Product;
import com.fo.dto.Tax;
import com.fo.utility.EntryNotFoundException;
import com.fo.utility.InvalidDateException;
import com.fo.utility.InvalidInputException;
import com.fo.utility.NoOrdersFoundException;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.LinkedList;

public interface FoBusinessLogic {

	public LinkedList<Order> getAllOrdersForDate(LocalDate date) throws FileNotFoundException;
	public Order createOrder(LocalDate orderDate, String customerName, String state, String productType, BigDecimal area);
	public boolean checkName(String name) throws InvalidInputException;
	public boolean checkStateAbbreviation(String stateAbbreviation) throws EntryNotFoundException;
	public boolean checkProductType(String productType) throws EntryNotFoundException;
	public boolean checkArea(String area) throws InvalidInputException;
	public boolean checkDate(String date) throws InvalidDateException;
	public void placeOrder(Order order, LocalDate orderDate);
	public Order calculateOrder(LocalDate orderDate, int orderNumber, String customerName, Tax tax, Product product, BigDecimal area);
	public Order getOrder(LocalDate date,int orderNumber) throws FileNotFoundException;
	public LinkedList<Order> editOrder(int orderNumber, Order order);
	public void removeOrder(Order order) throws NoOrdersFoundException;
	public void saveOrdersToAFile() throws NoOrdersFoundException;
	
	public void exportData(); // stretch goal
	
}
