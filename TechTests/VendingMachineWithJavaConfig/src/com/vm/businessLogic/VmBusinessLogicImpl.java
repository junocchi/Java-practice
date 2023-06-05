package com.vm.businessLogic;

import java.math.BigDecimal;

import java.util.LinkedList;

import com.vm.dao.*;
import com.vm.storage.Item;

public class VmBusinessLogicImpl implements VmBusinessLogic {

	private ItemDataAccess dataAccess;
	

	public VmBusinessLogicImpl(ItemDataAccess dataAccess) {
		super();
		this.dataAccess = dataAccess;
	}

	private LinkedList<Item> itemList;

	public VmBusinessLogicImpl() {
		try {
			itemList = ItemDataAccessImpl.readRecords();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public LinkedList<Item> getAllItems() {
		return itemList;
	}

	public Change getChange(double amount, double itemPrice) {
		return new Change(new BigDecimal(amount), new BigDecimal(itemPrice));
	}

	@Override
	public void updateInventory() {
		// TODO Auto-generated method stub

	}
	@Override
	public void createInitialItems() {
		LinkedList<Item> items = new LinkedList<Item>();
		items.add(new Item(1, "Sprite", 1.50, 10));
		items.add(new Item(2, "Water", 1.00, 15));
		items.add(new Item(3, "Crisps", 1.25, 12));
		items.add(new Item(4, "Chocolate Bar", 1.75, 8));
		items.add(new Item(5, "Granola Bar", 1.50, 0));
		items.add(new Item(6, "Nuts", 2.00, 7));
		items.add(new Item(7, "Banana", 1.25, 15));
		items.add(new Item(8, "Pretzels", 1.50, 10));
		items.add(new Item(9, "Apple", 2.25, 5));
		items.add(new Item(10, "Energy Drink", 2.50, 6));
		items.add(new Item(11, "Cookies", 1.59, 10));
		items.add(new Item(12, "Instant Noodles", 2.00, 7));
		items.add(new Item(13, "Popcorn", 1.28, 15));
		items.add(new Item(14, "Protein Bar", 2.25, 5));
		items.add(new Item(15, "Dried Fruits", 0.75, 20));
		try {
			dataAccess.writeRecords(items);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void updateAudit() {
		AuditDAO auditDAO = new AuditDAO();
		auditDAO.logEvent("An item was purchased.");
		auditDAO.close();
		
	}
	
	public void saveAllItems() {
		try {
			dataAccess.writeRecords(itemList);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
