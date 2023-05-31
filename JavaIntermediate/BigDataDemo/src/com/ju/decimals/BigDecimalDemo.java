package com.ju.decimals;
import java.math.BigDecimal;

public class BigDecimalDemo {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigDecimal bdValue1, bdValue2, three, five;
		
		bdValue1 = new BigDecimal("56893.54000004");
		bdValue2 = new BigDecimal("56453.54660006");
		three = new BigDecimal("3");
		five = new BigDecimal("5");
		
		//Addition
		bdValue1 = bdValue1.add(bdValue2);
		System.out.println(bdValue1);
		
		// value1 is equal to value2?
		if (bdValue1.equals(bdValue2)) {
			System.out.println("The values are equal!");
		}  else {
			System.out.println("The values are not equal!");
		}
		
		// syntax to check if value1 is greater than value2(113347.08660010)?
		if (bdValue1.compareTo(bdValue2) > 0) {
			System.out.println(bdValue1 + " value1 is greater than " + bdValue2);
		}  else {
			System.out.println(bdValue2 + " value2 is greater than " + bdValue1);
		}
		
	}

}
//For primitive double
//if (a < b) {}         
//For BigDecimal
//if (A.compareTo(B) < 0)  {} 
//Actually compareTo returns -1(less than), 0(Equal), 1(greater than) according to values.
//For equality we can also use:
// A is equal to B
//if (A.equals(B)) {}  