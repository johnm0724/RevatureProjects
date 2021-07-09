package game;
import java.util.Scanner;
import fixtures.Room;


public class Commands {
	
	static boolean game = true;
	static boolean quit = false;
	static Scanner scanner = new Scanner(System.in);
	static RoomManager rm = new RoomManager(4);
	static Player np = new Player();
	static Room room = new Room("","","");
	public static String[] collectInput() {
		
		String command = scanner.nextLine();
		String[] input = command.split(" ",2);
		
		return input;
	}
	
	 public static void printRoom(Player player) {
		 
			System.out.println("::::Current Room::::");
			System.out.println("Name: " + player.getCurrentRoom().getName());
		    System.out.println("Short Description: " + player.getCurrentRoom().getShortDescription());
		    System.out.println("Long Description: " + player.getCurrentRoom().getLongDescription());
		    
		    }
	
	public static void parse(String[] command, Player player) {
	
	  String action = command[0].toUpperCase().intern();
	  String details = command[1].toUpperCase().intern();
	  
	  if( command.length > 1) {
		  details = command[1].toUpperCase().intern();
	  }
	  if(action == "GO" | action == "MOVE" ) {
		  // moves the player round the house
		if(details == "NORTH") {
		      np.setCurrentRoom(rm.getRoom(3));
		}
		else if(details == "SOUTH") {
			System.out.println("While heading south you hit a votex senting you back to the foyer oh no!!!!");
			np.setCurrentRoom(rm.getRooms()[1]);  
			
		}
		else if(details == "WEST") {
			np.setCurrentRoom(rm.getRoom(2));
			System.out.println("heading west");
		}
		else if(details == "EAST") {
			np.setCurrentRoom(rm.getRoom(0));
			System.out.println("heading east");
		}
	  }
	  else if(action == "INTERACT") {
	  //code for interacting with things			
	  }
	  else if (action == "QUIT") {
		  endGame();
	  }
	
		
	}
	
	public static void endGame() {
		game = quit;
	}
	

}
