import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Tweets {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/Youtube";
        String username = "root";
        String password = "toor";

        try (Connection con = DriverManager.getConnection(url, username, password)) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Tweet");
            String tweet = sc.nextLine();
            String sql = "INSERT INTO tweets(id,owner,content) VALUES(?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, 2);
            pstmt.setInt(2, 2);
            pstmt.setString(3, tweet);
            int rowInserted = pstmt.executeUpdate();
            if (rowInserted > 0) {
                System.out.println("A new tweet has been inserted");
            }
        } catch (SQLException e) {
            System.err.println("Error whiel inserted data: " + e.getMessage());
        }
    }
}