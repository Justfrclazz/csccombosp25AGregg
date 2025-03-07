Random rand = new Random();
public class ArraysFun {

	public static void main(String[] args) {
		
		
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = rand.nextInt(30)+70;
		}
		
		int[] seventies;
		int[] eighties;
		int[] nineties;