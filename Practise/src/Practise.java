import java.util.Scanner;
public class Practise {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("what is your item? "); 
		String myItem = in.next();
		if (myItem.equals("cheese")) {
			System.out.println("your item is cheese. ");
		}
		else if (myItem.equals("milk")) {
			System.out.println("your item is milk. ");
		}
		else if (myItem.equals("bread")) {
			System.out.println("your item is bread. ");
		}
		else {
			System.out.println("this is not milk, cheese, or bread. ");
		}
	}

}
