// Garrett McNeely


import java.util.Arrays;
import java.util.Scanner;


public class McNeely_Lab1BArray {
	
	public static void main (String[] args)
	{
		int[][] array = {{0,1,2,3,4},{5,-1,-5,-5,5},{3,-2,56,25,-15},{0,5,5,0,324},{46,25,0,0,0}};	
		
		Scanner sc = new Scanner (System.in);
		
		
		
		
		
		
		
	    
		
		
		
		System.out.println (Arrays.deepToString(array));
		System.out.println (longestPositiveSeries (array));
		
		
		
		
		
		
	}
	
	
	//Finds and returns longest series of positive integers. 
	
	public static int longestPositiveSeries (int[][] array)
	{
		
		int counter = 0;
		int max = 0;
		
	
		for (int x = 0; x < 5; x++)
		{
			
			for (int y = 0; y < 5; y++)
			{
				
				if (array[x][y] > 0)
				{
					counter++;
					if (max < counter)
					{
						max = counter;
					}
					
					
					
				}
				else 
				{
					counter = 0;
				}
			
			}
			
			
		}
		
		
		
		
		return max;
	}
	
	

}
