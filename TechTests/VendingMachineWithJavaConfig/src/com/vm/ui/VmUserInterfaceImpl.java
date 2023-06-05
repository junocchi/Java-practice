package com.vm.ui;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.Scanner;
import com.vm.storage.Item;
import com.vm.businessLogic.*;

public class VmUserInterfaceImpl implements VmUserInterface {

	// VmBusinessLogic businessLogic = new VmBusinessLogicImpl();

	private VmBusinessLogic businessLogic;

	public VmUserInterfaceImpl(VmBusinessLogic businessLogic) {
		super();
		this.businessLogic = businessLogic;
	}

	private Item item;

	public VmUserInterfaceImpl(Item item) {
		super();
		this.item = item;
	}

	@Override
	public void showMenu() {
		System.out.println("These are the items we have available today:");

		LinkedList<Item> items = businessLogic.getAllItems();
		if (items.isEmpty()) {
			businessLogic.createInitialItems();
			items = businessLogic.getAllItems();
		}

		// loop through items and display all available items
		for (Item item : items) {
			if (item.getQuantity() > 0)
				System.out.println(item.getId() + " for: " + item.getName() + "- Price: $" + item.getPrice());
		}
		System.out.println("=====================================");

	}

	@Override
	public void displayAmount(double amount) {
		System.out.println("You have $ " + amount + " available.");
	}

	@Override
	public void performMenu(double amount) throws Exception {
		// get and display amount
		Scanner scanner = new Scanner(System.in);
		displayAmount(amount);

		// select item
		System.out.println("Select the number of the item that you would like to purchase");
		int choice = scanner.nextInt();

		// get all items, find item with the matching id and update inventory
		// (ItemsData)
		LinkedList<Item> items = businessLogic.getAllItems();
		Item selected = null;
		for (Item item : items) {
			if (item.getId() == choice) {
				selected = item;
				int updatedQuantity = item.getQuantity() - 1;
				item.setQuantity(updatedQuantity);
				businessLogic.saveAllItems();
				businessLogic.updateAudit();
				break;
			}
		}

		// get item's price, input amount, calculate change and display it in coins
		if (selected != null) {
			double itemPrice = selected.getPrice();
			if (amount <= itemPrice) {
				System.out.println("Insuficient Funds!");
			}
			// add updateInventoryItemsData
			displayChangeInCoins(amount, itemPrice);

		}

	}

	@Override
	public void displayChangeInCoins(double amount, double itemPrice) {
		VmBusinessLogicImpl businessLogic = new VmBusinessLogicImpl();
		// System.out.println("Please, colect your change:");
		Change change = businessLogic.getChange(amount, itemPrice);
		System.out.println(change);

	}

}
