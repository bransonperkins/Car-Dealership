package cardealer.main;

import cardealer.vehicles.Vehicle;

// Limit our generic class to only be used by Vehicle or those derived from it
// This restriction is called "bounded type"
public class PendingSale<E extends Vehicle> {
    private E someVehicle;

    public E getSomeVehicle() {
        return someVehicle;
    }

    public void setSomeVehicle(E someVehicle) {
        this.someVehicle = someVehicle;
    }

    public PendingSale(E someVehicle) {
        setSomeVehicle(someVehicle);
    }

    public void doSomePaperwork() {
        // Do something here
    }
}