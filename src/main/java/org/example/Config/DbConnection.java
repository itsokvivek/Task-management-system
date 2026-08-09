package org.example.Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    String url= "jdbc:mysql://localhost:3306/taskmanagement";
    String username="root";
    String password="";

    public  Connection getConnection() throws SQLException{
        return DriverManager.getConnection(url,username,password);
    }
}
