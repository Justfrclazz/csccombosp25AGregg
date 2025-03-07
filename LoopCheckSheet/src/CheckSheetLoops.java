import java.util.Scanner;
import java.util.Random; 
public class CheckSheetLoops {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		int count;
		count = 0;  //initializer
		
		int quantity;
		quantity = 5;  //initializer
		
		//int nestedCount = 0; //initializer
		
		
		int value = 5;//initializer
		value = rand.nextInt(100-5) + 5;//changer
		
		int sum;
		
		while (count < 5) { //condition
			//System.out.println(value + " ");//body
			count++; //changer 
			//System.out.println();
			
			
			System.out.print(count + " " + value + " \n");//body 
			int nestedCount = 0; //initializerS
		while (nestedCount < value) {//condition
			System.out.print(" "+ nestedCount + " ");//body
			nestedCount++;
			
		
		}
		
		} //end while
		
	}//end main
}//end class
