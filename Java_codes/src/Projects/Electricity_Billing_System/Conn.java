import java.sql.*;
public class Conn {    
        Connection conn;
        Statement stmt;
        private final String URL = "jdbc:mysql://localhost:3306/ebs";
        private final String username = "root";
        private String password = "";
        public Conn() {
            try {
                conn = DriverManager.getConnection(URL, username, password);
                stmt = conn.createStatement();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
}