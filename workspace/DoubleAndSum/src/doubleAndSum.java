import java.util.Scanner;

public class doubleAndSum {

	public static void main(String[] args) {
		double numsArray[]=new double[8];
		Scanner scanner=new Scanner(System.in);
		
		for (int index = 0;index < 8; index++) {
			System.out.println("Enter " + (index + 1) + " number: ");
			numsArray[index] = scanner.nextInt();
		}

		double sum = totalSum(numsArray, 8);
		System.out.println("The sum of the array numbers is " + sum);
	}
	
	public static double totalSum(double array[], int totalNum) {
		double total = 0;
			for (int index = 0; index < totalNum; index++) {
				total += array[index];
			}
			return total;
	}

}
