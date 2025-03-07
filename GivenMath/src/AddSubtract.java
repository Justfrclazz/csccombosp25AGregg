import java.util.Scanner;
public class AddSubtract {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("what's the first number: ");
		int num1 = in.nextInt();
		System.out.println("what is you second number: ");
		int num2 = in.nextInt();
		System.out.println("Enter a target: ");
		int target = in.nextInt();
		if(addsUp(num1, num2, target)) {
			System.out.println(" sum equals target");
		}
		else { 
			System.out.println("sum does not equal target");
		}
		if(subDown(num1, num2, target)) {
			System.out.println(" differance equals target");
		}
		else { 
			System.out.println("differance does not equal target");
		}

	}
	private static boolean addsUp(int first, int second, int target) {
		if(first + second == target) {
			return(true);
		}
		else {
			return(false);
		}
	}
	private static boolean subDown(int first, int second, int target) {
		if(first - second == target) {
			return(true);
			
		}
		else {
			return(false);
		}
	}
}
