package behavioraldesignpatterns.memento;

// Originator
public class Employee {
    private String name;
    private String phone;
    private String address;

    /*public Employee(String name, String phone , String address){
        this.name=name;
        this.phone=phone;
        this.address=address;
    }*/

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }



    @Override
    public String toString() {
        return this.getName() + " : " + this.getPhone() + " : " + this.getAddress();
    }

    public EmployeeMemento save() {
         return new EmployeeMemento(getName(),getPhone());
    }

    public void revert(EmployeeMemento emp) {
        emp.revert(emp);
    }
}
