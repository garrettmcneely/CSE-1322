//Garrett McNeely


import java.util.Scanner;

public class McNeely_Lab1BClass {
	
	public static void main (String[] args)
	{
		
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println ("Enter your first name: ");
		String first = sc.next();
		
		System.out.println ("Enter your last name: ");
		String second = sc.next();
		
		
		Person personOne = new Person();
		Person personTwo = new Person (first, second);
		
		
		System.out.println (personOne.toString());
		
		System.out.println (personTwo.toString());
		System.out.println (" ");
		
		
		personOne.setFirst("Aly");
		personTwo.setLast("Sanchez");
		
		System.out.println ("Hello "+personOne.getFirst()+" "+personOne.getLast());
		
		System.out.println ("Hello "+personTwo.getFirst()+" "+personTwo.getLast());
		
		
	}
	

}
