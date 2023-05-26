import java.util.Scanner;

public class namesArray {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//Declaring Array
		String namesArray[];
		
		System.out.println("How many name would you like to store?");
		int totalNames=scanner.nextInt();
		
		//Initialising memory
		namesArray=new String[totalNames];
		
		//Requesting names
		for(int index=0;index<totalNames;index++) {
			System.out.println("Enter " + (index+1) + " name: ");
			namesArray[index]=scanner.next();
		}
		
		//Printing array
		for(int index=0;index<totalNames;index++) {
			System.out.println("Name " + (index+1) + " is: " + namesArray[index]);
		}

	}

}
