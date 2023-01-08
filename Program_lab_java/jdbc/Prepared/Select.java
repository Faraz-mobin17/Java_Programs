package Prepared;

import java.sql.*;

public class Select {
    public static void main(String args[]) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/mca", "root", "")) {
            if (conn != null) {
                System.out.println("connected tothe database!");
            } else {
                System.out.println("failed to make connection!");
            }
            String sql = "SELECT * FROM student;";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery(sql);
            System.out.println("Selected....");
            while (rs.next()) {
                System.out.println(rs.getString("sid") + "\t" + rs.getString("name") + "\t" + rs.getString("city"));
            }
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
