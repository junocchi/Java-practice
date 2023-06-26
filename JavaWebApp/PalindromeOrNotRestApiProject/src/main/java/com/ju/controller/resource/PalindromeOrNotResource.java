package com.ju.controller.resource;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ju.model.service.PalindromeOrNot;

@RestController
public class PalindromeOrNotResource {

	@Autowired
	private PalindromeOrNot palindromeOrNot;

	@GetMapping(path = "/palindrome/{number}")
	public boolean isPalindrome(@PathVariable("number") int number) {
		return palindromeOrNot.isPalindrome(number);
	}

}
