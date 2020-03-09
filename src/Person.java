//Garrett McNeely


public class Person {
	
	 String name, adress, phoneNumber, emailAdress;
	
	
	Person (String name, String adress, String phoneNumber, String emailAdress)
	{
		this.name = name;
		this.adress = adress;
		this.phoneNumber = phoneNumber;
		this.emailAdress = emailAdress;
		
	}


	@Override
	public String toString() {
		return "Person: name=" + name + ", adress=" + adress + ", phoneNumber=" + phoneNumber + ", emailAdress="
				+ emailAdress + " ";
	}


	
	
	

}


	
