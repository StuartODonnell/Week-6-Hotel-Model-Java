package rooms;

public enum BedroomType {

    TWIN(2),
    DOUBLE(2),
    FAMILY(4),
    SUITE(6);

    private int capacity;


    BedroomType(int capacity) {
        this.capacity = capacity;

    }


    public int getCapacity()
    {
        return capacity;
    }


}
