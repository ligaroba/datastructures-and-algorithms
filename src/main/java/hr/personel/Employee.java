package hr.personel;

public class Employee {
    private String fName;
    private String lName;
    private int monthlyIncome;
    private int nbHoursPerWeek;

  /*
    Models an Employee from Business perspective
   */
    public Employee(String fullName,int monthlyIncome){
      String[] name= fullName.split(" ");
      this.fName=name[0];
      this.lName=name[1];
      this.monthlyIncome=monthlyIncome;

    }
    public String getEmail(){
        return fName+ "." + lName + "@predhr.com";
    }

    @Override
    public String toString() {
        return this.fName +" " + this.lName +" - " + this.monthlyIncome;
    }

    public String getFullNames() {
        return this.fName +" " + this.lName;
    }

    public int  getMonthlyIncome() {
        return this.monthlyIncome;
    }


    public void requestTimeOff(int i, Employee manager) {

    }
}
