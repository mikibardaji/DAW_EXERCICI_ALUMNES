/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import persistencia.dbconnect;

/**
 *
 * @author mabardaji
 */
public class CocheDAOBD {
    Connection conn = null;
    public CocheDAOBD() throws ClassNotFoundException {
        dbconnect.loadDriver();
    }

    public List<Coche> getLista() throws SQLException {
     conn = dbconnect.getConnection();
        if (conn != null) {
            List<Coche> tienda = new ArrayList<>();
            String query = "SELECT * FROM coches";
            System.out.println(query);
            PreparedStatement pepereina = conn.prepareStatement(query);
            ResultSet cursor =  pepereina.executeQuery();
            while(cursor.next()){
                String matricula = cursor.getString("matricula");
                String marca = cursor.getString("marca");
                int puerta = cursor.getInt("puertas");
                boolean automatico = cursor.getBoolean("automatico");
                Coche car = new Coche(matricula, marca, puerta, automatico);
                tienda.add(car);    
            } 
            cursor.close();
            pepereina.close();
            conn.close();
            return tienda;
                
            
        }else{
           throw new SQLException("Conexion fallida");
        }   
    }

    public void addCoche(Coche nuevo) throws SQLException {
    conn = dbconnect.getConnection();
    String query = "INSERT INTO coches (matricula, marca, puertas, automatico) VALUES(?,?,?,?)";
        
    }
    
    
}
