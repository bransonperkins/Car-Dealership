package cardealer.departments;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class FinanceDepartment extends Department {

    public FinanceDepartment() {
        super("Service", 10);
    }

    @Override
    public boolean isOpenToday(LocalDateTime day) {
        return !day.getDayOfWeek().equals(DayOfWeek.SUNDAY) && !day.getDayOfWeek().equals(DayOfWeek.SATURDAY);
    }

}
