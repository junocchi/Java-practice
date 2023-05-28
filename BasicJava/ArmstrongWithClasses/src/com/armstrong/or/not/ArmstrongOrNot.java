package com.armstrong.or.not;

import com.length.NumberLength;
public class ArmstrongOrNot {

	private boolean result;
	private int  number=0;
	
	
	public boolean isResult() {
		checkArmstrongOrNot();
		return result;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	private boolean checkArmstrongOrNot() {
		int sum=0, last=0;
		int userNum = number;
		
		NumberLength numberLength = new NumberLength();
		numberLength.setNumber(number);
		int digitCount = numberLength.getNumberLength();
		
		userNum = number;
		
		while(number > 0) {
			//determines the last digit from the number 
			last = number % 10;
			//calculates the power of a number up to digit times 
			//and add the resultant to sum
			sum += (Math.pow(last, digitCount));
			//removes the last digit 
			number = number/10;
		}
		//compares the sum with n
		if(userNum == sum) {
			result = true;
		}
		else {
			result = false;
		}
		return result;
	}

}
