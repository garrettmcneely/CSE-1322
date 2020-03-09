
public abstract class Vacation {
	
	protected int budget;
	protected String destination;
	
	public Vacation(int budget, String destination) 
	{
		this.budget = budget;
		this.destination = destination;
		
	}

	@Override
	public String toString ()
	{
		return ("Class name: "+getClass()+" budget: "+this.budget+" destination: "+this.destination);
		
	}
	
	abstract public void Budget ();

}
