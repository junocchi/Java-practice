package com.ju.factorial;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class PrintFactorial {

	private Scanner scanner;
	private PrintStream printStream;
	private int num;

	public PrintFactorial(InputStream inputStream, PrintStream printStream) {
		this.scanner = new Scanner(inputStream);
		this.printStream = printStream;
	}

	public int isInputNumberValid() {

		/*
		 * - Update this method to accept a number from the user and store the value in
		 * an instance variable `num`. - Use an instance variable `scanner` to accept
		 * the input from the user.
		 * 
		 * - If the input value is valid, return the number input by the user (NOT the
		 * factorial of the number).
		 * 
		 * - In case of invalid input: - Print the following message to the console:
		 * "Invalid entry. Please enter an integer between 1 and 10, inclusive." - Use
		 * `this.printStream.print()` and NOT `System.out.println()` to print to the
		 * console. - Return -1
		 * 
		 * - All code should be inside the placeholders below.
		 */

		// YOUR CODE STARTS HERE
		try {
			num = scanner.nextInt();
			if (num > 0 && num <= 10) {
				return num;

			} else {
				this.printStream.print("Invalid entry. Please enter an integer between 1 and 10, inclusive.");
				return -1;
			}

		} catch (Exception ex) {
			this.printStream.print("Invalid entry. Please enter an integer between 1 and 10, inclusive.");

			return -1;
		}
		// YOUR CODE ENDS HERE

	}

	private void calculateFactorial(int num) {

		/*
		 * Use this method to calculate the factorial of the number input by the user.
		 * 
		 * - All code should be inside the placeholders below.
		 */

		int result = 1;
		// YOUR CODE STARTS HERE
		int counter = 1;

		for (; counter <= num; counter++) {
			result = result * counter;
		}
		// YOUR CODE ENDS HERE
		this.printStream.print("The Factorial is: " + result);

	}

	public void calculateFactorial() {
		/*
		 * Do not change this method.
		 */

		int input = this.isInputNumberValid();
		if (input != -1) {
			calculateFactorial(input);
		}

	}

	public static void main(String[] args) {
		/*
		 * Do not change this method.
		 */
		PrintFactorial fact = new PrintFactorial(System.in, System.out);
		System.out.println("Enter an integer between 1 and 10, inclusive.");
		fact.calculateFactorial();
	}
}