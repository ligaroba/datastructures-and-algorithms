package behavioraldesignpatterns.memento;
// Memento
public class EmployeeMemento {
    private String name;
    private String phone;

    public EmployeeMemento(String name , String phone){
        this.name=name;
        this.phone=phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return name +  " : " + phone;
    }

    public EmployeeMemento save(){
        return new EmployeeMemento(name,phone);
    }
    public void revert(EmployeeMemento emp){
        this.name=emp.getName();
        this.phone=emp.getPhone();
    }
}
