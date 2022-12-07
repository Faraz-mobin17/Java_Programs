import java.sql.*;

public class SPC {

	public static void main(String args[]) {
		String URL = "jdbc:mysql://localhost:3306/java";
		String USERNAME = "root";
		String PASSWORD = "";

		try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				Statement statement = conn.createStatement();) {
			String queryDrop = "DROP PROCEDURE IF EXISTS delete_student";
			String queryCreate = "CREATE PROCEDURE delete_student(IN rollno INT)";
			queryCreate += "BEGIN ";
			queryCreate += "DELETE FROM student where sid=rollno; ";
			queryCreate += "END";

			statement.execute(queryDrop);
			statement.execute(queryCreate);
			statement.close();

			System.out.println("Stored procedure created successfully");
			conn.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
}