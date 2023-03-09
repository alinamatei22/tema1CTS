package interfaces;

import java.sql.Connection;
import java.sql.SQLException;

public interface DbCreateTable{
        void createTable(Connection connection)throws SQLException;
}
