import java.util.Scanner;


public class testTests {

	public static void main (String[] args)
	{
		Scanner sc = new Scanner (System.in);
		
		int[] testScores = new int [5];
		
		Tests[] students = new Tests [10];
		
		for (int x = 0; x < 10; x++)
		{
			System.out.println ("Enter student's first name: ");
			String firstName = sc.next();
			
			System.out.println ("Enter student's last name: ");
			String lastName = sc.next();
			
			students[x] = new Tests (firstName, lastName);
			
				for (int y = 0; y < 5; y++)
				{
					System.out.println ("Enter test number "+y+" score: ");
					testScores[y] = sc.nextInt();
				}
				
			students[x].setTestScore(testScores);	
			students[x].calculateAverage(testScores);
			students[x].calculateLetterGrade();
			
			
			
			
		}
		
		for (int x = 0; x < 10; x++)
		{
			System.out.println (students[x].toString());	
			System.out.println (" ");
			
		}
	
		
		int classAvg =0;
		
		for (int x = 0; x < 10; x++)
		{
			classAvg = classAvg + students[x].getAverageTestScore();
		}
		
		classAvg = classAvg/10;
		
		
		System.out.println ("Class average is "+classAvg);
		
		
	}
	
	
	
	
}
