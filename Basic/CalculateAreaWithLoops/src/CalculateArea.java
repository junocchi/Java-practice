
import java.util.Scanner;

public class CalculateArea {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		double height, width, length;
		double result=0;
		double pi=3.142;
		String choice;
		int calculator;
		String menu = "Enter a number: \n1(rectangle), \n2(circle), \n3(triangle), \nor 4(square) to calculate the area; \nand 5 to exit the calculator:";
		
		do {
		
			System.out.println(menu);
			calculator=scanner.nextInt();
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
			//exit
			case 5: {
				System.out.println("You left the calculator.");
				System.exit(0);
			}
			default:
				System.out.println("Unexpected value: " + calculator);
			}
			System.out.println("Its area is " + result);
			
			
			System.out.println("Do you want to calculate other areas?");
			choice = scanner.next();
		    
			} while (choice.equalsIgnoreCase("y"));
		System.out.println("You left the calculator.");
	}

}

//Option with While Loop:
//	//do { for a while look you make an infinite loop and then use the system.exit to end it
//	while(true) {
//	System.out.println("-------------------------------------");
//	System.out.println("Enter: 1 to Calculate Area of Rectangle \nEnter: 2 to Calculate Area of Circle \nEnter: 3 to Calculate Area of Triangle \nEnter: 4 to Calculate Area of Square\nEnter 5: to exit");
//	actionToTake=scanner.nextInt();		
//	
//	switch(actionToTake) {
//	case 1:
//		System.out.println("Enter the height of the rectangle : ");
//		height=scanner.nextInt();
//		System.out.println("Enter the width of the rectangle : ");
//		width=scanner.nextInt();
//		area = height*width;
//		System.out.println("The area of the rectangle is : "+area);
//		break;
//	case 2:
//		System.out.println("Enter the radius of the circle : ");
//		radius=scanner.nextInt();
//		area=pi*radius*radius;
//		System.out.println("Area of the circle is : "+area);
//		break;
//	case 3:
//		System.out.println("Enter the height of the triangle : ");
//		height=scanner.nextInt();
//		System.out.println("Enter the base of the triangle : ");
//		base=scanner.nextInt();
//		area=(base*height)/2;
//		System.out.println("The area of the triangle is : "+area);
//		break;
//	case 4:
//		System.out.println("Enter the length of a side of the square : ");
//		length=scanner.nextInt();
//		area=length*length;
//		System.out.println("The area of the square is : "+area);
//		break;
//	case 5: 
//		System.out.println("Thank you. Goodbye!");
//		System.exit(0);
//	default:
//		System.out.println("That is not a valid option");
//	}
//	}
