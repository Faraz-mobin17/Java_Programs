import java.sql.*;
public class Conn {
    public static void main(String[] args) {
        try {
            String URL = "jdbc:mysql://localhost:3306/mca";
            String username = "root";
            String password = "";
            Connection con = DriverManager.getConnection(URL, username, password);
            if (con == null) {
                System.out.println("concced not established");
            } else {
                System.out.println("Connecton not established");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
