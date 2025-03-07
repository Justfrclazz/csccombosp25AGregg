import java.util.Scanner;
public class Scrabble {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
	}
	
	public static boolean canSpell(String tiles, String word) {
	String tile = input.next();
	String Word = input.next();
	System.out.println(canspell(tile, word));
	String tile = "quibjo"; 
	String word = "job";
	boolean isThere = false;
	isThere = false;
	for(int i = 0; i < word.length(); i ++) {
		char letter = word.charAt(i);
		for(int j =0; j < tile.length(); j++) {
			if(letter == tile.charAt(j)) {
		}
	}
	 if(!isThere) {
		 return false;
	 }
	}
	return isThere;
}	
