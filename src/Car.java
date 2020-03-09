
public class Car {
	
	String make, model;
	
	int year;
	
	
	Car()
	{
		make = "Toyota";
		model = "Corolla";
		year = 1998;
		
		
	}
	
	
	Car(String x, String y, int z)
	{
		make = x;
		model = y;
		year = z;
		
		
		
	}
	
	public void setMake(String x)
	{
		
		make = x;
		
	}
	
	public void setModel (String x)
	{
		
		model = x;
		
	}
	
	public void setYear (int x)
	{
		year = x;
	}
	
	public String getMake ()
	{
		return make;
	}
	public String getModel ()
	{
		return model;
	}
	public int getYear ()
	{
		return year;
	}
	
	
	
	@Override
	public String toString ()
	{
		
		return ("Car make: "+make+", car model: "+model+", car year: "+year);
	}
	
	

}
