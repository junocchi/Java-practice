
import java.util.Scanner;

public class MultiplyWithForLoop {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number:");
		
		int userNumber=scanner.nextInt();
		int result = 0;
		
		
		for(int multiplyNum=1;multiplyNum<11;result=userNumber*multiplyNum) {
			System.out.println(userNumber + " * " + multiplyNum + " = " + result);
			multiplyNum++;
		}

	}

}


//Draw the flowchart and write a program to display the table of the number till 10, number should be entered by the user.
//Example:
//Enter No.: 2
//2 * 1 =2
//2 * 2 =4
//.
//.
//.
//2*10 = 20