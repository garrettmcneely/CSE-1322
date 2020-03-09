
// Garrett McNeely

public class Student extends Person {

	String status;
	
	
	Student(String name, String adress, String phoneNumber, String emailAdress, String status) 
	{
		super(name, adress, phoneNumber, emailAdress);
		
		this.status = status;
		
	}


	@Override
	public String toString() {
		return "Student [status=" + status + ", name=" + name + ", adress=" + adress + ", phoneNumber=" + phoneNumber
				+ ", emailAdress=" + emailAdress + "]";
	}

	
	

	
	
}