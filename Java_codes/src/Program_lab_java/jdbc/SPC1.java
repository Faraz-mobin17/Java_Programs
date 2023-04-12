import java.sql.*;

public class SPC1 {

	public static void main(String args[]) {
		String URL = "jdbc:mysql://localhost:3306/java";
		String USERNAME = "root";
		String PASSWORD = "";

		try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				CallableStatement statement = conn.prepareCall("{call delete_student(?)}");) {
			statement.setInt(1, 2);

			statement.execute();
			statement.close();

			System.out.println("Stored procedure called successfully");
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
}