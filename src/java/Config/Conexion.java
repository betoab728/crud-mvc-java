
package Config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    private Connection con;
    private static final String URL = "jdbc:mysql://localhost:3306/";
    private static final String DATABASE = "PersonasDB";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(URL + DATABASE, USER, PASSWORD);            
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }

    public Connection getConnection() {
        return con;
    }
}
