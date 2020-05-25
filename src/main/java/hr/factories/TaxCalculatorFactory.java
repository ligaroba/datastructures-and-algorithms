package hr.factories;

import hr.interfaces.TaxCalculator;
import hr.personel.Employee;
import hr.personel.FullTimeEmployee;
import hr.personel.Intern;
import hr.personel.PartTimeEmployee;
import hr.taxes.FullTimeTaxCalculator;
import hr.taxes.InternTaxCalculator;
import hr.taxes.PartTimeTaxCalculator;

public class TaxCalculatorFactory {
    public static TaxCalculator create(Employee employeeType){
       if(employeeType instanceof FullTimeEmployee)
           return new FullTimeTaxCalculator();
       if(employeeType instanceof PartTimeEmployee)
           return new PartTimeTaxCalculator();
       if(employeeType instanceof Intern)
           return new InternTaxCalculator();
       throw new RuntimeException("Invalid employee type");
    }

}
