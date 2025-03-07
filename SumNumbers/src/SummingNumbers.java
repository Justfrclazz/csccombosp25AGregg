import java.util.Scanner;
public class SummingNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("what number do you want? ");
		int limit = in.nextInt();
		
		int i = 1;
		int sum = 0;
		
		while(i <= limit) {
			sum = sum + i;  
			i++;
		}
		System.out.println("your sum is " + sum );
	}

}
