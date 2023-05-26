import java.util.Scanner;

public class FactorialMain {

	public static void main(String[] args) {
		Factorial factorial=new Factorial();
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int num=scanner.nextInt();
		factorial.userNum(num);
		
		System.out.println("The Factorial is: " + factorial.getResult());
		
	}

}
