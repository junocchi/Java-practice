package com.vm.client;

import java.util.Scanner;

import com.vm.businessLogic.VmBusinessLogic;
import com.vm.storage.Item;
import com.vm.ui.*;

public class VendingMachine {

	public static void main(String[] args) {

		VmUserInterface vmUserInterface = new VmUserInterfaceImpl();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			vmUserInterface.showMenu();
			System.out.println("Enter 0 if you would like to cancel your purchase,");
			System.out.println("or insert cash if you would like to purchase an item.");
			double amount = scanner.nextDouble();
			if (amount > 0) {
				try {
					vmUserInterface.performMenu(amount);
				} catch (Exception e) {
					System.out.println("Something went wrong, please try again later.");
				}

			} else {
				System.out.println("Bye bye!");
				break;
			}
		}
	}
}

//Include an Audit DAO to log events and the time they occurred.