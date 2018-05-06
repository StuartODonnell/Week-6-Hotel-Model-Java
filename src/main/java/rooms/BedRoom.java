package rooms;

import java.util.ArrayList;

public class BedRoom extends Room {

    private BedroomType bedroomType;
    private int roomNumber;
    private double roomRate;

    public BedRoom(BedroomType bedroomType, int roomNumber, double roomRate) {
    super(bedroomType.getCapacity());

        this.bedroomType = bedroomType;
        this.roomNumber = roomNumber;
        this.roomRate = roomRate;

    }

    public BedroomType getBedroomType() {
        return bedroomType;
    }

    public void setBedroomType(BedroomType bedroomType) {
        this.bedroomType = bedroomType;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public double getRoomRate() {
        return roomRate;
    }

    public void setRoomRate(double roomRate) {
        this.roomRate = roomRate;
    }
}

