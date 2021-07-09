package game;

import fixtures.Room;

public class Player {
		     
	public Room currentRoom;
	
	public Room getCurrentRoom() {
		return this.currentRoom;
	}
	
	public void setCurrentRoom(Room currentRoom) {
		this.currentRoom = currentRoom;
	}
}
