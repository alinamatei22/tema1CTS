package interfaces;

import java.sql.Connection;
import java.sql.SQLException;

public interface DbReadData {
    void readData(Connection connection) throws SQLException;
}
