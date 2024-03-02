import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Videos {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/Youtube";
        String username = "root";
        String password = "toor";

        try (Connection con = DriverManager.getConnection(url, username, password)) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter VideFile");
            String videoFile = sc.nextLine();
            System.out.println("Enter Thumbnail");
            String thumbnail = sc.nextLine();
            System.out.println("Enter Owner");
            int owner = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Title");
            String title = sc.nextLine();
            System.out.println("Enter description");
            String description = sc.nextLine();
            System.out.println("Enter duration");
            int duration = sc.nextInt();
            System.out.println("Enter Views");
            int views = sc.nextInt();
            System.out.println("Enter is published");
            boolean isPublished = sc.nextBoolean();
            String sql = "INSERT INTO Videos (videoFile, thumbnail, owner, title, description, duration, views, isPublished) VALUES (?, ?, ?, ?, ?, ?, ?, ?);";

            PreparedStatement pstmt = con.prepareStatement(sql);

            pstmt.setString(1, videoFile);
            pstmt.setString(2, thumbnail);
            pstmt.setInt(3, owner);
            pstmt.setString(4, title);
            pstmt.setString(5, description);
            pstmt.setInt(6, duration);
            pstmt.setInt(7, views);
            pstmt.setBoolean(8, isPublished);

            int rowInserted = pstmt.executeUpdate();
            if (rowInserted > 0) {
                System.out.println("A new Video has been inserted");
            }
        } catch (SQLException e) {
            System.err.println("Error while inserted data: " + e.getMessage());
        }
    }
}
