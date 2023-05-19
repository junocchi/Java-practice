import java.util.Scanner;

public class Factorial {
	
	private int num, result;
	private Scanner scanner;
	
	public void userNum(int num) {
		this.num = num;
	}
	
	public int getResult() {
		calculateFactorial();
		return result;
	}
	
	private void calculateFactorial() {
		result = 1;
		int counter = 1;
		
		for(;counter <= num; counter++) {
			result  = result * counter;
		}
	}

}
