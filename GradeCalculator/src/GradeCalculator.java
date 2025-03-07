import java.util.Scanner; 
public class GradeCalculator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("what is your score: ");
		double score = in.nextDouble();
				
		if (score >= 92.0) {
			
			System.out.println("your grade is A");
		}
		
		else if (score >= 90.0) {
			
			System.out.println("your grade is A-");
		}
		
		else if (score >= 89.0) {
			
			System.out.println(" your grade is B+");
			
		}
		
		else if (score >= 87.0) {
			System.out.println(" your grade is B");
		
		}
		
		else if (score >= 82.0) {
			System.out.println(" your grade is B-");
		
		}
		
		else if (score >= 79.0) {
			System.out.println(" your grade is C+");
			
		}
		
		else if (score >= 77.0) {
			System.out.println(" your grade is C");
			
		}
		
		else if (score >= 72.0) {
			System.out.println(" your grade is C-");
			
		}
		
		else if (score >= 69.0) {
			System.out.println(" your grade is D+");
			
		}
		
		else if (score >= 67.0) {
			System.out.println(" your grade is D");
			
		}
		
		else if (score >= 0) {
			System.out.println(" You flunk!");
		}
		else {
			System.out.println(" Error! score must be >= 0 ");
		}
	}
}
