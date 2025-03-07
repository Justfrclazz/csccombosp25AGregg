import java.util.Scanner;
public class CircleCalculation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Radius: ");
		double radius = in.nextDouble();
		double dia = 2 * radius;
		double ar = Math.PI  * radius * radius;
		double cir = 2 * Math.PI * radius;
		
			System.out.println("Diameter = "+dia);
			System.out.println("area = "+ar);
			System.out.println("Circumference = "+cir);
	}

}

