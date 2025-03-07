
public class Notes {
	public static boolean isDoubloon(String userword) {
		String userWordLower = userword.toLowerCase();
		
		
		for(int i = 0; i < userWordLower.length(); i ++) {
			char letter = userWordLower.charAt(i);
			int count = 0;
			
			for(int j = 0; j < userWordLower.length(); j++) {
				if(letter == userWordLower.charAt(j)) {
					count++;
				}
			}
			if(count != 2) {
				return false;
			}
		}
		return true;
}
	
	}
