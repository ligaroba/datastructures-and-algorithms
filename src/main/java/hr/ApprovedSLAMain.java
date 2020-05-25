package hr;


import hr.logging.ConsoleLogger;
import hr.persistence.EmployeeFileSerializer;
import hr.persistence.EmployeeRepository;
import hr.personel.SubContructor;
import hr.sla.ServiceLicenceAgreement;


import java.util.Arrays;
import java.util.List;


public class ApprovedSLAMain {
    public static void main(String[] args) {
        //Grab Employee
        EmployeeFileSerializer fileSerializer =new EmployeeFileSerializer();
        EmployeeRepository repository = new EmployeeRepository(fileSerializer);
        ConsoleLogger consoleLogger =new ConsoleLogger();

        // Define SLA
        int minTimeOffPercent = 98;
        int maxResolutionDays = 2;
        ServiceLicenceAgreement companySla = new ServiceLicenceAgreement(
                minTimeOffPercent,maxResolutionDays
        );
        SubContructor subContructor = new SubContructor(
                "Rebeekah Jackson","rebekah-jackson@abc.com",
                3000,
                15
        );

        SubContructor subContructor2 = new SubContructor(
                "Harry Fitz","harryfitz@def.com",
                3000,
                15
        );

        List<SubContructor> subContractors = Arrays.asList(subContructor,subContructor2);
        //save all
        for(SubContructor sub : subContractors){
              sub.approvedSLA(companySla);

        }


    }
}
