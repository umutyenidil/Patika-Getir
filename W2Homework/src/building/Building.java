package building;

public abstract class Building {
    protected int price;
    protected int squareMeters;
    protected int roomCount;
    protected int livingRoomCount;

    public Building(int price, int squareMeters, int roomCount, int livingRoomCount) {
        this.price = price;
        this.squareMeters = squareMeters;
        this.roomCount = roomCount;
        this.livingRoomCount = livingRoomCount;
    }

    public int getPrice() {
        return price;
    }

    public int getSquareMeters() {
        return squareMeters;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public int getLivingRoomCount() {
        return livingRoomCount;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "price:" + price +
                ", squareMeters:" + squareMeters +
                ", roomCount:" + roomCount +
                ", livingRoomCount:" + livingRoomCount +
                '}';
    }
}