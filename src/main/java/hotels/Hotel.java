package hotels;

import rooms.BedRoom;
import rooms.ConferenceRoom;
import rooms.DiningRoom;

import java.util.ArrayList;

public class Hotel {
    private String name;
    ArrayList<BedRoom> bedrooms;
    ArrayList<ConferenceRoom> conferencerooms;
    ArrayList<DiningRoom> diningrooms;

    public Hotel(String name) {
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

    public void addBedroomToHotel(BedRoom bedroom){
     this.bedrooms.add(bedroom);
    }

    public void addConferenceRoomToHotel(ConferenceRoom conferenceroom){
        this.conferencerooms.add(conferenceroom);
    }

    public void addDiningRoomToHotel(DiningRoom diningroom){
        this.diningrooms.add(diningroom);
    }

    public int countBedrooms(){

        return this.bedrooms.size();
    }

    public int countConferenceRooms(){

        return this.conferencerooms.size();
    }

    public int countDiningRooms(){

        return this.diningrooms.size();
    }

}
