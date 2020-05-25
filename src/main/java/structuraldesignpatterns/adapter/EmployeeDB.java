package structuraldesignpatterns.adapter;

public class EmployeeDB implements Employee{
    private String id;
    private String name;
    private String email;

    public EmployeeDB(String id,String name, String email){
        this.email=email;
        this.id=id;
        this.name=name;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getID() {
        return id;
    }

    @Override
    public String getEmail() {
        return email;
    }
}
