import guests.Guest;
import hotels.Hotel;
import org.junit.Before;
import org.junit.Test;
import rooms.BedRoom;
import rooms.BedroomType;
import rooms.ConferenceRoom;
import rooms.DiningRoom;


import static org.junit.Assert.*;

public class HotelTest {

    Hotel hotel;
    BedRoom bedroom1;
    BedRoom bedroom2;
    BedRoom bedroom3;
    BedRoom bedroom4;
    ConferenceRoom conferenceroom1;
    ConferenceRoom conferenceroom2;
    DiningRoom diningroom1;
    Guest guest1;
    Guest guest2;
    Guest guest3;
    Guest guest4;

    @Before
    public void before() {
        hotel = new Hotel("Hotel, Motel, Holiday Inn");
        bedroom1 = new BedRoom(BedroomType.SUITE, 1, 1000.00);
        bedroom2 = new BedRoom(BedroomType.DOUBLE,2,150.00);
        bedroom3 = new BedRoom(BedroomType.FAMILY,3,200.00);
        bedroom4 = new BedRoom(BedroomType.TWIN,4,150.00);
        conferenceroom1 = new ConferenceRoom("The Sir Steve Redgrave Suite", 750.00, 200 );
        conferenceroom2 = new ConferenceRoom("The Brian Potter Suite", 350.00, 100 );
        diningroom1 = new DiningRoom("Forking Good Food", 250);
        hotel.addBedroomToHotel(bedroom1);
        hotel.addBedroomToHotel(bedroom2);
        hotel.addBedroomToHotel(bedroom3);
        hotel.addBedroomToHotel(bedroom4);
        hotel.addConferenceRoomToHotel(conferenceroom1);
        hotel.addConferenceRoomToHotel(conferenceroom2);
        hotel.addDiningRoomToHotel(diningroom1);
        guest1 = new Guest();
        guest2 = new Guest();
        guest3 = new Guest();
        guest4 = new Guest();


    }

    @Test
    public void canAddBedroomToHotel(){
        assertEquals(4, hotel.countBedrooms());


}

    @Test
    public void canAddConferenceRoomToHotel(){
        assertEquals(2, hotel.countConferenceRooms());


    }

    @Test
    public void canAddDiningRoomToHotel(){
        assertEquals(1, hotel.countDiningRooms());

    }

}