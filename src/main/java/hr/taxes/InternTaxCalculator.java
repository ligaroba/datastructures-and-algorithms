package hr.taxes;

import hr.interfaces.TaxCalculator;
import hr.personel.Employee;

public class InternTaxCalculator implements TaxCalculator {
    private final int RETIREMENT_TAX_PERCENTAGE=10;
    private final int INCOME_TAX_PERCENTAGE=16;
    private final int BASE_HEALTH_INSUARANCE=100;

    @Override
    public double calculate(Employee employee) {
        int monthlyIncome = employee.getMonthlyIncome();
        if(monthlyIncome<350){
            return 0;
        }else{
            return (monthlyIncome*INCOME_TAX_PERCENTAGE)/100;
        }
    }

    }

