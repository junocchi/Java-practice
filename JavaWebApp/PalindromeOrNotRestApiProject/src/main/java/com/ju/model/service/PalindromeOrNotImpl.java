package com.ju.model.service;

import org.springframework.stereotype.Service;

@Service
public class PalindromeOrNotImpl implements PalindromeOrNot {

	@Override
	public boolean isPalindrome(int number) {
		int reversedNumber = 0;
		int originalNumber = number;

		while (number > 0) {
			int digit = number % 10;
			reversedNumber = reversedNumber * 10 + digit;
			number /= 10;
		}

		if (originalNumber == reversedNumber) {
			return true;
		} else {
			return false;
		}

	}

}
