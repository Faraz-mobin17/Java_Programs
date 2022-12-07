package MysqlScrolling;

import java.sql.*;

public class MysqlScrolling {
    public static void main(String[] args) {

        try {
            String URL = "jdbc:mysql://localhost:3306/bank";
            String USERNAME = "root";
            String PASSWORD = "";
            Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = st.executeQuery("SELECT * FROM account");
            System.out.println("Records in tables");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " -> " + rs.getString(2) + " -> " + rs.getString(3));
            }
            System.out.println("scrolling started");
            rs.first();
            System.out.println("First Record");
            System.out.println(rs.getInt(1) + " -> " + rs.getString(2));
            System.out.println("Scrolling continues");
            rs.absolute(3);
            System.out.println("THIRD RECORD");
            System.out.println(rs.getInt(1) + " -> " + rs.getString(2));
            rs.last();
            System.out.println("last Record");
            System.out.println(rs.getInt(1) + " -> " + rs.getString(2));
            System.out.println("Scrolling continues");
            rs.previous();
            System.out.println("last to first records upward");
            System.out.println(rs.getInt(1) + " -> " + rs.getString(2));
            rs.relative(-5);
            System.out.println("last to fifth record upwards");
            System.out.println(rs.getInt(1) + " -> " + rs.getString(2));
            System.out.println("last to second record upwards");
            System.out.println(rs.getInt(1) + " -> " + rs.getString(2));
            rs.relative(5);
            System.out.println("last to fifth record downwards");
            System.out.println(rs.getInt(1) + " -> " + rs.getString(2));

            System.out.println("scrolling end now");
            con.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
