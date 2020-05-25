package hr.personel;

import hr.sla.ServiceLicenceAgreement;

public class SubContructor{
    private final int monthlyIncome;
    private int nbHoursPerWeek;
    private String email;
    private String name;

    public SubContructor(String name,String email ,
                         int monthlyIncome ,int nbHoursPerWeek){
   this.name=name;
   this.email=email;
   this.monthlyIncome=monthlyIncome;
   this.nbHoursPerWeek = nbHoursPerWeek;

}

//public void requestTimeOff(int nbDays, Employee manager){
//    throw new RuntimeException("Not implemented");
//}

public boolean approvedSLA(ServiceLicenceAgreement sla){
   /*
   Business logic dor approving a
   service license aggrement for
   a subContractor
  */
    boolean results =false;
    if(sla.getMinUptimePercent() >=98 &&
        sla.getProblemResolutionTimeDays() <= 2
    ){
        results = true;
    }
    System.out.println(" SLA approval for " +
            this.name + " : " + results);

return results;
}
}
