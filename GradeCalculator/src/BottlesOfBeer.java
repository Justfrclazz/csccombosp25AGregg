import java.util.Scanner;
public class BottlesOfBeer {
 	public static void main(String[] args) {
 	    Scanner in = new Scanner(System.in);
 	    System.out.print("Enter the number of bottles to start with:");
 	    int bottles = in.nextInt();
 	    for (int i = bottles; i >= 0; i--) {
 	    	
 	    	
 	      if (i == 1) {
 	    	    System.out.println( i + " bottle of beer on the wall, " + i + " bottle beer.");	    	  
 	      }
 	      else {
 	    	    System.out.println( i + " bottles of beer on the wall, " + i + " bottles beer.");
 	      }
 	      	if (i != 0) {
 	      		System.out.print("Take one down and pass it around, ");
 	      	} 	
 	      	if (i == 2) {
 	      		System.out.println( (i - 1) + " bottle of beer on the wall. "  );	
 	      	}
 	      else {
 	    	 
 	    	if (i != 0) {
 	    		 System.out.println( (i - 1) + " bottles of beer on the wall.");
 	    	}
 	      }
 	      	if (i == 0) {
 	    	    System.out.println("Go to the store buy some more, " + bottles + " bottles of beer on the wall.");
 	      }
 	            System.out.println();
 	    } 
 	  }
	}


