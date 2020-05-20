package cardealer.departments;

import java.time.LocalDateTime;

public class SalesDepartment extends Department {
    public SalesDepartment() {
        super("Sales", 50);
    }

    @Override
    public boolean isOpenToday(LocalDateTime day) {
        // Return true because SalesDepartment is open 7 days a week
        return true;
    }

}