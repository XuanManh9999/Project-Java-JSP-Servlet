package com.webpetshop.model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class ConnectDB {
    public static Connection connectToDatabase() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Đổi "dbUrl", "username", "password" thành thông tin của bạn
            String dbUrl = "jdbc:mysql://localhost:3306/pet_shop";
            String username = "root";
            String password = null;

            conn = DriverManager.getConnection(dbUrl, username, password);
            if (conn != null) {
                System.out.println("Connect success!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public static void main(String[] args) {
        ConnectDB connectDB = new ConnectDB();
        Connection conn = connectDB.connectToDatabase();
        try {
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM products");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
