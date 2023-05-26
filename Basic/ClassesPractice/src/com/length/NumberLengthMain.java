package com.length;

import java.util.Scanner;

public class NumberLengthMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		NumberLength numberLength=new NumberLength();
		
		System.out.println("Enter number: ");
		int number=scanner.nextInt();
		
		numberLength.setNumber(number);
		System.out.println("The length of "+number+ " = " +numberLength.getNumberLength());
	}

}
