package structuraldesignpatterns.adapter;

public class EmployeeLdap {
    private String cn;
    private String givenName;
    private String email;

    public EmployeeLdap(String cn, String givenName, String email) {
        this.cn = cn;
        this.givenName = givenName;
        this.email = email;
    }

    public String getCn() {
        return cn;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getEmail() {
        return email;
    }
}
