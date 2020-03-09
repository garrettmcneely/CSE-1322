
public class Employee extends Person{
	
	String office, month, day;
	String salary;
	String year;
	
	
	

	Employee(String name, String adress, String phoneNumber, String emailAdress, String office, String month, String day, String year, String salary) {
		super(name, adress, phoneNumber, emailAdress);
		
		this.office = office;
		this.month = month;
		this.day = day;
		this.salary = salary;
		this.year = year;
		
		
	}




	@Override
	public String toString() {
		return "Employee [office=" + office + ", month=" + month + ", dateHired=" + day + ", salary=" + salary
				+ ", year=" + year + ", name=" + name + ", adress=" + adress + ", phoneNumber=" + phoneNumber
				+ ", emailAdress=" + emailAdress + "]";
	}
	
	
	
	
	
	
	

}
