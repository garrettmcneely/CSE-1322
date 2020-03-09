
public class Faculty extends Employee{
	
	int officeHours;
	String rank;
	

	Faculty(String name, String adress, String phoneNumber, String emailAdress, String office, String month,
			String day, String year, String salary, int officeHours, String rank) 
	{
		super(name, adress, phoneNumber, emailAdress, office, month, day, year, salary);
		this.officeHours = officeHours;
		this.rank = rank;
		
	}


	@Override
	public String toString() {
		return "Faculty [officeHours=" + officeHours + ", rank=" + rank + ", office=" + office + ", month=" + month
				+ ", dateHired=" + day + ", salary=" + salary + ", year=" + year + ", name=" + name + ", adress="
				+ adress + ", phoneNumber=" + phoneNumber + ", emailAdress=" + emailAdress + "]";
	}

	
	
	
}
