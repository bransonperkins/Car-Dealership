package cardealer.main;

import cardealer.departments.Department;
import cardealer.departments.FinanceDepartment;
import cardealer.departments.SalesDepartment;
import cardealer.departments.ServiceDepartment;
import cardealer.vehicles.LightTruck;
import cardealer.enums.VehicleClassification;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Dealership {

    public static void main(String[] args) {

        LightTruck tacoma = new LightTruck("234JLKD234", 48000.00, 62000.00,
                2019, "Toyota", "Tacoma", "Black", 10000L,
                90000L, true, VehicleClassification.NEW);

        if (tacoma.getIs4wd()) {
            int gears = tacoma.xferCase.getNumGears();
            System.out.println("Number of gears: " + gears);
        }

        tacoma.printVehicleType();

//        Leaseable lease = new Car("52430899FD", 33000.00, 42000.00, 2019,
//                "Chevrolet", "Impala", "White", VehicleClassification.NEW);

//        System.out.println("Number of months to lease: " + lease.getLeaseTerm());

        // Instantiate new object for each Department
        ServiceDepartment service = new ServiceDepartment();
        SalesDepartment sales = new SalesDepartment();
        FinanceDepartment finance = new FinanceDepartment();

        List<Department> departments = new ArrayList<>();
        departments.add(service);
        departments.add(finance);
        departments.add(sales);

        Department.printIsOpen(departments, LocalDateTime.now());
//
//        Vehicle vehicle = new Vehicle("123", 20500, 24000, 2016,
//                "Chevy", "Impala", "Black", VehicleClassification.NEW);
//        System.out.println(vehicle.toString());

    }

}
