package com.armstrong.or.not;

import java.util.Scanner;
import com.length.NumberLength;


public class ArmstrongOrNotMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int number=scanner.nextInt();
		
		ArmstrongOrNot armstrongOrNot=new ArmstrongOrNot();
		
		armstrongOrNot.setNumber(number);
		
		System.out.println("Is " +number+ " an Armstrong number? " +armstrongOrNot.isResult());
	}
}
