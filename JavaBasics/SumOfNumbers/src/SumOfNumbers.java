import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int userNumber=scanner.nextInt();
		
		int counter=1;
		int sum=0;
		
		for(;counter<=userNumber;) {
			sum=sum+counter++;
	}

	System.out.println(sum);
	}
}
