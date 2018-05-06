package rooms;

import guests.Guest;

import java.util.ArrayList;

public abstract class Room {


    private int capacity;
    private ArrayList<Guest> guests;



    public Room(int capacity) {

        this.capacity = capacity;
        this.guests = new ArrayList<>();


    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

}



