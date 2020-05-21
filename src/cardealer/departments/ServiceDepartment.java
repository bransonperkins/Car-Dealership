package cardealer.departments;

import cardealer.vehicles.Vehicle;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class ServiceDepartment extends Department {

    public ServiceDepartment() {
        super("Service", 20);
    }

    // Create association between Vehicle and Service Dept
    // Lifetime of objects are independent of one another
    public boolean changeEngineOil(Vehicle v) {
        return v != null;
    }

    @Override
    public boolean isOpenToday(LocalDateTime day) {
        return !day.getDayOfWeek().equals(DayOfWeek.SUNDAY);
    }

}