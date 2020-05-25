package structuraldesignpatterns.facade;

import java.util.List;

public class FacadeDemo {

    public static void main(String[] args) {
        String insertSQL=" INSERT INTO ADDRESSES (ID, Streetname ," +
                " City ) " +
                "VALUES (123,'Tassia Fedha','Nairobi,KE')";

        JdbcFacade jdbcFacade = new JdbcFacade();
       if(jdbcFacade.createTable()>0)
            System.out.println("Table created");

        System.out.println(" About to insert : " + insertSQL);
        if(jdbcFacade.insertTable(insertSQL)>0){
            System.out.println(" Record Inserted");
        }


        List<JdbcFacade.Address> addresses =jdbcFacade.getAddress();
        if(addresses.size()>0)
             for (JdbcFacade.Address addr:  addresses){
                 System.out.println("ID : " + addr.getId()+ "\n"+
                        "StreetName : " + addr.getStreetName() +  " \n" +
                         "City : " + addr.getCity());
             }


    }
}
