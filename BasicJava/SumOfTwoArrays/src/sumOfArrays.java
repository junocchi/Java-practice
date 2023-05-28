import java.util.Scanner;

public class sumOfArrays {

	public static void main(String[] args) {
		
		int[][] matrixOne = matrix();
		int[][] matrixTwo = matrix();
		int[][] sum = sumOfArrays(matrixOne, matrixTwo);
		System.out.println("Enter sum of two matrices:");
		for (int row = 0; row < sum.length; row++) {
			for (int col = 0; col < sum[0].length; col++) {
				System.out.print(sum[row][col]+"\t");
			}
			System.out.println("");
		}
		
	}
	
	public static int [][] matrix() {
		int matrix[][];
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter No of Rows in a Matrix : ");
		int rows = scanner.nextInt();
		System.out.println("Enter No of Columns in a Matrix : ");
		int cols = scanner.nextInt();
		
		matrix = new int[rows][cols];
		
		for (int row = 0; row < rows; row++) {

			for (int col = 0; col < cols; col++) {
				System.out.print("Enter Element at location :[" + row + "][" + col + "] : ");
				matrix[row][col] = scanner.nextInt();
			}
		}
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++) {
				System.out.print(matrix[row][col]+"\t");
			}
			System.out.println("");
		}
		
		return matrix;
	}
	
	public static int[][] sumOfArrays(int[][]matrixOne, int[][]matrixTwo) {
		int rows = matrixOne.length;
		int cols = matrixOne[0].length;
		int[][]sum = new int[rows][cols];
		
		for (int index = 0; index < rows ; index++) {
			for (int index2 = 0; index2 < cols; index2++) {
				sum[index][index2] = matrixOne[index][index2] + matrixTwo[index][index2];
			}
			
		}
		return sum;
	}

}
