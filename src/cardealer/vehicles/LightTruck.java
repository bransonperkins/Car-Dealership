package cardealer.vehicles;

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

    public boolean isIs4wd() {
        return is4wd;
    }

    public void setIs4wd(boolean is4wd) {
        this.is4wd = is4wd;
    }

    public LightTruck (String VIN, double wholesaleCost, double retailPrice, int modelYear, String make, String model,
                      String color, long towingCapacity, long truckWeight, boolean is4wd, VehicleClassification vehicleClass) {
        super(VIN, wholesaleCost, retailPrice, modelYear, make, model, color, vehicleClass);
        this.towingCapacity = towingCapacity;
        this.truckWeight = truckWeight;
        this.is4wd = is4wd;
        this.grossCombinedWeight = this.towingCapacity + this.truckWeight;
    }

    @Override
    public String toString() {
        String str = super.toString();

        if (is4wd) {
            str += ", (4WD)";
        }
        return str;
    }

}