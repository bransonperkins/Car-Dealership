package cardealer.dealership;

import cardealer.departments.Department;
import cardealer.departments.FinanceDepartment;
import cardealer.departments.SalesDepartment;
import cardealer.departments.ServiceDepartment;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Dealership {

    public static void main(String[] args) {

        // Instantiate new object for each Department
        ServiceDepartment service = new ServiceDepartment();
        SalesDepartment sales = new SalesDepartment();
        FinanceDepartment finance = new FinanceDepartment();

        List<Department> departments = new ArrayList<>();
        departments.add(service);
        departments.add(finance);
        departments.add(sales);

        Department.printIsOpen(departments, LocalDateTime.now());
    }

}
