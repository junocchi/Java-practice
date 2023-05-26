import java.util.Scanner;

//Write a program that mirrors the number given by the user
public class ReverseLogic {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number:");
		// This will keep the original number given by the user, so we can compare it at
		// the end.
		int userNumber = scanner.nextInt();

		// A variable that will change as the logic starts
		int duplicatedUserNumber = userNumber;

		int reversed = 0;

		while (duplicatedUserNumber != 0) {
			int remainder = duplicatedUserNumber % 10;
			reversed = reversed * 10 + remainder;

			duplicatedUserNumber /= 10;
		}

		System.out.println("The reversed number of " + userNumber + " is " + reversed + ".");

		// check if the userNumber and reversed number reads the same backward or
		// forward
		if (reversed == userNumber) {
			System.out.println(userNumber + " is palindrome! ");
		} else {
			System.out.println(userNumber + " is not palindrome.");
		}
	}
}
