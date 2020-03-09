
public class Staff extends Employee {

	String title;
	
	
	
	Staff(String name, String adress, String phoneNumber, String emailAdress, String office, String month,
			String day, String year, String salary, String title) 
	{
		super(name, adress, phoneNumber, emailAdress, office, month, day, year, salary);
		this.title = title;
	}



	@Override
	public String toString() {
		return "Staff [title=" + title + ", office=" + office + ", month=" + month + ", dateHired=" + day
				+ ", salary=" + salary + ", year=" + year + ", name=" + name + ", adress=" + adress + ", phoneNumber="
				+ phoneNumber + ", emailAdress=" + emailAdress + "]";
	}
	
	
	
	
	

}
