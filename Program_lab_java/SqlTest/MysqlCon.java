package SqlTest;

/*
 * import the package
 * load the driver (depracted in java 1.8 and above)
 * register the driver (depracted in java 1.8 and above)
 * establish the connetion
 * create the statmenet 
 * exectute the statement
 * close the connection
 * 
 * executeQuery() -> for select statments
 * executeUpdate() -> for CRUD operations
 * execute() -> for triggers
 */

import java.sql.*;

public class MysqlCon {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            // here bank is database name, root is username and password is empty
            String URL = "jdbc:mysql://localhost:3306/bank";
            String username = "root";
            String password = "";
            String SelectQuery = "SELECT * FROM account";
            Connection con = DriverManager.getConnection(URL, username, password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(SelectQuery);
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
            }
            stmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
