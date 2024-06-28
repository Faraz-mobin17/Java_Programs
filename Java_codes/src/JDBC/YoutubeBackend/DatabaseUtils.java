
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseUtils {
    private String connectionString;
    private String username, password;

    public DatabaseUtils() {
        connectionString = "jdbc:mysql://localhost:3306/youtube";
        username = "root";
        password = "toor";
    }

    public DatabaseUtils(String con, String username, String password) {
        this.connectionString = con;
        this.username = username;
        this.password = password;
    }

    public Connection connectDB() {
        try {
            Connection connection = DriverManager.getConnection(connectionString, username, password);
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("database connection failed");
            return null;
        }
    }

    public void insertRecord(String query, Object... parameters) throws SQLException {
        try (PreparedStatement preparedStatement = connectDB().prepareStatement(query)) {
            // Set parameters in the prepared statement
            for (int i = 0; i < parameters.length; i++) {
                preparedStatement.setObject(i + 1, parameters[i]);
            }

            // Execute the update
            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println(rowsAffected + " record(s) inserted successfully.");
        }
    }

    public boolean searchRecord(String query, Object... parameters) throws SQLException {
        try (PreparedStatement preparedStatement = connectDB().prepareStatement(query)) {
            // Set parameters in the prepared statement
            for (int i = 0; i < parameters.length; i++) {
                preparedStatement.setObject(i + 1, parameters[i]);
            }

            ResultSet rs = preparedStatement.executeQuery();
            return rs.next();
        }
    }

    public void deleteRecord(String query, int id) throws SQLException {
        try (PreparedStatement preparedStatement = connectDB().prepareStatement(query)) {
            preparedStatement.setInt(1, id);
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Data Deleted Successfully");
            } else {
                System.out.println("Data Not deleted");
            }
        }
    }
}
