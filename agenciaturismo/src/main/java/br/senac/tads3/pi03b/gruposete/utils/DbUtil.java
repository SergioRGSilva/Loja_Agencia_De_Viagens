package br.senac.tads3.pi03b.gruposete.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {

    public static Connection getConnection() throws ClassNotFoundException {
        Connection conn = null;

        try {
            
            String username = "root";
            String password = "";
            
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/agenciaturismo", username, password);
            
            System.out.println("CONECTOU");
            
        } catch (SQLException ex) {
            System.out.println("DEU RUIM>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        
        return conn;
    }
}
