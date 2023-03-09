package interfaces;

import java.sql.Connection;
import java.sql.SQLException;

public interface DbInsertData {
    void insertData(Connection connection) throws SQLException;
}
