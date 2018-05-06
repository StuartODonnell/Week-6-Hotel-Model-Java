import guests.Guest;
import org.junit.Before;
import org.junit.Test;
import rooms.BedRoom;
import rooms.BedroomType;
import rooms.ConferenceRoom;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    Guest guest1;
    Guest guest2;
    Guest guest3;
    Guest guest4;

    @Before
    public void before(){

        conferenceRoom = new ConferenceRoom("The Jocky Wilson Suite", 1000.00, 100);
        guest1 = new Guest();
        guest2 = new Guest();
        guest3 = new Guest();
        guest4 = new Guest();
    }

    @Test
    public void hasName(){
        assertEquals("The Jocky Wilson Suite", conferenceRoom.getName());

        }

    @Test
    public void setName(){
        conferenceRoom.setName("The Gary Mabbut Suite");
        assertEquals("The Gary Mabbut Suite", conferenceRoom.getName());
    }

    @Test
    public void hasRoomRate(){

        assertEquals(1000.00, conferenceRoom.getRoomRate(),0.1);
    }

    @Test
    public void setRoomRate(){
        conferenceRoom.setRoomRate(750.00);
        assertEquals(750.00, conferenceRoom.getRoomRate(),0.1);
    }

    @Test
    public void addGuestToRoom(){
        conferenceRoom.addGuest(guest1);
        conferenceRoom.addGuest(guest2);
        conferenceRoom.addGuest(guest3);
        conferenceRoom.addGuest(guest4);

        assertEquals(4, conferenceRoom.countGuestsInRoom());
    }

    @Test
    public void removeGuestFromRoom(){
        conferenceRoom.addGuest(guest1);
        conferenceRoom.addGuest(guest2);
        conferenceRoom.addGuest(guest3);
        conferenceRoom.addGuest(guest4);

        conferenceRoom.removeGuestFromRoom();
        assertEquals(3, conferenceRoom.countGuestsInRoom());

    }

    @Test
    public void canGetRoomCapacity(){

        assertEquals(100, conferenceRoom.getCapacity());
    }

    @Test
    public void canSetRoomCapacity(){
        conferenceRoom.setCapacity(150);
        assertEquals(150, conferenceRoom.getCapacity());
    }
}
