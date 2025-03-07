import java.util.Random;
import java.util.Arrays;



public class ArrayFun {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = rand.nextInt(30)+70;
		}
		
		int seventies =0;
		int eighties =0;
		int nineties =0; 
		
		for(int i : arr)
		{
			if(i >= 90)
			{
				nineties++;
			}else if (i >= 80)
			{
				eighties++;
			}else
			{
				seventies++;
			}
			System.out.println(Arrays.toString(arr));
			System.out.printf("Seventies: %d%n Eighties: %d%n Nineties: %d%n", seventies, eighties, nineties);
		}

	}

}
