package structuraldesignpatterns.facade;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcFacade {
    DbSingleton instance = null;

    public JdbcFacade(){
        this.instance=DbSingleton.getInstance();
    }
    public int createTable() {
        int count =0;
        try{
            instance=DbSingleton.getInstance();
            Connection conn = instance.getConnection();
            Statement sta = conn.createStatement();
            count = sta.executeUpdate( " CREATE TABLE ADDRESSES (ID INT, Streetname varchar(20)," +
                    " City varchar(20))"
            );
            sta.close();
           // conn.close();

        }catch (Exception throwables) {
            throwables.printStackTrace();
        }
        return  count;
    }

    public int insertTable(String sql){
        int count =0;
        try{
            Connection conn = instance.getConnection();
            Statement sta = conn.createStatement();
            count = sta.executeUpdate(sql);
            sta.close();
           // conn.close();

        }catch (Exception throwables) {
            throwables.printStackTrace();
        }
        return  count;
    }

    public List<Address> getAddress(){
        List<Address> addresses = new ArrayList<>();

        int count =0;
        try {
            Connection conn = instance.getConnection();
            Statement sta = conn.createStatement();
            ResultSet rs = sta.executeQuery("SELECT * FROM ADDRESSES");

            Address adrr = new Address();

            while (rs.next()){
                adrr.setId(rs.getInt(1));
                adrr.setStreetName(rs.getString(2));
                adrr.setCity(rs.getString(3));
            }

            addresses.add(adrr);
            rs.close();
            sta.close();
            //conn.close();

        }catch (Exception throwables) {
            throwables.printStackTrace();
        }

        return addresses;

    }

   public  class Address{
        private int id;
        private String streetName;
        private String city;

        public void setId(int id) {
            this.id = id;
        }

        public void setStreetName(String streetName) {
            this.streetName = streetName;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public int getId() {
            return id;
        }

        public String getStreetName() {
            return streetName;
        }

        public String getCity() {
            return city;
        }
    }
}
