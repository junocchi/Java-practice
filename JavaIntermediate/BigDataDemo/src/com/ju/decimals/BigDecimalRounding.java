package com.ju.decimals;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalRounding {

	public static void main(String[] args) {
		
		BigDecimal obj = new BigDecimal("32.37");
	
		BigDecimal obj1 = obj.setScale(1,RoundingMode.CEILING);
		System.out.println(obj1.toString()); //32.4
		
		BigDecimal obj2 = new BigDecimal("45.37367");
		BigDecimal obj3 = obj2.divide(obj1, RoundingMode.HALF_UP);
		System.out.println(obj3.toString()); //1.40042
		
		BigDecimal obj4 = obj2.divide(obj1, 2, RoundingMode.HALF_UP);
		System.out.println(obj4.toString());//1.40
		
		//Create BigDecimal object
		BigDecimal bdValue1,bdValue2;
		
		double inta = 56893.54000004;
		double intb = 56453.54660006;
		
		inta = inta + intb;
		
		System.out.println(inta);//113347.0866001
		
		//Assigning value into BigDecimal object
		bdValue1 = new BigDecimal("56893.54000004");
		bdValue2 = new BigDecimal("56453.54660006");
		
		//Addition
		bdValue1 = bdValue1.add(bdValue2);
		bdValue1.toString();
		System.out.println(bdValue1);//113347.08660010
		
		
	}

}