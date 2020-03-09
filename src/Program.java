
public class Program {
	
	public static void main (String[] args)
	{
		
		
		GeometricObject geo = new Octagon();
		
		Octagon octagon = new Octagon();
		
		Octagon octagon2 = (Octagon) octagon.clone();
		
		int compared = octagon.compareTo(octagon2);
		
		
		if (compared == 0)
		{
			System.out.println ("They are the same.");
			
		}
		
		else if (compared == -1)
		{
			System.out.println ("Octagon 2 is smaller.");
		}
		
		else
		{
			System.out.println ("Octagon 2 is bigger.");
		}
		
		
		System.out.println (octagon);
		System.out.println (octagon2);
		
		
		
		
	}
	
	

}
