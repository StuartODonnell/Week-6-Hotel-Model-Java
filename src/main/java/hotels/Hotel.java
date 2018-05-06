package hotels;

import rooms.BedRoom;
import rooms.ConferenceRoom;
import rooms.DiningRoom;

import java.util.ArrayList;

public class Hotel {

    ArrayList<BedRoom> bedrooms;
    ArrayList<ConferenceRoom> conferencerooms;
    ArrayList<DiningRoom> diningrooms;

    public Hotel() {
        this.bedrooms = new ArrayList<>();
        this.conferencerooms = new ArrayList<>();
        this.diningrooms = new ArrayList<>();
    }

    public ArrayList<BedRoom> getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(ArrayList<BedRoom> bedrooms) {
        this.bedrooms = bedrooms;
    }

    public ArrayList<ConferenceRoom> getConferencerooms() {
        return conferencerooms;
    }

    public void setConferencerooms(ArrayList<ConferenceRoom> conferencerooms) {
        this.conferencerooms = conferencerooms;
    }

    public ArrayList<DiningRoom> getDiningrooms() {
        return diningrooms;
    }

    public void setDiningrooms(ArrayList<DiningRoom> diningrooms) {
        this.diningrooms = diningrooms;
    }


}
