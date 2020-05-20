package dealership.vehicles;

public class Car extends Vehicle {

    public Car(String VIN, double wholesaleCost, double retailPrice, int modelYear, String make, String model, String color) {
        super(VIN, wholesaleCost, retailPrice, modelYear, make, model, color);
    }

    @Override
    public double getTargetMargin() {
        // use the getTargetMargin() method from the superclass called Vehicle
        return super.getTargetMargin() - 1000;
    }
}