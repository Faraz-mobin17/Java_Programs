import javax.swing.*;
import javafx.event.ActionEvent;
import java.sql.*;
import java.util.ArrayList;
import java.awt.*;
import java.awt.event.ActionListener;
public class JDBCwithSwing implements ActionListener {
    public static String[] getUserData() {
        ArrayList<String> list= new ArrayList<String>();
        String[] result = new String[list.size()];
        try {
              final String URL = "jdbc:mysql://localhost:3306/university";
              final String uname = "root";
              final String pwd = "";
            Connection con = DriverManager.getConnection(URL, uname, pwd);
            if (con == null) {
                System.out.println("Connection failed");
            }
            String query = "SELECT Stud_name FROM student LIMIT 1";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            while (rs.next()) {
                list.add(rs.getString("Stud_name"));
            }
            
            result = list.toArray(result);
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return result;
    }
    JFrame f;
    JTextField t1;
    JDBCwithSwing() {
        f = new JFrame("JDBC with Swing program");
        JLabel id = new JLabel("Enter Id of the User");
         t1 = new JTextField(20);
        JButton getData = new JButton("GET DATA");
        getData.addActionListener(this);
        f.add(id);
        f.add(t1);
        f.add(getData);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
        f.setSize(500,500);
    }
    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        int getId = Integer.parseInt(t1.getText());
        System.out.println(getId);
    }
    public static void main(String[] args) {
        new JDBCwithSwing();
    }
    
}
