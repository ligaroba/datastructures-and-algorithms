package hr;

import hr.factories.TaxCalculatorFactory;
import hr.interfaces.TaxCalculator;
import hr.logging.ConsoleLogger;
import hr.persistence.EmployeeFileSerializer;
import hr.persistence.EmployeeRepository;
import hr.personel.Employee;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public class SaveEmployeeMain {
    public static void main(String[] args) {

        // Grab Employee
        EmployeeFileSerializer fileSerializer =new EmployeeFileSerializer();
        EmployeeRepository repository = new EmployeeRepository(fileSerializer);
        ConsoleLogger consoleLogger =new ConsoleLogger();
        List<Employee>  employees = repository.findAll();

        // Save all
        for(Employee e : employees){
            try {
                repository.saveEmployee(e);
                consoleLogger.writeInfo(" Saved Employee " +e.toString());
            } catch (IOException ioException) {
                consoleLogger.writeError(" Could not save employee",ioException);
            }
        }

        // Calculate taxes
        Locale locale=new Locale("en","US");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);

        // Create tax Calculator
        double totalTaxes = 0;
        for(Employee employee : employees){
            TaxCalculator taxCalculator =TaxCalculatorFactory.create(employee);
            //Compute Individual taxes
            double tax = taxCalculator.calculate(employee);
            String formattedTax = currencyFormatter.format(tax);
            consoleLogger.writeInfo(employee.getFullNames() + " taxes " + formattedTax);

            // add to company total taxes
            totalTaxes+=taxCalculator.calculate(employee);
        }
        consoleLogger.writeInfo("Total taxes " + currencyFormatter.format(totalTaxes));

    }
}
