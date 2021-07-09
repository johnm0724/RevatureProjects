package game;
import java.util.Scanner;


public class Main {
  
	static Scanner scanner = new Scanner(System.in); 
	static String[] inputReader = {"",""};
	static boolean game = true;
	static boolean quit = false;
	static Commands com = new Commands();
	public static void main(String[] args) {
		
		RoomManager rm = new RoomManager(4);
		rm.init();
		Player np = new Player();
		np.currentRoom = rm.startingRoom;
		
		
		
	    
		while(game != quit) {
			com.printRoom(np);
			com.parse(com.collectInput(), np);
			
			
		}	
	}
	
      
       
    	

			
}
