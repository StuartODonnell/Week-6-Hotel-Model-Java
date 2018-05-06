package rooms;

public class ConferenceRoom extends Room {


    private String name;
    private double roomRate;

    public ConferenceRoom(String name, double roomRate, int capacity) {
        super(capacity);
        this.name = name;
        this.roomRate = roomRate;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRoomRate() {
        return roomRate;
    }

    public void setRoomRate(double roomRate) {
        this.roomRate = roomRate;
    }









}
