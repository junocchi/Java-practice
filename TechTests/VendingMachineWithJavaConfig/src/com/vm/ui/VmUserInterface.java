package com.vm.ui;

public interface VmUserInterface {
	public void showMenu();
	
	public void performMenu(double amount) throws Exception;
	
	public void displayAmount(double amount);
	
	public void displayChangeInCoins(double amount, double itemPrice);

}
