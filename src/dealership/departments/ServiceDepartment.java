package dealership.departments;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class ServiceDepartment extends Department {

    public ServiceDepartment() {
        super("Service", 20);
    }

    @Override
    public boolean isOpenToday(LocalDateTime day) {
        return !day.getDayOfWeek().equals(DayOfWeek.SUNDAY);
    }
}