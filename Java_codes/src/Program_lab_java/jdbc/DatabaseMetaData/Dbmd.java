package DatabaseMetaData;
import java.sql.*;
public class Dbmd {
    public static void main(String[] args) throws Exception {
        try {
            String url = "jdbc:mysql://localhost:3306/university";
            String uname = "root";
            String pwd = "";

            Connection con = DriverManager.getConnection(url, uname, pwd);
            DatabaseMetaData rsmd = con.getMetaData();

            // getting the record of 3rd row
            System.out.println("Driver Name: "+ rsmd.getDriverName());  
            System.out.println("Driver Version: " + rsmd.getDriverVersion());  
            System.out.println("UserName: "+ rsmd.getUserName());  
            System.out.println("Database Product Name: "+rsmd.getDatabaseProductName());  
            System.out.println("Database Product Version: "+rsmd.getDatabaseProductVersion()); 

            con.close();
        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }
}
