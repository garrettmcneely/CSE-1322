import java.util.Scanner;
public class testCar {
	
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println ("Enter your car's make: ");
		String make = sc.next();
		System.out.println ("Enter your car's model: ");
		String model = sc.next();
		System.out.println ("Enter your car's year: ");
		int year = sc.nextInt();
		
		Car stockCar = new Car ();
		Car myCar = new Car (make, model,year);
		
		
		
		System.out.println (stockCar.toString());		
		System.out.print (myCar.toString());
		
		
	}
	

}
