/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author dfi3509
 */
public class Dbconnect {
    
     static final String DRIVER = "com.mysql.cj.jdbc.Driver";
          static final String PROTOCOL = "jdbc:mysql:";
          static final String HOST = "127.0.0.1";   
          static final String BD_NAME = "pokemons";       
          static final String USER = "usuario_pokemon";          
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
