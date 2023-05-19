/*
 * A program that takes in height 
 * in foot and inches, then add 
 * them together. If the user 
 * inputs inches over 11 the program 
 * must correct the height 
 * so 5ft 12 would become 6ft.
 */


package com.juliana.height.calculator;
import java.util.Scanner;

public class HeightCalculatorMain {

	public static void main(String[] args) {
		
		HeightCalculator heightCalculator = new HeightCalculator();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number in feet: ");
		int ftNum = scanner.nextInt();
		
		System.out.println("Enter number in inches: ");
		int inchNum = scanner.nextInt();
		
		heightCalculator.sum(ftNum, inchNum);
		int totalFt = heightCalculator.getTotalFt();
		int totalInches = heightCalculator.getTotalInches();
		
		System.out.println("Height is: "+totalFt+ "." + totalInches);

	}

}

/* Output:
 * Enter number in feet: 
 * 5
 * Enter number in inches:
 * 30
 * Height is: 7.6
 */
