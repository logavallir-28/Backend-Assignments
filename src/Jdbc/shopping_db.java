
package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.Scanner;

public class shopping_db {

    String url = "jdbc:mysql://localhost:3306/shopping_db";
    String username = "root";
    String password = "Loga@28042005";

    public Connection Jdbc() {

        Connection conn = null;

        try {
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Product Database Connected Successfully");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }

    public void createtable() {

        String create = "CREATE TABLE IF NOT EXISTS product("
                + "product_id INT PRIMARY KEY,"
                + "product_name VARCHAR(100),"
                + "price DOUBLE,"
                + "quantity INT)";

        try {
            Connection conn = Jdbc();

            if (conn == null) return;

            Statement st = conn.createStatement();
            st.executeUpdate(create);

            System.out.println("Product Table Created Successfully");

            st.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void insertproduct(Scanner sc) {

        String insert = "INSERT INTO product VALUES(?,?,?,?)";

        try {
            Connection conn = Jdbc();

            if (conn == null) return;

            PreparedStatement ps = conn.prepareStatement(insert);

            System.out.println("Enter Product ID:");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Product Name:");
            String name = sc.nextLine();

            System.out.println("Enter Product Price:");
            double price = sc.nextDouble();

            System.out.println("Enter Product Quantity:");
            int quantity = sc.nextInt();

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setDouble(3, price);
            ps.setInt(4, quantity);

            int result = ps.executeUpdate();

            if (result > 0) {
                System.out.println("Product Added Successfully");
            }

            ps.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
