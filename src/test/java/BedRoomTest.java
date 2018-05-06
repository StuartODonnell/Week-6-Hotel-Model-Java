
import guests.Guest;
import org.junit.Before;
import org.junit.Test;
import rooms.BedRoom;
import rooms.BedroomType;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedRoomTest {

    BedRoom bedRoom1;
    BedRoom bedRoom2;
    BedRoom bedRoom3;
    BedRoom bedRoom4;

    Guest guest1;
    Guest guest2;
    Guest guest3;
    Guest guest4;


    @Before
    public void before() {
        bedRoom1 = new BedRoom(BedroomType.TWIN, 1, 40.00);
        bedRoom2 = new BedRoom(BedroomType.DOUBLE, 2, 60.00);
        bedRoom3 = new BedRoom(BedroomType.FAMILY, 3, 150.00);
        bedRoom4 = new BedRoom(BedroomType.SUITE, 100, 1000.00);
        guest1 = new Guest();
        guest2 = new Guest();
        guest3 = new Guest();
        guest4 = new Guest();

    }

    @Test
    public void hasBedRoomType(){
        assertEquals(BedroomType.TWIN, bedRoom1.getBedroomType());

    }

    @Test
    public void canSetRoomType(){
        bedRoom1.setBedroomType(BedroomType.DOUBLE);
        assertEquals(BedroomType.DOUBLE, bedRoom1.getBedroomType());
    }

    @Test
    public void hasroomNumber(){
        assertEquals(3, bedRoom3.getRoomNumber());

    }

    @Test
    public void setRoomNumber(){
        bedRoom4.setRoomNumber(4);
        assertEquals(4, bedRoom4.getRoomNumber());

    }

    @Test
    public void hasRoomRate(){
        assertEquals(60.00, bedRoom2.getRoomRate(),0.1);

    }

    @Test
    public void setRoomRate(){
        bedRoom2.setRoomRate(100.00);
        assertEquals(100.00, bedRoom2.getRoomRate(),0.1);

    }

    @Test
    public void addGuestToRoom(){
        bedRoom3.addGuest(guest1);
        bedRoom3.addGuest(guest2);

        assertEquals(2, bedRoom3.countGuestsInRoom());
    }

    @Test
    public void removeGuestFromRoom(){
        bedRoom3.addGuest(guest1);
        bedRoom3.addGuest(guest2);
        bedRoom3.addGuest(guest3);
        bedRoom3.addGuest(guest4);

        bedRoom3.removeGuestFromRoom();
        assertEquals(3, bedRoom3.countGuestsInRoom());

    }

    @Test
    public void canGetRoomCapacity(){

        assertEquals(6, bedRoom4.getCapacity());
    }

    @Test
    public void canSetRoomCapacity(){
        bedRoom4.setCapacity(10);
        assertEquals(10, bedRoom4.getCapacity());
    }
}