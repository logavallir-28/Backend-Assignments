
package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class company_db {

    String url = "jdbc:mysql://localhost:3306/company_db";
    String username = "root";
    String password = "Loga@28042005";

    public Connection Jdbc() {

        Connection conn = null;

        try {
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Employee Database Connected Successfully");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }

    public void createtable() {

        String create = "CREATE TABLE IF NOT EXISTS employee("
                + "emp_id INT PRIMARY KEY,"
                + "emp_name VARCHAR(50),"
                + "salary DOUBLE,"
                + "department VARCHAR(50))";

        try {
            Connection conn = Jdbc();

            if (conn == null) return;

            Statement st = conn.createStatement();
            st.executeUpdate(create);

            System.out.println("Employee Table Created Successfully");

            st.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void insertemployee(Scanner sc) {

        String insert = "INSERT INTO employee VALUES(?,?,?,?)";

        try {
            Connection conn = Jdbc();

            if (conn == null) return;

            PreparedStatement ps = conn.prepareStatement(insert);

            for (int i = 1; i <= 3; i++) {

                System.out.println("Enter Employee " + i + " Details");

                System.out.println("Enter Employee ID:");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.println("Enter Employee Name:");
                String name = sc.nextLine();

                System.out.println("Enter Employee Salary:");
                double salary = sc.nextDouble();
                sc.nextLine();

                System.out.println("Enter Department:");
                String department = sc.nextLine();

                ps.setInt(1, id);
                ps.setString(2, name);
                ps.setDouble(3, salary);
                ps.setString(4, department);

                ps.executeUpdate();

                System.out.println("Employee Added Successfully");
            }

            ps.close();

            // Display Employee ID and Name
            String select = "SELECT emp_id, emp_name FROM employee";

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(select);

            System.out.println("Employee Details:");

            while (rs.next()) {
                System.out.println("Employee ID: " + rs.getInt("emp_id"));
                System.out.println("Employee Name: " + rs.getString("emp_name"));
            }

            rs.close();
            st.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
