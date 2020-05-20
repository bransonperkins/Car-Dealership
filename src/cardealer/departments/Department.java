package cardealer.departments;

import java.time.LocalDateTime;
import java.util.List;

public abstract class Department {

    private String deptName;
    private int numEmployees;

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public int getNumEmployees() {
        return numEmployees;
    }

    public void setNumEmployees(int numEmployees) {
        this.numEmployees = numEmployees;
    }

    public Department() {
        this.deptName = "Generic";
        this.numEmployees = 0;
    }

    public Department(String deptName, int numEmployees) {
        this.deptName = deptName;
        this.numEmployees = numEmployees;
    }

    public static void printIsOpen(List<Department> departments, LocalDateTime today) {
        // Cycle through each department in provided List
        for (Department d : departments) {
            // Print out name of Dept and return if that Dept is open today
            System.out.println(d.toString() + " is open today?" + d.isOpenToday(today));
            // Use instanceof keyword to test if item in list is of a certain object or data type
            if (d instanceof ServiceDepartment) {
                System.out.println(d.toString() + " only closed on Sundays.");
            }
        }
    }

    public abstract boolean isOpenToday(LocalDateTime day);

    @Override
    public String toString() {
        return this.deptName + " Department";
    }

}