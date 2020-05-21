package cardealer.departments;

import cardealer.enums.DepartmentNames;

public class DepartmentFactory {
    public static Department CreateDepartment(DepartmentNames name) {
        Department d = null;

        if (name == null) {
            return null;
        }
        switch (name) {
            case SERVICE:
                d = new ServiceDepartment();
                break;
            case FINANCE:
                d = new FinanceDepartment();
                break;
            case SALES:
                d = new SalesDepartment();
                break;
            default:
        }
        return d;
    }
}
