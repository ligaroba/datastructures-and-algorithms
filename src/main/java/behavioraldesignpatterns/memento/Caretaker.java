package behavioraldesignpatterns.memento;

import java.util.Stack;

public class Caretaker {

    private Stack<EmployeeMemento> employeeHistory = new Stack<>();

    public void save(Employee emp){
        employeeHistory.push(emp.save());
        System.out.println(employeeHistory.size() + " " + employeeHistory.toString());
    }
    public void revert(Employee emp){
        emp.revert(employeeHistory.pop());

    }
}
