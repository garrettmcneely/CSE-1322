// Garrett McNeely
import java.util.Arrays;
import java.util.Random;
public class arrays {
	public static void main (String[] args)
	{
		Random random = new Random();
		
		
		int [] nums =  {1, 4, 13, 43, -25, 17, 22, -37, 29};
		
		System.out.println ("Largest value: "+findLargest (nums));
		
		
		
		
		int [] data = new int [20];
		
			for (int x = 0; x< 20; x++)
			{
				data[x] = (random.nextInt(200)-100+1);
				
				
				
			}
		
			
			
			System.out.println ("Largest value: "+findLargest (data));
			int sum = (findLargest (data)+ findLargest (data));
			
			System.out.println ("Sum of largest: "+ sum);
		
		
		
	}
	
	
	public static int findLargest (int [] array)
	{
		int largest = 0;
		
			for (int x = 0; x < array.length; x++)
			{
				if (array[x] > largest)
				{
					largest = array[x];
				}
				
				
				
			}
		
		
		
		
		return largest;
	}
	
	
	
	
	

}
