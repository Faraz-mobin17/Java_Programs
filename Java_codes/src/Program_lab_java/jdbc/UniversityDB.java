/* Program to perform certain university like display, insert, delete, update, search in a single table. */

// this package is nesussary because we are kelling this program in a folder so we must specify the package.

import java.sql.*;
import java.io.*;

class UniversityDB {
  void connect() {
    Connection con = null;
    try {
      // Class.forName("com.mysql.cj.jdbc.Driver");

      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root", "");

      System.out.println("connected");
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  void show() {
    Connection con = null;
    try {
      // Class.forName("com.mysql.cj.jdbc.Driver");

      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root", "");

      Statement st = con.createStatement();

      String query = "select * from sales_info Order by id";

      ResultSet rs = st.executeQuery(query);

      while (rs.next()) {
        System.out.println(rs.getString("id") + "\t" + rs.getString("name"));
      }
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  void insert() {
    Console c = System.console();
    Connection con = null;
    try {
      // Class.forName("com.mysql.cj.jdbc.Driver");

      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root", "");

      String id = c.readLine("Enter Serial Number : ");
      String name = c.readLine("Enter Name : ");
      String str = String.format("insert into sales_info(id,name) values(%s,'%s')", id, name);

      Statement st = con.createStatement();

      st.execute(str);
      System.out.println("Data Added Successfully");
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  void delete() {
    Console c = System.console();
    Connection con = null;
    try {
      // Class.forName("com.mysql.cj.jdbc.Driver");

      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root", "");

      String id = c.readLine("Enter S.No You want to delete : ");
      String query = "delete from sales_info where id=" + id;

      Statement st = con.createStatement();

      int i = st.executeUpdate(query);
      if (i == 0) {
        System.out.println(id + ". No such ID Exists.");
      } else {
        System.out.println(i + ". row deleted");
      }

    } catch (Exception e) {
      System.out.println(e);
    }

  }

  void update() {
    Console c = System.console();
    Connection con = null;
    try {
      // Class.forName("com.mysql.cj.jdbc.Driver");

      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root", "");
      String id = c.readLine("Enter S.No You want to Update : ");
      String name = c.readLine("Enter Name You want to Update : ");
      String query = "Update sales_info set name ='" + name + "' where id=" + id;

      Statement st = con.createStatement();

      int i = st.executeUpdate(query);
      if (i == 0) {
        System.out.println(id + ". No such ID Exists.");
      } else {
        System.out.println(i + ". row Updated");
      }

    } catch (Exception e) {
      System.out.println(e);
    }
  }

  void search() {
    Console c = System.console();
    Connection con = null;
    try {
      // Class.forName("com.mysql.cj.jdbc.Driver");

      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root", "");

      String name = c.readLine("Enter name You want to search : ");

      String query = "select * from sales_info where product like '%" + name + "%'order by id";

      Statement st = con.createStatement();

      ResultSet rs = st.executeQuery(query);
      while (rs.next()) {
        System.out.println(rs.getString("id") + "\t" + rs.getString("name"));
      }

    } catch (Exception e) {
      System.out.println(e);
    }
  }

  public static void main(String[] args) {
    boolean input = true;
    Console c = System.console();
    System.out.println("Press 1 To Display Record from a Table");
    System.out.println("Press 2 To add record into a table");
    System.out.println("Press 3 To Delete record from a table");
    System.out.println("Press 4 To update record of a table");
    System.out.println("Press 5 To search record of a table");
    System.out.println("Press any key to Exit");
    System.out.println("_________________________________________");
    while (input) {
      String inp = c.readLine("Enter your choice : ");
      UniversityDB o = new UniversityDB();
      switch (inp) {
        case "1":
          o.show();
          break;

        case "2":
          o.insert();
          break;

        case "3":
          o.delete();
          break;

        case "4":
          o.update();
          break;

        case "5":
          o.search();
          break;

        default:
          input = false;
      }
    }
  }
}