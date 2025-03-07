import java.util.Scanner;
public class TemperatureConversion {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter temp in F");
		double tempIn = in.nextDouble();
		double tempC = (tempIn-32)*5/9;
		System.out.println("temp in C is "+ tempC);
		double tempK = (tempC + 273.15);
		System.out.println("temp in K is "+ tempK);
	}

}
