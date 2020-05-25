package hr;

import hr.logging.ConsoleLogger;
import hr.persistence.EmployeeFileSerializer;
import hr.persistence.EmployeeRepository;
import hr.personel.Employee;
import hr.personel.FullTimeEmployee;

import java.util.List;

public class NatHolidayEmployeeTimeOffMain {

    public static void main(String[] args) {
        //Grab Employee
        EmployeeFileSerializer fileSerializer =new EmployeeFileSerializer();
        EmployeeRepository repository = new EmployeeRepository(fileSerializer);
        ConsoleLogger consoleLogger =new ConsoleLogger();

         List<Employee> employees = repository.findAll();
         Employee manager = new FullTimeEmployee("Steve Jackson",5000);

         // Request time off for each employer on
        // National Holiday
        for(Employee e : employees){
            e.requestTimeOff(1,manager);
        }

    }
}
