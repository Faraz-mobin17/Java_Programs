package Callable;
import java.sql.*;
public class Add {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/university";
            String uname = "root";
            String pwd = "";
            Connection con = DriverManager.getConnection(url, uname, pwd);
            CallableStatement stmt = con.prepareCall("{call SP_Sum(?,?)}");
            stmt.setInt(1,100);
            stmt.setInt(2, 100);
            stmt.registerOutParameter(1,Types.INTEGER);  
            stmt.execute();
            System.out.println(stmt.getInt(1));
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
