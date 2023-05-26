import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int number;
		
		System.out.println("Enter number: ");
		number= scanner.nextInt();
		
		
//		if(number > 0) {
//			System.out.println(number + " is positive.");
//		}
//		else {
//			if(number == 0) {
//				System.out.println("The number is 0.");
//			}
//			else {
//				System.out.println(number + " is negative.");
//			}
//			
//		}
		
		if(number > 0) {
			System.out.println(number + " is positive.");
		}
		else if(number == 0) {
			System.out.println("The number is 0.");
		}
		else {
			System.out.println(number + " is negative.");
		}
			
	}

}
