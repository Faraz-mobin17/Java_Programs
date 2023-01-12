package Prepared;

import java.sql.*;

public class Delete {
    public static void main(String[] args) throws Exception {
        try {
            String url = "jdbc:mysql://localhost:3306/mca";
            String uname = "root";
            String pwd = "";
            Connection con = DriverManager.getConnection(url, uname, pwd);
            String query = "DELETE FROM student WHERE sid = ?";
            PreparedStatement ptstmt = con.prepareStatement(query);
            ptstmt.setInt(1, 1);
            int ans = ptstmt.executeUpdate();
            System.out.println(ans + "record Deleted");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
