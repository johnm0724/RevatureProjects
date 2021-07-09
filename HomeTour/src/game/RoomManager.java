package game;
import fixtures.Room;


   

public class RoomManager {
	
	public Room[] rooms;
    public Room startingRoom;
    
    public RoomManager(int roomCount) {
    	super();
    	rooms = new Room[roomCount];
    }
    
    
	public void init() {
		
		Room foyer = new Room(
				       "The Foyer",
				       "a small foyer",
				       "The small entryway of a neo-colonial houes. A dining room is open to the south, where a large table can be seen ." 
				       +  "\n"  +  "The hardwood floor leads west into doorway, next to a staircase that leads up to a second floor. "  +
				        "\n" + "To the north is a  small room , where you can see a piano. ");
                     this.rooms[0] = foyer ;
                   
                   
       Room diningroom = new Room("The dining room",
    		   "a table made for a family stands in the middle oo the room. ",
    		   " new direction  ");
         this.rooms[1] = diningroom;
            
       Room  staircase = new Room(
    		   "The staircase",
    		   "A staircase that leads to second floor",
    		   "new direction");
             this.rooms[2] = staircase;
               
       Room pianoroom = new Room(
    		   "The piano room", 
    		   "small piano space",
    		   "The down a small hallway leading to the piano man playing the piano. ");
            this.rooms[3] = pianoroom;
      // Room masterbed = new Room(
    	//	   " The master Bedroom",
    		//   " large room",
    		  // " the largest room on this floor ");
             //this.rooms[4] = masterbed;
    		   
          
            
            
            this.startingRoom = foyer;
            
            foyer.setExit(pianoroom,foyer,diningroom,staircase);
            diningroom.setExit(foyer,diningroom,diningroom,diningroom);
            staircase.setExit(staircase, foyer, staircase, staircase);
            pianoroom.setExit(pianoroom, pianoroom, foyer, pianoroom);
            
	}	
	
	public Room getStartingRoom() {
		return this.startingRoom;
	}
	
	public void setStartingRoom(Room startingRoom) {
		this.startingRoom = startingRoom;
	}
	
	public Room[] getRooms() {
		return this.rooms;
	}
	
	public Room getRoom(int i) {
		return rooms[i];
	}
	public void setRoom(Room[] rooms) {
		this.rooms = rooms;
	}
}
