package dealership.departments;

import java.time.LocalDateTime;

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

    public abstract boolean isOpenToday(LocalDateTime day);

    @Override
    public String toString() {
        return this.deptName + " Department";
    }
}
