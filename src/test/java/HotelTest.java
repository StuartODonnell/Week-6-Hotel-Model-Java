import guests.Guest;
import hotels.Hotel;
import org.junit.Before;
import rooms.BedRoom;
import rooms.BedroomType;
import rooms.ConferenceRoom;
import rooms.DiningRoom;


import static org.junit.Assert.*;

public class HotelTest {

    Hotel hotel;
    BedRoom bedroom;
    ConferenceRoom conferenceroom;
    DiningRoom diningroom;
    Guest guest;


    public void before() {
        hotel = new Hotel("Hotel, Motel, Holiday Inn");
        bedroom = new BedRoom(BedroomType.SUITE, 1, 1000.00);
        conferenceroom = new ConferenceRoom("The Sir Steve Redgrave Suite", 750.00, 200 );
        diningroom = new DiningRoom("Forking Good Food", 250);
    }



}