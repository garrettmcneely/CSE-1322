
public class AllInclusiveVacation extends Vacation{
	String brand;
	int price, rating;

	AllInclusiveVacation (int budget, String destination, String brand, int rating, int price)
	{
		super (budget,destination);
		
		this.brand = brand;
		this.price = price;
		this.rating = rating;
		this.budget = budget;
		this.destination = destination;
		
		}
	
	@Override
	public String toString ()
	{
		return ("Budget: "+budget+", Destination: "+destination+", Brand: "+brand+", Rating: "
				+rating+" stars, Price: "+price);
	}

	@Override
	public void Budget() {
		int difference = 0;
		if (price > budget)
		{
			difference = price-budget;
			System.out.println ("This vacation is "+difference+" over budget.");
		}
		else 
		{
			difference = budget-price;
			System.out.println ("This vacation is "+difference+" under budget.");
		}
		
	}
	
	
	

}
