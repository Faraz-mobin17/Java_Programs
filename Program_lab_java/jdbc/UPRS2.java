import java.sql.*;
import java.io.*;

public class UPRS2 {
    public static void main(String args[]) {
        String URL = "jdbc:mysql://localhost:3306/mca";
        String USERNAME = "root";
        String PASSWORD = "";
        Console console = System.console();
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            DatabaseMetaData metadata = conn.getMetaData();
            boolean isUpdatable = metadata.supportsResultSetConcurrency(
                    ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            if (!isUpdatable) {
                System.out.println("the database doesnot support updatable result sets.");
                return;
            }
            String sql = "SELECT * FROM employee2";
            Statement statement = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet result = statement.executeQuery(sql);
            int row = -1;
            while (row != 0) {
                row = Integer.parseInt(console.readLine("Enter row number:"));
                if (result.absolute(row)) {
                    readStudentInfo("Student at row" + row + ":", result);
                    String answer = console.readLine("do you want to update this row(Y/N)?: ");
                    if (answer.equalsIgnoreCase("Y")) {
                        String name = console.readLine("\tUpdate name: ");
                        String email = console.readLine("\tUpdate email: ");
                        String major = console.readLine("\tUpdate major: ");
                        result.updateString("name", name);
                        result.updateString("email", email);
                        result.updateString("major", major);
                        result.updateRow();
                        System.out.println("the student at row" + row + "has been updated.");
                    }
                    answer = console.readLine("Do you want to delet this row(y/N)?:");
                    if (answer.equalsIgnoreCase("Y")) {
                        result.deleteRow();
                        System.out.println("The student at row " + row + " has been deleted.");
                    }
                    answer = console.readLine("Do you want to insert row(Y/N)?: ");
                    if (answer.equalsIgnoreCase("Y")) {
                        result.moveToInsertRow();
                        String name = console.readLine("\tUpdate name: ");
                        String email = console.readLine("\tUpdate email: ");
                        String major = console.readLine("\tUpdate major: ");
                        result.updateString("name", name);
                        result.updateString("email", email);
                        result.updateString("major", major);
                        result.insertRow();
                        result.moveToCurrentRow();
                        System.out.println("The new student has been inserted.");
                    }
                } else {
                    System.out.println("There's no student at row" + row);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private static void readStudentInfo(String position, ResultSet result) throws SQLException {
        String name = result.getString("name");
        String email = result.getString("email");
        String major = result.getString("major");
        String studentInfo = "%s: %s - %s - %s\n";
        System.out.format(studentInfo, position, name, email, major);
    }
}