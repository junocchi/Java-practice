import java.util.Scanner;

public class shopKeeper {

	static final double oranges = 22.50; //product1
	static final double bananas = 44.50; //product2
	static final double apples = 9.98; //product3
	static Scanner scanner; 
	
	public static void main(String[] args) {
		displayProducts();
		shoppingBasket();
		displayOrder();

	}
	
	public static void stockControl() {
		double productsArray[][] = new double[3][3];
		//product number
		//product price
		//quantity sold
		
	}
	public static void displayProducts() {
		System.out.println("Shopping options:");
		System.out.println("1 to buy oranges for £" + oranges);
		System.out.println("2 to buy bananas for £" + bananas);
		System.out.println("3 to buy apples for £" + apples);
	}
	
	public static void shoppingBasket() {
		//add products to the basket according to the user's input
		//switch statement to determine the retail price for each product
		
		//loop
		do {
			scanner=new Scanner(System.in);
			System.out.println("Enter item number: ");
			double itemNumber=scanner.nextInt();
			System.out.println("Enter quantity: ");
			double itemQuantity=scanner.nextInt();
			double toPay;
			
			Switch(itemNumber) {
			case 1:
				toPay = oranges * itemQuantity;
				break;
			case 2:
				toPay = bananas * itemQuantity;
				break;
			case 3:
				toPay = apples * itemQuantity;
				break;
			default:
		        break;
			}
			 
		}

	}
	public static void displayOrder() {
		//calculate and display the total retail value of all products sold
	}

}
