package ResultSet;

import java.sql.SQLException;
import java.sql.*;

public class FetchRecord {
    public static void main(String[] args) {

        try {
            String url = "jdbc:mysql://localhost:3306/university";
            String uname = "root";
            String pwd = "";

            Connection con = DriverManager.getConnection(url, uname, pwd);
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery("select DATE from salaries");

            // getting the record of 3rd row
            rs.absolute(3);
            System.out.println(rs.getString(1) + " ");

            con.close();
        } catch (SQLException e) {

        }
    }
}
