import java.util.Scanner;
import java.util.stream.*;

public class sumOfNums {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		//Declaring Array
		int numsArray[] = new int[8];
		
		for (int index = 0; index < 8; index++) {
			System.out.println("Enter " + (index + 1) + " value: ");
			numsArray[index] = scanner.nextInt();
		}
		
		int sum = IntStream.of(numsArray).sum();
		System.out.println("The sum of the array numbers is " + sum);
	}

}
