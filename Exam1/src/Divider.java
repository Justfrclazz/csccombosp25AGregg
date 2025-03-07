import java.util.Scanner;

public class Divider {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Enter the two whole numbers");

		
		double num1 = input.nextDouble();
		System.out.println("Enter the two whole numbers");
		double num2 = input.nextDouble();
		if (num2 == 0) {
			System.out.print("you cannot divide by 0. ");
			
			
		}
		else {
			System.out.printf(" %.1f / %.1f = %.2f ", num1, num2, num1 / num2);
		}
	}
}