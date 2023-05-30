package com.ju.menu;

public enum Menu {
	
	CHICKENCURRY(false, 650, 9.50), JACKFRUITBIRYANI(true, 580, 12.90), FISHANDCHIPS(false, 1250, 18.50);
	
	private boolean vegetarianOrNot;
	private int kcal;
	private double price;
	
	private Menu(boolean vegetarianOrNot, int kcal, double price) {
		this.vegetarianOrNot = vegetarianOrNot;
		this.kcal = kcal;
		this.price = price;
	}
	public boolean isVegetarianOrNot() {
		return vegetarianOrNot;
	}
	public int getKcal() {
		return kcal;
	}
	public double getPrice() {
		return price;
	}

}
