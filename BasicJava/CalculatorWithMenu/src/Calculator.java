import java.util.Scanner;

public class Calculator {
	
	//show menu
	public static void showMenu() {
		Scanner scanner=new Scanner(System.in);

		System.out.println("1. Add");
		System.out.println("2. Difference");
		System.out.println("3. Product ");
		System.out.println("4. Division");
		System.out.println("5. Exit");
	}
	
	//main function
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		while(true) {
			showMenu();
			
			System.out.println("Enter a number according to the given options: ");
			int choice=scanner.nextInt();
			
			calculate(choice);
		}
	}
		
	//calculator
	public static void calculate(int choice) {
		Scanner scanner=new Scanner(System.in);
		int num1=0, num2=0;
		if(choice>=1 && choice<=4) {
			System.out.println("Enter the first number: ");
			num1=scanner.nextInt();
			System.out.println("Enter the second number: ");
			num2=scanner.nextInt();
		}
		
			switch (choice) {
			//1.addition
			case 1: {
				System.out.println("Sum : "+(num1+num2));
				break;
			}
			//2.subtraction
			case 2: {
				System.out.println("Difference : "+(num1-num2));
				break;
			}
			//3.multiplication
			case 3: {
				System.out.println("Product : "+(num1*num2));
				break;
			}
			//4.division
			case 4: {
				System.out.println("Quotient : "+(num1/num2));
				break;
			}
			//5.exit
			case 5: {
				System.out.println("You left the calculator.");
				System.exit(0);
			}
			//default
			default:
				System.out.println("Invalid number.");
		}
	}
}


