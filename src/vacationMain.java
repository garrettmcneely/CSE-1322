import java.util.ArrayList;
import java.util.Scanner;

public class vacationMain {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the budget of your All-Inclusive vacation.");
		int budget = sc.nextInt();
		
		System.out.println("Enter the destination of your All-Inclusive vacation.");
		String destination = sc.next();
		
		System.out.println("Enter the brand of your All-Inclusive vacation.");
		String brand = sc.next();
		
		System.out.println("Enter the rating of your All-Inclusive vacation.");
		int rating = sc.nextInt();
		
		System.out.println("Enter the price of your All-Inclusive vacation.");
		int price = sc.nextInt();
		
		AllInclusiveVacation allInclusive = new AllInclusiveVacation(budget,destination,brand,rating,price);
		

		System.out.println (allInclusive);
		allInclusive.Budget();
		
		
		
		System.out.println("Enter the budget of your Piecemeal vacation.");
		 budget = sc.nextInt();
		
		System.out.println("Enter the destination of your Piecemeal vacation.");
		 destination = sc.next();
		 
		 ArrayList<String> items = new ArrayList<String>();
		 ArrayList<Integer> itemsPrice = new ArrayList<Integer>();
		 int check = 1;
		 int x = 0;
		 
		while (check == 1)
		{	
			System.out.println("Enter Piecemeal vacation items.");
			 items.add(sc.next());
			
			System.out.println("Enter the price of "+items.get(x));
			 itemsPrice.add(sc.nextInt());
			 x++;
			 
			 System.out.println ("Have you finished entering all your items (0 if yes, 1 if no)");
			 check = sc.nextInt();
		}
			
		
		PiecemealVacation piecemeal = new PiecemealVacation(items, itemsPrice,budget,destination);
		

		System.out.println (piecemeal);
		piecemeal.printList();
		piecemeal.Budget();
		
		
	}

}
