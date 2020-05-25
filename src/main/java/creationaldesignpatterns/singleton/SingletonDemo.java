package creationaldesignpatterns.singleton;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class SingletonDemo {
   /*

   Singleton :
    private Constructor
    No interface
    returns the same instance for every single call of getInstance()

    */

    public static void main(String[] args) {
        DbSingleton instance = DbSingleton.getInstance();
        // Getting perfomance metrics
        long timeBefore=0;
        long timeAfer=0;
        timeBefore =System.currentTimeMillis();
        Connection conn = instance.getConnection();
        timeAfer =System.currentTimeMillis();

        System.out.println(timeAfer-timeBefore);

        Statement statmnt;
        try {
            statmnt = conn.createStatement();
            int count = statmnt.executeUpdate("" +
                    " CREATE TABLE ADDRESSES (ID INT, Streetname varchar(20)," +
                    " City varchar(20))");
            System.out.println("Table Created ");
            conn.close();
        }catch (SQLException e){
            e.printStackTrace();
        }

        timeBefore =System.currentTimeMillis();
        Connection conn2 = instance.getConnection();
        timeAfer =System.currentTimeMillis();
        System.out.println(timeAfer-timeBefore);


    }
}
