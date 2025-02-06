package com.shrayansh.creational.objectPoolDesignPattern.client;

import com.shrayansh.creational.objectPoolDesignPattern.resource.DBConnection;
import com.shrayansh.creational.objectPoolDesignPattern.resourcePoolManager.DBConnectionPoolManager;

public class Client {
    public static void main(String[] args) {
        // Create a pool of objects
        DBConnectionPoolManager dbConnectionPoolManager = DBConnectionPoolManager.getInstance();

        // Get an object from the pool
        DBConnection connection1 = dbConnectionPoolManager.getDbConnection();
        DBConnection connection2 = dbConnectionPoolManager.getDbConnection();
        DBConnection connection3 = dbConnectionPoolManager.getDbConnection();
        DBConnection connection4 = dbConnectionPoolManager.getDbConnection();
        DBConnection connection5 = dbConnectionPoolManager.getDbConnection();
        DBConnection connection6 = dbConnectionPoolManager.getDbConnection();

        // Release the object back to the pool
        dbConnectionPoolManager.releaseDbConnection(connection1);
    }
}
