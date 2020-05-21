package cardealer.vehicles;

import cardealer.enums.VehicleClassification;
import cardealer.interfaces.Discountable;
import cardealer.interfaces.Leaseable;

public class Car extends Vehicle implements Leaseable, Discountable {

    public Car(String VIN, double wholesaleCost, double retailPrice, int modelYear, String make, String model, String color, VehicleClassification vehicleClass) {
        super(VIN, wholesaleCost, retailPrice, modelYear, make, model, color, vehicleClass);
    }

    @Override
    public double getTargetMargin() {
        // use the getTargetMargin() method from the superclass called Vehicle
        return super.getTargetMargin() - 1000;
    }

    // Implementing methods from Leaseable interface
    @Override
    public boolean isLeaseable() {
        return true;
    }

    @Override
    public int getLeaseTerm() {
        return 24;
    }

    @Override
    public int getMaxMilesPerYear() {
        return 15_000;
    }

    // Implement methods from Discountable interface
    @Override
    public float getMaximumDiscountPct() {
        return 18.5f;
    }

    @Override
    public float getPersonDiscount() {
        return 12.5f;
    }

    @Override
    public float getCorporateDiscount() {
        return 20.0f;
    }
}