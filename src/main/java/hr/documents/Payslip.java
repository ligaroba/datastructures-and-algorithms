package hr.documents;

import java.time.Month;

public class Payslip implements ExportTxtDocument {
    private String employeeName;
    private int monthlyIncome;
    private Month monthOfPay;

    public Payslip(String employeeName,int monthlyIncome,Month monthOfPay){
        this.employeeName=employeeName;
        this.monthlyIncome=monthlyIncome;
        this.monthOfPay=monthOfPay;


    }

    public String getEmployeeName() {
        return employeeName;
    }


    public int getMonthlyIncome() {
        return monthlyIncome;
    }


    public Month getMonthOfPay() {
        return monthOfPay;
    }

    @Override
    public String toTxt() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MONTH : ").append(this.monthOfPay);
        stringBuilder.append(System.lineSeparator());
        stringBuilder.append("NAME : " ).append(this.employeeName);
        stringBuilder.append(System.lineSeparator());
        stringBuilder.append("INCOME : ").append(this.monthlyIncome);
        stringBuilder.append(System.lineSeparator());

        return stringBuilder.toString();
    }




}
