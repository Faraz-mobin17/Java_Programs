import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Comments {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/Youtube";
        String username = "root";
        String password = "toor";

        try (Connection con = DriverManager.getConnection(url, username, password)) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Comments");
            String content = sc.nextLine();
            String sql = "INSERT INTO Comments(content) VALUES(?)";
            PreparedStatement pstmt = con.prepareStatement(sql);

            pstmt.setString(1, content);

            int rowInserted = pstmt.executeUpdate();
            if (rowInserted > 0) {
                System.out.println("A new Comment has been inserted");
            }
        } catch (SQLException e) {
            System.err.println("Error while inserted data: " + e.getMessage());
        }
    }
}
