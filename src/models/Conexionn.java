package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexionn {

    private static final String URL = "jdbc:mysql://localhost:3306/escuela3a";
    private static final String USER= "root";
    private static final String PASSWORD = "";

    public static Connection conectar() throws SQLException{
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
    
}
