package com.ju.menu;

public class EnumMenuMain {

	public static void main(String[] args) {
		Menu menu;
		
		menu=Menu.CHICKENCURRY;
		
		System.out.println("Customer ordered " +menu+ " , vegetarian: " +menu.isVegetarianOrNot()+ " , and total kcal: " +menu.getKcal()+ ". Please, pay £" +menu.getPrice()+ ".");

		menu=Menu.JACKFRUITBIRYANI;
		
		System.out.println("Customer ordered " +menu+ " , vegetarian: " +menu.isVegetarianOrNot()+ " , and total kcal: " +menu.getKcal()+ ". Please, pay £" +menu.getPrice()+ ".");

	}

}
