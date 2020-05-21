package cardealer.vehicles;

import cardealer.enums.VehicleClassification;

public class LightTruck extends Vehicle {

    private long towingCapacity, truckWeight, grossCombinedWeight;
    private boolean is4wd;

    public long getGrossCombinedWeight() {
        return grossCombinedWeight;
    }

    public void setGrossCombinedWeight() {
        this.grossCombinedWeight = this.truckWeight + this.towingCapacity;
    }

    public void setGrossCombinedWeight(long grossCombinedWeight) {
        this.grossCombinedWeight = grossCombinedWeight;
    }

    public long getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(long towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    public long getTruckWeight() {
        return truckWeight;
    }

    public void setTruckWeight(long truckWeight) {
        this.truckWeight = truckWeight;
    }

    public boolean getIs4wd() {
        return is4wd;
    }

    public void setIs4wd(boolean is4wd) {
        this.is4wd = is4wd;
    }

    public LightTruck(String VIN, double wholesaleCost, double retailPrice, int modelYear, String make, String model,
                      String color, long towingCapacity, long truckWeight, boolean is4wd, VehicleClassification vehicleClass) {
        super(VIN, wholesaleCost, retailPrice, modelYear, make, model, color, vehicleClass);
        setTowingCapacity(towingCapacity);
        setTruckWeight(truckWeight);
        setIs4wd(is4wd);
        setGrossCombinedWeight(this.towingCapacity + this.truckWeight);

        // Create new TransferCase object if LightTruck is 4WD and store object in Variable xferCase
        if (this.is4wd) {
            this.xferCase = new TransferCase();
        }
    }

    @Override
    public String toString() {
        String str = super.toString();

        if (is4wd) {
            str += ", (4WD)";
        }
        return str;
    }

    public class TransferCase {
        private int numGears;

        public int getNumGears() {
            return numGears;
        }

        public void setNumGears(int numGears) {
            this.numGears = numGears;
        }

        public TransferCase() {
            setNumGears(4);
        }
    }

    public TransferCase xferCase;

}