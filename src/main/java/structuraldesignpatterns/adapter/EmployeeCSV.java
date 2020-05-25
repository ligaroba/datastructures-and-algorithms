package structuraldesignpatterns.adapter;

import java.util.StringTokenizer;

public class EmployeeCSV {
    private int id;
    private String name;
    private String email;

    public EmployeeCSV(String employeedetails){
        StringTokenizer stringTokenizer  = new StringTokenizer(employeedetails,",");
        if(stringTokenizer.hasMoreElements()){
            id=Integer.parseInt(stringTokenizer.nextToken());
        }
        if(stringTokenizer.hasMoreElements()){
            name=stringTokenizer.nextToken();
        }
        if(stringTokenizer.hasMoreElements()){
            email=stringTokenizer.nextToken();
        }

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
