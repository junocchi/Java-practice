import java.util.Scanner;

public class AreaCalculator {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		double height, width, length;
		double result=0;
		double pi=3.142;
		
		System.out.println("Add a number: 1(rectangle), 2(circle), 3(triangle), or 4(square) to calculate the area");
		Integer calculator=scanner.nextInt();
		
		
		switch (calculator) {
		//rectangle
		case 1: {
			System.out.println("Enter the rectangle's length: ");
			length=scanner.nextDouble();
			System.out.println("Enter the rectangle's width : ");
			width=scanner.nextDouble();
			result=length*width;
			break;
		}
		//circle
		case 2: {
			System.out.println("Enter the circle radius");
			double radius=scanner.nextDouble();
			result=pi*radius*radius;
			break;
		}
		//triangle
		case 3: {
			System.out.println("Enter the triangle's height: ");
			height=scanner.nextDouble();
			System.out.println("Enter the triangle's width : ");
			width=scanner.nextDouble();
			result=(height*width)/2;
			break;
		}
		//square
		case 4: {
			System.out.println("Enter the square's height: ");
			height=scanner.nextDouble();
			result=height*height;
			break;
		}
		default:
			System.out.println("Unexpected value: " + calculator);
		}
		System.out.println("Its area is " + result);

	}

}

//the menu option selected by the user.
//1. Calculate Area of Rectangle
//2. Calculate Area of Circle
//3. Calculate Area of Triangle
//4. Calculate Area of Square