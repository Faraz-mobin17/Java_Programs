package JDBC;

import java.sql.*;

public class Program1 {
    static String url = "jdbc:mysql://localhost:3306/depo";
    static String username = "root";
    static String password = "";
    static String query = "SELECT * FROM items";
    Connection con = null;

    public static void main(String[] args) throws Exception {
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                for (int i = 1; i <= 6; i += 1) {
                    System.out.print(rs.getString(i) + " ");

                }
                System.out.println();
            }
            con.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}