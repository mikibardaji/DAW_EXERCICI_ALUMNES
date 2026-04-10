/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import PersistenciaModelo.DbConnect;
import com.mysql.cj.protocol.Resultset;
import java.sql.*;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author mabardaji
 */
public class CocheDAODB {
    Connection conn = null;
    public CocheDAODB() throws ClassNotFoundException {
        DbConnect.loadDriver();
    }

    public List<Coche> getLista() throws SQLException {
        conn = DbConnect.getConnection();
        if (conn!=null){
            List<Coche> tienda = new ArrayList<>();
            System.out.println("Has entrado");
            
            String query = "SELECT * FROM coches";
            System.out.println(query);
            
            PreparedStatement pepereina = conn.prepareStatement(query);
            
            ResultSet cursos = pepereina.executeQuery();
            
            while(cursos.next()){
            String matriculaCoche = cursos.getString("matricula");
            String marcaCoche = cursos.getString("marca");
            int puertasCoche = cursos.getInt("puertas");
            boolean automaticoCoche = cursos.getBoolean("automatico");
                    
            tienda.add(new Coche(matriculaCoche, marcaCoche, puertasCoche, automaticoCoche));       
   
            }
            cursos.close();
            pepereina.close();
            conn.close();
            return tienda;
                
        } else{
          throw new SQLException("Conexion fallida");
    }
        
    }

    public void addCoche(Coche nuevo) throws SQLException {
       conn = DbConnect.getConnection();
       
       String query = "INSERT INTO coches (matricula, marca, puertas, automatico) VALUES(?,?,?,?)";
       
       
    }
    
}
