
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.PreparedStatement;
// import java.sql.SQLException;
import java.sql.*;

public class MysqlBlobInsert {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/java?serverTimezone=UTC";
        String username = "root";
        String password = "";
        String filePath = "C:/Users/FARAZ/Pictures/bill.jpg";
        try {
            // Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(URL, username, password);
            String sql = "INSERT INTO Person(First_name,Last_name,Photo) VALUES(?,?,?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, "bill");
            statement.setString(2, "gates");
            InputStream inputStream = new FileInputStream(new File(filePath));
            statement.setBlob(3, inputStream);
            int row = statement.executeUpdate();
            if (row > 0) {
                System.out.println("A contact was inserted with photo image");
            }
            conn.close();

        } catch (SQLException e) {
            // TODO: handle exception
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}