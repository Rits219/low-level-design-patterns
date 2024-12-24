package com.shrayansh.objectPoolDesignPattern.resource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    Connection mySqlConnection;

    public DBConnection() {
        try {
            mySqlConnection = DriverManager.getConnection("url", "userName", "password");
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
        }
    }
}
