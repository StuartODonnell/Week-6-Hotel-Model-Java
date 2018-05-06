import guests.Guest;
import org.junit.Before;
import org.junit.Test;
import rooms.ConferenceRoom;
import rooms.DiningRoom;
import rooms.Room;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom;

    Guest guest1;
    Guest guest2;
    Guest guest3;
    Guest guest4;

    @Before
    public void before(){

        diningRoom = new DiningRoom("The Breakfast Club", 100);
        guest1 = new Guest();
        guest2 = new Guest();
        guest3 = new Guest();
        guest4 = new Guest();
    }

    @Test
    public void hasName(){
        assertEquals("The Breakfast Club", diningRoom.getName());

    }

    @Test
    public void setName(){
        diningRoom.setName("Snack Shack");
        assertEquals("Snack Shack", diningRoom.getName());
    }


    @Test
    public void addGuestToRoom(){
        diningRoom.addGuest(guest1);
        diningRoom.addGuest(guest2);
        diningRoom.addGuest(guest3);
        diningRoom.addGuest(guest4);

        assertEquals(4, diningRoom.countGuestsInRoom());
    }

    @Test
    public void removeGuestFromRoom(){
        diningRoom.addGuest(guest1);
        diningRoom.addGuest(guest2);
        diningRoom.addGuest(guest3);
        diningRoom.addGuest(guest4);

        diningRoom.removeGuestFromRoom();
        assertEquals(3, diningRoom.countGuestsInRoom());

    }

    @Test
    public void canGetRoomCapacity(){

        assertEquals(100, diningRoom.getCapacity());
    }

    @Test
    public void canSetRoomCapacity(){
        diningRoom.setCapacity(150);
        assertEquals(150, diningRoom.getCapacity());
    }
}
