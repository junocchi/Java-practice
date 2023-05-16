//needs debugging

import java.util.Scanner;

public class SumOfArraysBestPractice {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int rows, cols;
		
		//accept rows and cols from user
		int array1[][] = inputMatrix(rows, cols);
		int array2[][] = inputMatrix(rows, cols);
		
		
		int sumArray[][] = sumArrays(array1, array2, rows, cols);
		
		System.out.println("Matrix 1: ");
		displayMatrix(array1, rows, cols);
		
		System.out.println("Matrix 2: ");
		displayMatrix(array2, rows, cols);
		
		System.out.println("Sum of Matrix1 and Matrix2: ");
		displayMatrix(sumArray, rows, cols);
		
	}
	
	public static int [][] inputMatrix(int rows, int cols) {
		Scanner scanner = new Scanner(System.in);
		
		int matrix[][]=new int[rows][cols];
		
		//input values;
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++) {
				System.out.print("Enter value at location [" + row + "][" + col + "]: ");
				matrix[row][col]=scanner.nextInt();
			}
		}
		
		return matrix;
	}
	
	public static void displayMatrix(int[][] array, int rows, int cols) {
		
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++) {
				System.out.print(array[row][col] + "\t");
			}
		}
		
		System.out.print("");
	}
	
	public static int[][] sumArrays(int[][] array1, int[][] array2, int rows, int cols) {
		
		int sumArray[][] = new int[rows][cols];
		
		for (int row = 0; row < rows ; row++) {
			for (int col = 0; col < cols; col++) {
				int sum = array1[row][col] + array2[row][col];
				sumArray[row][col] = sum;
			}
			
		}
		return sumArray;
	}

}
