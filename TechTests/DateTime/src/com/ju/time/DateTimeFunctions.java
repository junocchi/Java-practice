package com.ju.time;

import java.time.*;

public class DateTimeFunctions {

	public static LocalDate getTodaysDate() {
		// YOUR CODE STARTS HERE
		LocalDate localDate = LocalDate.now();

		return localDate;
		// YOUR CODE ENDS HERE

	}

	/*
	 * Implement the method so that it returns the date x days after the input date.
	 */
	public static LocalDate getLaterDatebyDays(LocalDate date, int x) {
		// YOUR CODE STARTS HERE
		LocalDate laterDate = date.plusDays(x);

		return laterDate;
		// YOUR CODE ENDS HERE

	}

	/*
	 * Implement the method so that it returns the date x weeks prior to the input
	 * date.
	 */
	public static LocalDate getPreviousDatebyWeeks(LocalDate date, int x) {
		// YOUR CODE STARTS HERE
		LocalDate newDate = date.minusWeeks(x);

		return newDate;
		// YOUR CODE ENDS HERE

	}

	/*
	 * Implement the method so that it returns the time difference between two input
	 * dates in terms of years, months, and days. Return the String in the format:
	 * "Year-20:Months-5:Days-1"
	 */
	public static String getTimeDifference(LocalDate date1, LocalDate date2) {
		// YOUR CODE STARTS HERE
		Period p = Period.between(date1, date2);
		int years = p.getYears();
		int months = p.getMonths();
		int days = p.getDays();
		String str = "Years-" + years + ":" + "Months-" + months + ":" + "Days-" + days;

		return str;
		// YOUR CODE ENDS HERE

	}

	public static void main(String[] args) {
		System.out.println("Today's date is: " + getTodaysDate());
		System.out.println("14 days from today is: " + getLaterDatebyDays(getTodaysDate(), 14));
		System.out.println("5 weeks prior to today was: " + getPreviousDatebyWeeks(getTodaysDate(), 5));
		System.out.println("The difference between today " + "and June 30, 2031 is: "
				+ getTimeDifference(getTodaysDate(), LocalDate.of(2031, 06, 30)));
	}
}
