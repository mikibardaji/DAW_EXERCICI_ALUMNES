package PersistenciaModelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author aba7500
 */
public class DbConnect {
    static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String PROTOCOL = "jdbc:mysql:"; //protocolo conexion
    static final String HOST = "127.0.0.1"; //local host
    static final String BD_NAME = "pokedex";
    static final String USER = "usuario_pokem";
    static final String PASSWORD = "password123";
    static final String PARAMS = "useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";  

    public static void loadDriver() throws ClassNotFoundException {
        Class.forName(DRIVER);
    }
        public static Connection getConnection() throws SQLException {
        final String BD_URL = String.format("%s//%s/%s?%s", PROTOCOL, HOST, BD_NAME, PARAMS);
        Connection conn = null;
        conn = DriverManager.getConnection(BD_URL, USER, PASSWORD);
        return conn;
    }
}
