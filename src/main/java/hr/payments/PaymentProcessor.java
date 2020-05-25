package hr.payments;

import hr.notifications.EmailNotifier;
import hr.persistence.EmployeeFileSerializer;
import hr.persistence.EmployeeRepository;
import hr.personel.Employee;

import java.util.List;

public class PaymentProcessor {
    /*
    Class responsible for paying Employees
        */

    private EmployeeRepository employeeRepository;

    public PaymentProcessor(){
        EmployeeFileSerializer employeeFileSerializer = new EmployeeFileSerializer();
        this.employeeRepository=new EmployeeRepository(employeeFileSerializer);
    }

    public int sendPayment(){
        List<Employee> employees= this.employeeRepository.findAll();
        int totalPayments=0;
        for(Employee employee  : employees ){
           totalPayments+=employee.getMonthlyIncome();
           //Static method calls is a sign of coupling
            EmailNotifier.notify(employee);
        }
        return totalPayments;
    }
}
