import java.util.Scanner;
public class BeverageSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("enter a number to choose your bev. ");
		
		int Bev = in.nextInt();
		if (Bev == 1) {
			System.out.println("your bev is water. ");
		}
		else if (Bev == 2) {
			System.out.println("your bev is coke. ");
		}
		else if (Bev == 3) {
			System.out.println("your bev is coffee. ");
		}
		else {
			System.out.println("you did not select a number that relates to a bev! You can choose 1, 2, or 3. ");
		}
			
		
	}

}
