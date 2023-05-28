import java.util.Scanner;

public class FactorialWithReturn {

	public static void main(String[] args) {
		//caller method
		long returnFactorial=factorial();
		
		//Output
		if(returnFactorial!=0)
		System.out.println("Factorial is " + returnFactorial + ".");
	}
	
	//calling method
	public static long factorial() {
		Scanner scanner=new Scanner(System.in);
		
		//Input
		System.out.println("Enter a number:");
		int userNumber=scanner.nextInt();
		long factorial=0;
		//Add check for negative number, otherwise even if the user
		//adds a negative number, the function will return 1
		if(userNumber < 1) {
			System.out.println("Invalid Number.");
			
		}
		else {
			//Processing
			int counter=1;
			factorial=1;
			
			for(;counter<=userNumber; counter++) {
				factorial=factorial*counter;
			}
			
		}
		//return statement is used to return value to the caller method
		return factorial;
	}
}
