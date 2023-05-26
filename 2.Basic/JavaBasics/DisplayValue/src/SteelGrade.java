import java.util.Scanner;

public class SteelGrade {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int carbon, tensile; 
		boolean conditionOne, conditionTwo, conditionThree;
		double hardness;
		
		int grade=0;
		
		System.out.println("Enter carbon content: ");
		carbon=scanner.nextInt();
		
		System.out.println("Enter hardness");
		hardness=scanner.nextDouble();
		
		System.out.println("Enter tensile strength: ");
		tensile=scanner.nextInt();
		
		conditionOne=carbon>5700;
		conditionTwo=hardness<0.7;
		conditionThree=tensile>=97;
		
		
		if(conditionOne && conditionTwo && conditionThree) {
			grade = 10;
		}
		else if(conditionOne && conditionTwo) {
			grade = 9;
		}
		else if(conditionTwo && conditionThree) {
			grade = 8;
		}
		else if(conditionOne && conditionThree) {
			grade = 7;
		}
		else if(conditionOne || conditionTwo || conditionThree) {
			grade = 6;
		}
		else {
			grade = 5;
		}
		System.out.println("Steel's grade is " + grade);
	}

}


//Write a program to grade the steel as per the following conditions
//Condition 1: Carbon Content must be greater then 5700
//Condition 2 : Hardness must be less then 0.7
//Condition 3: Tensile Strength must be greater than and equal to 97
//Grades are as follows
//Grade is 10 is all three condition are met
//Grade is 9 if condition 1 and 2 are met
//Grade is 8 if condition 2 and 3 are met
//Grade is 7 if condition 1 and 3 are met
//Grade is 6 if any one condition is met
//Grade is 5 if none of the conditions are met