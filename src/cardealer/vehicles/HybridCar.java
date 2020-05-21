package cardealer.vehicles;

import cardealer.enums.VehicleClassification;

public class HybridCar extends Car {

    private int batteryLife, MPG;
    private String chargerType;

    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    public int getMPG() {
        return MPG;
    }

    public void setMPG(int MPG) {
        this.MPG = MPG;
    }

    public String getChargerType() {
        return chargerType;
    }

    public void setChargerType(String chargerType) {
        this.chargerType = chargerType;
    }

    public HybridCar(String VIN, double wholesaleCost, double retailPrice, int modelYear, String make, String model,
                     String color, int batteryLife, int MPG, String chargerType, VehicleClassification vehicleClass) {
        super(VIN, wholesaleCost, retailPrice, modelYear, make, model, color, vehicleClass);
        this.batteryLife = batteryLife;
        this.MPG = MPG;
        this.chargerType = chargerType;
    }
}
