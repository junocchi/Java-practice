import java.util.Scanner;

/*
* Radius of Circle
* pi=3.142
* area= pi*radius*radius
* circumference= 2*pi*radius
*/

public class CircleRadius {

	public static void main(String[] args) {
		//declare Scanner
		Scanner scanner=new Scanner(System.in);
		
		double pi=3.142;
		
		System.out.println("Enter the circle radius");
		double radius=scanner.nextDouble();
		
		double area=pi*radius*radius;
		double circumference=2*pi*radius;
		
		System.out.println("Circumference of circle: " + circumference);

	}

}
