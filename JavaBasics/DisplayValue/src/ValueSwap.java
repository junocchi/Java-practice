import java.util.Scanner;

public class ValueSwap {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int value1, value2, temp;
		
		System.out.println("Enter value 1");
		int value1=scanner.nextInt();
		
		System.out.println("Enter value 2");
		int value2=scanner.nextInt(); 
		
		value1=temp;
		value2=value1;
		int temp=value2;
				
		
		System.out.println("Value 1 now is " + value2);
		System.out.println("Value 2 now is " + value1);

	}

}
