package ResultSet;

import java.sql.*;

public class FetchRecord2 {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/university";
            String uname = "root";
            String pwd = "";

            Connection con = DriverManager.getConnection(url, uname, pwd);
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery("select DATE from salaries");

            // getting the record of 3rd row
            rs.absolute(2);
            System.out.println(rs.getString(1) + " ");

            con.close();
        } catch (SQLException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
