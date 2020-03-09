import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class PiecemealVacation extends Vacation
{
	ArrayList<String> items = new ArrayList<String>();
	 ArrayList<Integer> itemPrice = new ArrayList<Integer>();
	
	public PiecemealVacation(ArrayList<String> items, ArrayList<Integer> itemPrice, int budget, String destination) {
		super(budget, destination);
		this.items = items;
		this.itemPrice = itemPrice;
		this.budget = budget;
		this.destination = destination;
	}
	
	@Override
	public String toString ()
	{
		return ("Budget: "+budget+", Destination: "+destination);
	}
	
	
	public void printList()
	{
		System.out.println("\t Items\t\tPrice");
		for (int x = 0; x < items.size(); x++) {
            System.out.print("\t"+items.get(x)+"\t");
            System.out.println ("\t"+itemPrice.get(x));
        }
	}
	
	
	
	
	
	@Override
	public void Budget() {
		int price = 0;
		int difference = 0;
		
		for (int x = 0; x < itemPrice.size(); x++) 
		{
			price = price +itemPrice.get(x);
		}
		
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
