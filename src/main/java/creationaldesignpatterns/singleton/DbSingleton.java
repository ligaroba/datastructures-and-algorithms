package creationaldesignpatterns.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbSingleton {
    // Add volitile to make Dbsingletone thread safe
    private static volatile DbSingleton instance = null;
    private static volatile Connection conn=null;

    // Add exception to ensure nobody uses reflection
    private DbSingleton(){
        try {
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
            //Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        } catch ( SQLException throwables) {
            throwables.printStackTrace();
        }

        if(conn!=null)
            throw new RuntimeException("Use getInstance() method to create");


        if(instance !=null)
             throw new RuntimeException("Use getInstance() method to create");

    }

    public static DbSingleton getInstance(){
        // making Singleton lazy load instead of eager loading
        if(instance == null){
            // Making the class Thread safe
            synchronized (DbSingleton.class) {
                if (instance==null)
                    instance=new DbSingleton();

            }

        }
        return instance;
    }
    public Connection getConnection(){
        if(conn==null){
            synchronized (DbSingleton.class){
                if(conn==null){
                    try {
                        //jdbc:derby:singletonDB;create=true;user=me;password=mine
                        String dbUrl = "jdbc:derby:singletonDB;create=true";
                        conn = DriverManager.getConnection(dbUrl);
                    }catch (SQLException e){
                        e.printStackTrace();
                    }
                }
            }
        }
        return conn;
    }

}
