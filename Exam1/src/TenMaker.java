
public class TenMaker {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 5;
		
		

		 if (makes10(num1, num2)) {
			 System.out.println(" the sum is 10. ");
			 
		 }
		 else { 
			 System.out.println("It does not make 10. ");
		 }

	}

	private static boolean makes10(int num1, int num2) {
		
		return num1 + num2 == 10;
	}

}
