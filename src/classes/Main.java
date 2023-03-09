package classes;


import java.sql.*;

public class Main {

    public static void main(String[] args) {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection connection = DriverManager.getConnection("jdbc:sqlite:database.db");
            connection.setAutoCommit(false);

           // createTable(connection);
            //insertData(connection);
           // readData(connection);

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }





}

