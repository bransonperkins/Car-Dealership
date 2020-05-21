package cardealer.vehicles;

import cardealer.enums.VehicleClassification;

public class SUV extends Vehicle {

    public SUV(String VIN, double wholesaleCost, double retailPrice, int modelYear, String make, String model, String color, VehicleClassification vehicleClass) {
        super(VIN, wholesaleCost, retailPrice, modelYear, make, model, color, vehicleClass);
    }
}