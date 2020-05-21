package cardealer.vehicles;

import cardealer.enums.VehicleClassification;

public class Truck extends Vehicle {

    public Truck(String VIN, double wholesaleCost, double retailPrice, int modelYear, String make, String model, String color, VehicleClassification vehicleClass) {
        super(VIN, wholesaleCost, retailPrice, modelYear, make, model, color, vehicleClass);
    }
}