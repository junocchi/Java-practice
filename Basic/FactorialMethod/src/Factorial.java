import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		//caller method
		factorialOfNum();
		factorialOfNum();

	}
	//calling method
	public static void factorialOfNum() {
		Scanner scanner=new Scanner(System.in);
		
		//Input
		System.out.println("Enter a number:");
		int userNumber=scanner.nextInt();
		//Add check for negative number, otherwise even if the user
		//adds a negative number, the function will return 1
		if(userNumber < 1) {
			System.out.println("Invalid Number.");
		}
		else {
			//Processing
			int counter=1;
			long factorial=1;
			
			for(;counter<=userNumber; counter++) {
				factorial=factorial*counter;
			}
			//Output
			System.out.println("The factorial of " + userNumber + " is " + factorial + ".");
		}
	}
}
