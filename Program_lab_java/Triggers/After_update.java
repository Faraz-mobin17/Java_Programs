package Triggers;

import java.sql.*;

public class After_update {
    public static void main(String[] args) throws Exception {
        try {
            String URL = "jdbc:mysql://localhost/university";
            String uname = "root";
            String pwd = "";
            Connection con = DriverManager.getConnection(URL, uname, pwd);
            if (con == null) {
                System.out.println("Connection failed");
            }
            Statement stmt = con.createStatement();
            String QUERY = "INSERT INTO employee VALUES('Faraz', 'Scientist', '2020-10-08', 1),";
            QUERY += "('Teena','Doctor','2020-12-08',2),";
            QUERY += "('Meghna','Actor', '2020-01-01',3);";
            stmt.executeUpdate(QUERY);
            con.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
