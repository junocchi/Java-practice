
import java.util.Scanner;

public class MultiplyWithForLoop {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number:");
		
		int userNumber=scanner.nextInt();
		int result = 0;
		
		//(initialization;condition;step) in one line
		for(int multiplyNum=1;multiplyNum<11;result=userNumber*multiplyNum) {
			System.out.println(userNumber + " * " + multiplyNum + " = " + result);
			multiplyNum++;
		}

	}

}


//Draw the flowchart and write a program to display the table of the number till 10, number should be entered by the user.
//Example:
//Enter a number:
//23
//23 * 1 = 0
//23 * 2 = 46
//23 * 3 = 69
//23 * 4 = 92
//23 * 5 = 115
//23 * 6 = 138
//23 * 7 = 161
//23 * 8 = 184
//23 * 9 = 207
//23 * 10 = 230