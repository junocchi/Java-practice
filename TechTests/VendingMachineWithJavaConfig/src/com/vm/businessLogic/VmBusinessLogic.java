package com.vm.businessLogic;

import java.math.BigDecimal;

import java.util.LinkedList;

import com.vm.storage.Item;

public interface VmBusinessLogic {

	public void createInitialItems();

	// Get all items
	LinkedList<Item> getAllItems();

	// Calculate return change in coins using class Change
	public static Change getChangeInCoins(BigDecimal amount, BigDecimal itemPrice) {
		return null;
	}

	public void saveAllItems();

	public void updateInventory();

	public void updateAudit();

}
