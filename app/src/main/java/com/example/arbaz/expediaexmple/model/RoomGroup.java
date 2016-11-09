package com.example.arbaz.expediaexmple.model;

import java.io.Serializable;

public class RoomGroup implements Serializable{
	public Room Room;

	public com.example.arbaz.expediaexmple.model.Room getRoom() {
		return Room;
	}

	public void setRoom(com.example.arbaz.expediaexmple.model.Room room) {
		Room = room;
	}
}
