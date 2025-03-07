import java.util.Scanner;
public class InteractiveGreeter {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("What is your name? ");
		String name = in.nextLine();
		
		System.out.print("Where are you from? ");
		String location = in.nextLine();
		
		System.out.print("How old are you? ");
		int age = in.nextInt();
		String skipEOL = in.nextLine();
		//EOL (End of Line) generally used for System.out.print.Int... because print Int does not move the process to the next line
		
		System.out.println("Hello " + name + " from " + location + ". You are " + age + " years old. ");
		
		System.out.print("What is something you like to do? ");
		//String stuff = in.nextLine(); (created a comment for debugging)
		String hobby = in.nextLine();
		
		System.out.println("Have fun next time you " + hobby);
		
		System.out.print("How much would you like to donate today? ");
		double donation = in.nextDouble();
		
		System.out.println("You donated $" + donation + " Yay!");
		
	}
	

}
