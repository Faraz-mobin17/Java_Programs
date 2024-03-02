import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class User {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/Youtube";
        String username = "root";
        String password = "toor";
        // VALUES (1, 1, 'user1', 'user1@example.com', 'User 1', 'avatar1',
        // 'coverImage1', 'password1')
        try (Connection con = DriverManager.getConnection(url, username, password)) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter watch history");
            int watchHistory = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter User name");
            String uname = sc.nextLine();
            System.out.println("Enter User email");
            String email = sc.nextLine();
            System.out.println("Enter User fullname");
            String fullname = sc.nextLine();
            System.out.println("Enter User avatar");
            String avatar = sc.nextLine();
            System.out.println("Enter User coverImage");
            String coverImage = sc.nextLine();
            System.out.println("Enter User password");
            String pwd = sc.nextLine();
            String sql = "INSERT INTO Users (watchHistory,username, email, fullname, avatar, coverImage, password) VALUES (?, ?, ?, ?, ?, ?,?);";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, watchHistory);
            pstmt.setString(2, uname);
            pstmt.setString(3, email);
            pstmt.setString(4, fullname);
            pstmt.setString(5, avatar);
            pstmt.setString(6, coverImage);
            pstmt.setString(7, pwd);
            int rowInserted = pstmt.executeUpdate();
            if (rowInserted > 0) {
                System.out.println("A new User has been inserted");
            }
        } catch (SQLException e) {
            System.err.println("Error while inserted data: " + e.getMessage());
        }
    }
}
