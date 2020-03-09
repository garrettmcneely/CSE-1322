import java.util.Scanner;


public class personMain {
	
	public static void main (String [] args)
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println ("Enter person's name: ");
		String name = sc.nextLine();
		System.out.println ("Enter person's adress: ");
		String adress = sc.nextLine();
		System.out.println ("Enter person's phone number: ");
		String phoneNumber = sc.nextLine();
		System.out.println ("Enter person's email: ");
		String emailAdress = sc.nextLine();
		
		
		Person person = new Person (name, adress, phoneNumber, emailAdress);	
		
		
		
		System.out.println ("Enter student's name: ");
		 name = sc.nextLine();
		System.out.println ("Enter student's adress: ");
		 adress = sc.nextLine();
		System.out.println ("Enter student's phone number: ");
		 phoneNumber = sc.nextLine();
		System.out.println ("Enter student's email: ");
		 emailAdress = sc.nextLine();
		System.out.println ("Enter student's class status: ");
		 String status = sc.nextLine();
		
		Student student = new Student (name, adress, phoneNumber, emailAdress, status);
		
		
		System.out.println ("Enter employee name: ");
		 name = sc.nextLine();
		System.out.println ("Enter employee adress: ");
		 adress = sc.nextLine();
		System.out.println ("Enter employee phone number: ");
		 phoneNumber = sc.nextLine();
		System.out.println ("Enter employee email: ");
		 emailAdress = sc.nextLine();
		System.out.println ("Enter employee office building and number: ");
		 String office = sc.nextLine();
		System.out.println ("Enter the employee month hired: ");
		 String month = sc.nextLine();
		System.out.println ("Enter the employee day hired: ");
		 String day = sc.nextLine();
		System.out.println ("Enter the employee year hired: ");
		 String year = sc.nextLine();
		System.out.println ("Enter the employee salary: ");
		 String salary = sc.nextLine();
		 
		 
		Employee employee = new Employee (name, adress, phoneNumber, emailAdress, office, month, day, year, salary); 
		 
		
		
		System.out.println ("Enter Faculty name: ");
		 name = sc.nextLine();
		System.out.println ("Enter Faculty adress: ");
		 adress = sc.nextLine();
		System.out.println ("Enter Faculty phone number: ");
		 phoneNumber = sc.nextLine();
		System.out.println ("Enter Faculty email: ");
		 emailAdress = sc.nextLine();
		System.out.println ("Enter Faculty office building and number: ");
		  office = sc.nextLine();
		System.out.println ("Enter the Faculty month hired: ");
		  month = sc.nextLine();
		System.out.println ("Enter the Faculty day hired: ");
		  day = sc.nextLine();
		System.out.println ("Enter the Faculty year hired: ");
		  year = sc.nextLine();
		System.out.println ("Enter the Faculty salary: ");
		  salary = sc.nextLine();
		System.out.println ("Enter the Faculty number of office hours: ");
			int officeHours = sc.nextInt();
		System.out.println ("Enter the Faculty rank: ");
		String rank = sc.nextLine();
		
		
		Faculty faculty = new Faculty (name, adress, phoneNumber, emailAdress, office, month, day, year, salary, officeHours, rank);
		
		
		
		System.out.println ("Enter staff name: ");
		 name = sc.nextLine();
		System.out.println ("Enter staff adress: ");
		 adress = sc.nextLine();
		System.out.println ("Enter staff phone number: ");
		 phoneNumber = sc.nextLine();
		System.out.println ("Enter staff email: ");
		 emailAdress = sc.nextLine();
		System.out.println ("Enter satff office building and number: ");
		  office = sc.nextLine();
		System.out.println ("Enter the staff month hired: ");
		  month = sc.nextLine();
		System.out.println ("Enter the staff day hired: ");
		  day = sc.nextLine();
		System.out.println ("Enter the staff year hired: ");
		  year = sc.nextLine();
		System.out.println ("Enter the staff salary: ");
		  salary = sc.nextLine();
		System.out.println ("Enter the staff title: ");
		  String title = sc.nextLine();
		   
		  
		  Staff staff = new Staff (name, adress, phoneNumber, emailAdress, office, month, day, year, salary, title); 
		  
		  
		  
		System.out.println (person);  
		System.out.println (student);  
		System.out.println (employee);  
		System.out.println (faculty);  
		System.out.println (staff);  
		
		
	}
	
	
	
	
	
	

}
