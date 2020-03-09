
public class mainHouse {

	public static void main(String[] args) {
		int stories = 1, doors = 3, windows = 10;
		boolean doorOpen = true;
		
		ranchHouse ranch = new ranchHouse( stories,  doors,  windows,  doorOpen);
		
		
		
		ranch.numOfWindows();
		ranch.numOfDoors();
		ranch.numOfStories();
		ranch.doorOpen();
		
		ranch.enterHome();

	}

}
