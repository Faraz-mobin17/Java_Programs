import java.sql.*;

public class ModifySelect {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/mca";
            String uname = "root";
            String pwd = "";
            String query = "ALTER TABLE student MODIFY COLUMN sid INT(11)";
            Connection con = DriverManager.getConnection(url, uname, pwd);
            Statement stmt = con.createStatement();
            int ans = stmt.executeUpdate(query);
            System.out.println(ans + "records modified");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
