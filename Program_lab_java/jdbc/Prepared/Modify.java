package Prepared;

import java.sql.*;

public class Modify {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/mca";
            String uname = "root";
            String pwd = "";
            Connection con = DriverManager.getConnection(url, uname, pwd);
            String query = "ALTER TABLE student MODIFY COLUMN sid VARCHAR(255)";
            PreparedStatement ptstmt = con.prepareStatement(query);
            int ans = ptstmt.executeUpdate();
            System.out.println(ans + " record modified");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
