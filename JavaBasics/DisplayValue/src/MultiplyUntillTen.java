import java.util.Scanner;

public class MultiplyUntillTen {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Add a number:");
		
		int userNumber=scanner.nextInt();
		int multiplyNum=1;
		int result;
		
		while(multiplyNum<11) {
			result=userNumber*multiplyNum;
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