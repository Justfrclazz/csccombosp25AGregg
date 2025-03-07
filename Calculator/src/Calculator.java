import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.println("Welcome to the Calculator. ");
		System.out.println("Enter what operation you would like to perform. ");
		System.out.println("Addition (add), subtraction (sub), \nMultiplication (mult)"
				+ " and division(div)");
		
		String operation = input.next();
		System.out.println("Enter the two whole numbers");
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		
		switch(operation) {
		case "add"://This is an instance where "add" was selected
			add(num1, num2);
			break;
			
		case "sub":
			sub(num1, num2);
			break;
			
		case "mult":
			mult(num1, num2);
			break;
			
		case "div":
			div(num1, num2);
			break;
			
		default:
			System.out.println("invalid entry");
			
			
		}
	}

	private static void div(int num1, int num2) {// this is a method private states it cannot be used outside of the object static, and void is just a need to add at this point
		if(num2 == 0) //div is a method it states what you input into the method IE(int num1, int num2). stating the type always comes first for java then the name.
		{
			System.out.println("You can't divide by zero");
			return;
		}
		System.out.printf("%d divided by %d - %d" , num1 , num2, num1/num2);
	}

	private static void mult(int num1, int num2) {
		System.out.printf("%d multiplied by %d - %d" , num1 , num2, num1*num2);
		
	}

	private static void sub(int num1, int num2) {
		System.out.printf("%d subtracted by %d - %d" , num1 , num2, num1-num2);
		
	}

	private static void add(int num1, int num2) {
		System.out.printf("%d added by %d - %d" , num1 , num2, num1+num2);
		
	}

}
