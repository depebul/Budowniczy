package builderTest.model;

public class HouseButBetter {
    private int numberOfRooms;
    private int numberOfBathrooms;
    private boolean hasGarage;
    private boolean hasSwimmingPool;
    private boolean hasGarden;
    private String roofType;
    private String windowType;
    private String location;

    private HouseButBetter(Builder builder) {
        this.numberOfRooms = builder.numberOfRooms;
        this.numberOfBathrooms = builder.numberOfBathrooms;
        this.hasGarage = builder.hasGarage;
        this.hasSwimmingPool = builder.hasSwimmingPool;
        this.hasGarden = builder.hasGarden;
        this.roofType = builder.roofType;
        this.windowType = builder.windowType;
        this.location = builder.location;
    }

    @Override
    public String toString() {
        return "House{" +
                "numberOfRooms=" + numberOfRooms +
                ", numberOfBathrooms=" + numberOfBathrooms +
                ", hasGarage=" + hasGarage +
                ", hasSwimmingPool=" + hasSwimmingPool +
                ", hasGarden=" + hasGarden +
                ", roofType='" + roofType + '\'' +
                ", windowType='" + windowType + '\'' +
                ", location='" + location + '\'' +
                '}';
    }


    public static class Builder {
        private int numberOfRooms;
        private int numberOfBathrooms;
        private boolean hasGarage;
        private boolean hasSwimmingPool;
        private boolean hasGarden;
        private String roofType;
        private String windowType;
        private String location;

        public Builder setNumberOfRooms(int numberOfRooms) {
            this.numberOfRooms = numberOfRooms;
            return this;
        }

        public Builder setNumberOfBathrooms(int numberOfBathrooms) {
            this.numberOfBathrooms = numberOfBathrooms;
            return this;
        }

        public Builder setHasGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public Builder setHasSwimmingPool(boolean hasSwimmingPool) {
            this.hasSwimmingPool = hasSwimmingPool;
            return this;
        }

        public Builder setHasGarden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        public Builder setRoofType(String roofType) {
            this.roofType = roofType;
            return this;
        }

        public Builder setWindowType(String windowType) {
            this.windowType = windowType;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = location;
            return this;
        }

        public HouseButBetter build() {
            return new HouseButBetter(this);
        }
    }
}
