
// import java.util.*;
import java.sql.*;
import java.io.*;

public class JDBCExample {
	public static void main(String[] args) {
		try {
			// Class.forName("com.mysql.jdbc.Driver");
			String URL = "jdbc:mysql://localhost:3306/bank";
			String USERNAME = "root";
			String PASSWORD = "";
			// String QUERY = "SELECT * FROM account";
			String SQL_QUERY = "INSERT INTO ACCOUNT(account_id, account_number,city) VALUES(?,?,?)";
			Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			if (con == null) {
				System.out.print("Connection not estabilished");
			} else {
				System.out.print("Connection estabilished");
			}

			// Statement stmt = con.createStatement();
			PreparedStatement ptstmt = con.prepareStatement(SQL_QUERY);

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter your account id");
			int account_id = Integer.parseInt(br.readLine());

			System.out.println("Enter your account Number");
			String account_number = br.readLine();

			System.out.println("Enter your City");
			String city = br.readLine();

			ptstmt.setInt(1, account_id);
			ptstmt.setString(2, account_number);
			ptstmt.setString(3, city);
			ptstmt.executeUpdate();

			System.out.print("Inserted...");
			con.close();
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
	}
}