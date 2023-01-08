package Triggers;

import java.sql.*;

public class Before_insert {
    public static void main(String[] args) throws Exception {
        try {
            String URL = "jdbc:mysql://localhost/university";
            String uname = "root";
            String pwd = "";
            Connection con = DriverManager.getConnection(URL, uname, pwd);
            if (con == null) {
                System.out.println("Connection failed");
            }
            PreparedStatement stmt = con.prepareStatement("insert into employee values(?,?,?,?)");

            stmt.setString(1, pwd);
            con.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
