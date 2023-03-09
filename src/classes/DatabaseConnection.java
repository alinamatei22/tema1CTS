package classes;

import interfaces.DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;

class CreateConnection implements DatabaseConnection {
    @Override
    public Connection createConnection() {
        Connection databaseConnection = null;
        try {
            Class.forName("org.sqlite.JDBC");
            databaseConnection = DriverManager.getConnection("jdbc:sqlite:database.db");
            databaseConnection.setAutoCommit(false);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return databaseConnection;
    }
}