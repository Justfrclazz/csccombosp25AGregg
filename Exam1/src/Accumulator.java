import java.util.Scanner;
public class Accumulator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("press any number to start. ");
		int limit = in.nextInt();
		
		int i = 1;
		int sum = 0;
		
		while(i <= limit) {
			System.out.println("what number do you want? ");
			limit = in.nextInt();
			sum = sum + limit;  
			i++;
		}
		System.out.println("your sum is " + sum );
	}

}

