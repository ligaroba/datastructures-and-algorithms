package hr.persistence;

import hr.personel.Employee;
import hr.personel.FullTimeEmployee;
import hr.personel.PartTimeEmployee;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class EmployeeRepository {
    private final EmployeeFileSerializer fileSerializer;
    /*
    Helper methods to perform CRUD operations
     */

    public EmployeeRepository(EmployeeFileSerializer fileSerializer){
        this.fileSerializer=fileSerializer;
    }

   /* public List<Employee> findAll(){
        List<Employee> employees = new ArrayList<>();
        String path = this.getClass().getClassLoader()
                .getResource("employees.csv")
                .getPath();
        try(Scanner scanner = new Scanner(new File(path))){
            //Skip Header
            scanner.nextLine();
            //Process Content
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                Employee employee =createEmployeeFromCSVRecord(line);
                employees.add(employee);

            }
        }catch (FileNotFoundException fileException){
            fileException.printStackTrace();
        }
       return employees;
    }

    private Employee createEmployeeFromCSVRecord(String line) {


    }*/

    public List<Employee> findAll(){
        //Employees are kept in memory for simplicity
        Employee ann =new FullTimeEmployee(" Ann Smitth ",200);
        Employee billy =new FullTimeEmployee(" Billy Leecg ",920);

        Employee steve =new PartTimeEmployee("Steve Jones",800);
        Employee mogda =new PartTimeEmployee("Magda Iovana",920);
        return Arrays.asList(ann,billy,steve,mogda);
    }

    public void saveEmployee(Employee employee) throws IOException {

           String serialedString = this.fileSerializer.serializer(employee);
           Path path = Paths.get(employee.getFullNames().replace(" ", "_") +
                   ".rec");
           Files.write(path, serialedString.getBytes());


    }
}
