package structuraldesignpatterns.adapter;

public class EmployeeLdapAdapter implements Employee {
    private EmployeeLdap employeeLdap;

    public EmployeeLdapAdapter(EmployeeLdap employeeLdap) {
        this.employeeLdap=employeeLdap;
    }

    @Override
    public String getName() {
        return employeeLdap.getGivenName();
    }

    @Override
    public String getID() {
        return employeeLdap.getCn();
    }

    @Override
    public String getEmail() {
        return employeeLdap.getEmail();
    }

   /* @Override
    public String toString() {
        return " ID : " + getID();
    }*/
}
