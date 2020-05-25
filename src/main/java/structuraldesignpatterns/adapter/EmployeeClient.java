package structuraldesignpatterns.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
    public List<Employee> getListEmployee (){
        List<Employee> employees = new ArrayList<>();

        Employee employeeFromDB = new EmployeeDB("1234","John Wick","john@wick.com");
        employees.add(employeeFromDB);

        EmployeeLdap employeeLdap = new EmployeeLdap("chewie", "Solo Han","han@solo.com");
        employees.add(new EmployeeLdapAdapter(employeeLdap));

        EmployeeCSV employeeFromCSV = new EmployeeCSV("567,Sharlock Holmes, sharlock@holmes.com");
        employees.add(new EmployeeLdapAdapterCSV(employeeFromCSV));

        return employees;
    }
}
