package com.example.arbaz.expediaexmple.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by arbaz on 8/11/16.
 */

public class FinalRoomGroup implements Serializable {
    public ArrayList<Room> rooms;

    public FinalRoomGroup(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }
}