package Prepared;

import java.sql.*;
import java.io.*;

public class Insert {
    public static void main(String args[]) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/mca", "root", "")) {
            if (conn != null) {
                System.out.println("connected tothe database!");
            } else {
                System.out.println("failed to make connection!");
            }
            String sql = "insert into student(Name,city) value(?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter your name");
            String Name = br.readLine();
            System.out.println("Enter city:");
            String City = br.readLine();
            pstmt.setString(1, Name);
            pstmt.setString(2, City);
            pstmt.executeUpdate();
            System.out.println("Inserted....");
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
