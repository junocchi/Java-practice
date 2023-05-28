import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int userNumber=scanner.nextInt();
		int reversed = 0;
		
		//call function here
		boolean returnPalindrome=palindrome(reverse(userNumber, reversed), userNumber);
		System.out.println("Is the number a palidrome? " + returnPalindrome);

	}
	
	public static int reverse(int userNumber, int reversed) {
		int duplicatedUserNumber = userNumber;
		int reversedChecked = reversed;
		
		while (duplicatedUserNumber !=0) {
			int remainder = duplicatedUserNumber % 10;
			reversedChecked = reversedChecked * 10 + remainder;
			duplicatedUserNumber /= 10;
		}
		return reversedChecked;
		
	}
	
	/* check if the userNumber and reversed number 
	*reads the same backwards or forwards*/
	public static boolean palindrome(int reversedChecked, int userNumber) {
		if (reversedChecked == userNumber) {
			return true;
		} else {
			return false;
		}
		
	}

}
