import java.util.Arrays;

// Garrett McNeely

public class Tests {
	
	private String firstName, lastName;
	
	private int[] testScore = {0,0,0,0,0};
	
	private int averageTest;
	
	private char letterGrade;
	
	Tests()
	{
		firstName = "Bob";
		lastName = "Smith";
		
		
		
	}
	
	
	Tests(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		
		
	}
	
	
	void setFirstName (String firstName)
	{
		this.firstName = firstName;
		
	}
	
	String getFirstName ()
	{
		return firstName;
		
	}
	
	void setLastName (String lastName)
	{
		this.lastName = lastName;
		
	}
	
	String getLastName ()
	{
		return lastName;
		
	}
	
	void setTestScore (int[] testScore)
	{
		
		this.testScore = testScore.clone();
		
	}
	
	
	int[] getTestScores ()
	{
		return testScore;
	}
	
	void setAverageTestScore (int averageTest)
	{
		
		
		this.averageTest = averageTest;
		
	}
	
	int getAverageTestScore ()
	{
		return averageTest;
	}
	
	
	void setLetterGrade (char letterGrade)
	{
		this.letterGrade = letterGrade;
	}
	
	char getLetterGrade ()
	{
		return letterGrade;
	}
	
	@Override
	
	public String toString ()
	{
		return "First Name: "+firstName+", Last Name: "+lastName+", Test Scores: "+Arrays.toString(testScore)+", Average Test Score: "+averageTest+", Final Letter Grade: "+getLetterGrade();
	}
	
	
	 void calculateAverage (int[] averageTest)
	{
		 int y = 0;
			
			for (int x = 0; x < 5; x++)
			{
				y = y+averageTest[x];
			}
			
		int average = y/averageTest.length;
		
		setAverageTestScore(average);	
			
	}
	 
	void calculateLetterGrade ()
	{
		int avg = getAverageTestScore();
		while (avg <= 100 && avg >= 0)
		{
			avg /= 10;
			
				switch (avg)
				{
				case 10:
					setLetterGrade('A');
					break;
				case 9:
					setLetterGrade('A');
					break;
				case 8:
					setLetterGrade('B');
					break;
				case 7:
					setLetterGrade('C');
					break;
				case 6:
					setLetterGrade('D');
					break;
				default:
					setLetterGrade('F');
					break;
				
				
				}
			
			break;
			
		}
		
		
	}
	
	
	
	
	
	

}


