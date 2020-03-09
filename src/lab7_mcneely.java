
public class lab7_mcneely {

	public static void main(String[] args) {
		
		
		String string = "Hello World";
		String string2 = "What's up";
		
		
		string = string.toUpperCase();
		string2 = string2.toUpperCase();
		
		System.out.println ("Number of vowels = " +vowelCheck(string));
		System.out.println ("Number of vowels = " +vowelCheck(string2));

	}
	
	
	public static int vowelCheck (String string)
	{
		int vowels = 0;
		
		if (string.length() <= 0)
		{
			return vowels;
		}
			if (string.charAt(0) == 'A'|| string.charAt(0) == 'E' 
					||string.charAt(0) == 'I'||string.charAt(0) == 'O' || string.charAt(0) == 'U'
					||string.charAt(0) == 'Y') 
			{
				vowels++;
			}
		
		
		return vowelCheck(string.substring(1))+vowels;
		
		
		
			
		
		
	}

}
