package ResultSetMetaData;
import java.sql.*;
public class Rsmd {
    public static void main(String[] args) throws Exception {
        try {
            String url = "jdbc:mysql://localhost:3306/university";
            String uname = "root";
            String pwd = "";

            Connection con = DriverManager.getConnection(url, uname, pwd);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select DATE from salaries");
            ResultSetMetaData rsmd = rs.getMetaData();
            System.out.println("Total Column Count" + rsmd.getColumnCount());
            System.out.println(" Column Name of 1st column " + rsmd.getColumnName(1));
            System.out.println(" Column type Name 1st column " + rsmd.getColumnTypeName(1));

            con.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
