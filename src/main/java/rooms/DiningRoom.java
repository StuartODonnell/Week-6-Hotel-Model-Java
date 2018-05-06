package rooms;

public class DiningRoom extends Room{

    private String name;


    public DiningRoom(String name, int capacity) {
        super(capacity);
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
