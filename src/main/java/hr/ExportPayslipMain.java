package hr;

import hr.documents.Payslip;
import hr.logging.ConsoleLogger;
import hr.persistence.EmployeeFileSerializer;
import hr.persistence.EmployeeRepository;
import hr.personel.Employee;

import java.time.Month;
import java.util.List;

public class ExportPayslipMain {
    public static void main(String[] args) {
        //Grab Employee
        EmployeeFileSerializer fileSerializer =new EmployeeFileSerializer();
        EmployeeRepository repository = new EmployeeRepository(fileSerializer);
        ConsoleLogger consoleLogger =new ConsoleLogger();
        List<Employee> employees = repository.findAll();

        for(Employee e:employees){
            Payslip payslip =new Payslip(e.getFullNames(),e.getMonthlyIncome(), Month.AUGUST);
            String exportText = payslip.toTxt().toUpperCase();
            System.out.println(exportText);

        }

    }
}
