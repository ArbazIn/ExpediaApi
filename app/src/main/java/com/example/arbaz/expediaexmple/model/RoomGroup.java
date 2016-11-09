package com.example.arbaz.expediaexmple.model;

import java.io.Serializable;

public class RoomGroup implements Serializable{
	public Room room;

	public void setRoom(Room room){
		this.room = room;
	}

	public Room getRoom(){
		return room;
	}
}
