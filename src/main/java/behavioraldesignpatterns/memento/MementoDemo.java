package behavioraldesignpatterns.memento;

public class MementoDemo {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Employee emp = new Employee();

        emp.setName("John wick");
        emp.setAddress("111 Main Street ");
        emp.setPhone("888-555-1212");

        System.out.println("Employee before save       " + emp);

        caretaker.save(emp);

        emp.setPhone("444-555-5679");

        System.out.println("Employee after changed phone number       " + emp);

        caretaker.save(emp);

        emp.setPhone("777-555-5679"); // saved not called

        caretaker.revert(emp);

        System.out.println("Employee reverts to last saved point       " + emp);

        caretaker.revert(emp);

        System.out.println("Employee reverts to original      " + emp);

    }
}
