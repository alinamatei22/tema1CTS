package classes;


import interfaces.DatabaseConnection;
import interfaces.DbCreateTable;
import interfaces.DbInsertData;
import interfaces.DbReadData;

import java.sql.Connection;

public class Main {

    public static void main(String[] args) {
        try {

            DatabaseConnection databaseConnection = new CreateConnection();
            Connection connection = databaseConnection.createConnection();

            DbCreateTable createTable = new CreateTable();
            createTable.createTable(connection);


            DbInsertData insertData = new InsertData();
            insertData.insertData(connection);


            DbReadData readData = new ReadData();
            readData.readData(connection);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }





}

