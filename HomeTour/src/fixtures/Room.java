package fixtures;

public class Room extends Fixture {

	
	
	public Room[] exits = new Room[10];
    
	
	
	public Room(String name, String shortDescription, String longDescription) {
		super( name, shortDescription, longDescription);
		this.exits =new Room[10];
	}
	
	public  Room[] getExits(){
		return this.exits;
	}
	
	public void setExits(Room[] exits) {
		this.exits = exits;
	}
	
	public Room getExit(String direction) {
	   direction = direction.toLowerCase();
	   if(direction.equals("north")) {
		   return exits[0];
	   }
	   else if (direction.equals("east")) {
		   return exits[1];
	   }
	   else if(direction.equals("south")) {
		   return exits[2];
	   }
	   else if(direction.equals("west")) {
		   return exits[3];
	   }
	   else
		   return exits[4];
	}
	public void setExit(Room north,Room east,Room south, Room west)
	{
		this.exits[0] = north;
		this.exits[1] = east;
		this.exits[2] = south;
		this.exits[3] = west;
		this.exits[4] = this;
	}

 }
