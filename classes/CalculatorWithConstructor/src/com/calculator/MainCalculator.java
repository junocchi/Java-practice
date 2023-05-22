package com.calculator;

public class MainCalculator {

	public static void main(String[] args) {
		Calculator calculator=new Calculator();
		
		int result = calculator.add(4, 7);
		System.out.println("The sum is: " + result);
		
		double result1 = calculator.add(4.3, 7.8);
		System.out.println("The sum is: " + result1);

	}

}
