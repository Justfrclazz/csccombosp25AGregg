import java.util.Scanner;
public class CkeckInput {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		String word;
		int intNum;
		float realNum;
		double biggerRealNum;
		
		System.out.println("enter a number.");
		word = input.nextLine();
		System.out.println("The word is " + word);
		
		System.out.println("Ask for a number. ");
		intNum = input.nextInt();
		System.out.println("The number is " + intNum);
		
		System.out.println("Ask for a real number. ");
		realNum = input.nextFloat();
		System.out.println("The real number is " + realNum);
		
		System.out.println("Ask for a bigger real number. ");
		biggerRealNum = input.nextDouble();
		System.out.println("The bigger real number is " + biggerRealNum);

	}

}
