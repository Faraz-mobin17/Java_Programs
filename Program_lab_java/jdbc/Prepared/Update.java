package Prepared;

import java.sql.*;
import java.io.*;

public class Update {
    public static void main(String args[]) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/mca", "root", "")) {
            if (conn != null) {
                System.out.println("connected tothe database!");
            } else {
                System.out.println("failed to make connection!");
            }
            String sql = "UPDATE student set city = ? WHERE id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter your City to update");
            String city = br.readLine();
            System.out.println("Enter id:");
            String id = br.readLine();
            pstmt.setString(1, city);
            pstmt.setString(2, id);
            pstmt.executeUpdate();
            System.out.println("Updated....");
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
