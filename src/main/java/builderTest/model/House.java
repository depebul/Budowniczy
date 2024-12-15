package builderTest.model;

public class House {
    private int numberOfRooms;
    private int numberOfBathrooms;
    private boolean hasGarage;
    private boolean hasSwimmingPool;
    private boolean hasGarden;
    private String roofType;
    private String windowType;
    private String location;

    public House(int numberOfRooms, int numberOfBathrooms, boolean hasGarage,
                 boolean hasSwimmingPool, boolean hasGarden, String roofType,
                 String windowType, String location) {
        this.numberOfRooms = numberOfRooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.hasGarage = hasGarage;
        this.hasSwimmingPool = hasSwimmingPool;
        this.hasGarden = hasGarden;
        this.roofType = roofType;
        this.windowType = windowType;
        this.location = location;
    }
}


