import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int userNumber=scanner.nextInt();
		
		int counter=1;
		long factorial=1;
		
		for(;counter<=userNumber; counter++) {
			factorial=factorial*counter;
		}
		System.out.println("The factorial of " + userNumber + " is " + factorial);
	}
}
