package structuraldesignpatterns.adapter;

public class EmployeeLdapAdapterCSV implements Employee{
    private EmployeeCSV employeeCSV;

    public EmployeeLdapAdapterCSV(EmployeeCSV  employeeCSV){
        this.employeeCSV=employeeCSV;
    }

    @Override
    public String getName() {
        return employeeCSV.getName();
    }

    @Override
    public String getID() {
        return employeeCSV.getId()+"";
    }

    @Override
    public String getEmail() {
        return employeeCSV.getEmail();
    }
}
