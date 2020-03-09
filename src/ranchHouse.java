
public class ranchHouse extends House{

	int windows, doors, stories;
	boolean doorOpen;
	
	
	ranchHouse(int stories, int doors, int windows, boolean doorOpen) {
		super(doors, windows, doorOpen);
		
		this.windows = windows;
		this.doors = doors;
		this.stories = stories;
		this.doorOpen = doorOpen;
		
		
	}

	
	
	@Override
	void numOfWindows() {
		System.out.println ("Has "+windows+" window(s)");
		
		
		
	}
	
	void numOfStories()
	{
		System.out.println ("Has "+stories+" stories");
	}
	
	
	void numOfDoors()
	{
		System.out.println ("Has "+doors+" door(s)");
	}
	

	void doorOpen()
	{
		if (doorOpen == true)
		{
			System.out.println ("Door is open");
		}
		
		else 
		{
			System.out.println ("Door is closed");
		}
		
			
	}
}
