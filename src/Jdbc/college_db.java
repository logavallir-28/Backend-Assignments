
package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class college_db {

    String url = "jdbc:mysql://localhost:3306/college_db";
    String username = "root";
    String password = "Loga@28042005";

    Scanner sc = new Scanner(System.in);

    public Connection Jdbc() {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Database Connected Successfully");
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }

    public void createtable() {

        String create = "CREATE TABLE student("
                + "id INT PRIMARY KEY,"
                + "name VARCHAR(50),"
                + "age INT,"
                + "course VARCHAR(50))";

        try {
            Connection conn = Jdbc();
            Statement st = conn.createStatement();
            st.executeUpdate(create);

            System.out.println("Table is created");
        }
        catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void insertstudent() {

        String insert = "INSERT INTO student VALUES(?,?,?,?)";

        try {
            Connection conn = Jdbc();
            PreparedStatement ps = conn.prepareStatement(insert);

            for (int i = 1; i <= 3; i++) {

                System.out.println("Enter Student ID:");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter Student Name:");
                String name = sc.nextLine();
                System.out.println("Enter Student Age:");
                int age = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter Student Course:");
                String course = sc.nextLine();
                ps.setInt(1, id);
                ps.setString(2, name);
                ps.setInt(3, age);
                ps.setString(4, course);
                ps.executeUpdate();
                System.out.println("Student inserted successfully");
            }
        }
        catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        college_db call = new college_db();

        call.createtable();
        call.insertstudent();
    }
}
