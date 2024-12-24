package com.shrayansh.objectPoolDesignPattern.resourcePoolManager;

import com.shrayansh.objectPoolDesignPattern.resource.DBConnection;

import java.util.ArrayList;
import java.util.List;

public class DBConnectionPoolManager {
    private List<DBConnection> freeConnectionsInPool;
    private List<DBConnection> connectionsCurrenytlyInUse;
    int initialPoolSize;
    int maxPoolSize;
    private static DBConnectionPoolManager dbConnectionPoolManagerInstance = null;

    private DBConnectionPoolManager(int initialPoolSize, int maxPoolSize) {
        this.freeConnectionsInPool = new ArrayList<>();
        this.connectionsCurrenytlyInUse = new ArrayList<>();
        this.initialPoolSize = initialPoolSize;
        this.maxPoolSize = maxPoolSize;
        for (int i = 0; i < initialPoolSize; i++) {
            freeConnectionsInPool.add(new DBConnection());
        }
    }

    public static DBConnectionPoolManager getInstance(){
        if(dbConnectionPoolManagerInstance == null){
            synchronized (DBConnectionPoolManager.class) {
                if (dbConnectionPoolManagerInstance == null) {
                    dbConnectionPoolManagerInstance = new DBConnectionPoolManager(3, 6);
                }
            }
        }
        return dbConnectionPoolManagerInstance;
    }

    public synchronized DBConnection getDbConnection() {
        if (freeConnectionsInPool.isEmpty() && connectionsCurrenytlyInUse.size() < this.maxPoolSize) {
            DBConnection dbConnection = new DBConnection();
            connectionsCurrenytlyInUse.add(dbConnection);
            return dbConnection;
        } else if (freeConnectionsInPool.isEmpty() && connectionsCurrenytlyInUse.size() >= this.maxPoolSize) {
            System.out.println("No connection Available");
            return null;
        }

        DBConnection dbConnection = freeConnectionsInPool.get(freeConnectionsInPool.size() - 1);
        freeConnectionsInPool.remove(freeConnectionsInPool.size() - 1);
        connectionsCurrenytlyInUse.add(dbConnection);
        return dbConnection;
    }

    public synchronized void releaseDbConnection(DBConnection dbConnection) {
        if (dbConnection != null) {
            connectionsCurrenytlyInUse.remove(dbConnection);
            freeConnectionsInPool.add(dbConnection);
        }
    }
}
