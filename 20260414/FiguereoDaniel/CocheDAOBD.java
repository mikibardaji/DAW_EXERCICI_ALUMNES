/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import com.mysql.cj.jdbc.PreparedStatementWrapper;
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

    public int addCoche(Coche nuevo) throws SQLException {
    conn = dbconnect.getConnection();
    String query = "INSERT INTO coches (matricula, marca, puertas, automatico) VALUES(?,?,?,?)";
        if (conn != null) {
            System.out.println(query);
            PreparedStatement pepereina = conn.prepareStatement(query);
            pepereina.setString(1, nuevo.getMatricula());
            pepereina.setString(2, nuevo.getMarca());
            pepereina.setInt(3, nuevo.getPuertas());
            pepereina.setBoolean(4, nuevo.isAutomatico());
            int filas = pepereina.executeUpdate();
            pepereina.close();
            conn.close();
           
            return filas;
        }else{
           throw new SQLException("Conexion fallida");
        }   
    }

    public int modificarCoche(Coche cocheModifica) throws SQLException {
        conn = dbconnect.getConnection();
        
        //verificar que exista
        boolean existe = existeCocheMatricula(cocheModifica.getMatricula());
        if (existe) {
           String query2 = "UPDATE coches SET marca = ? "
                + ", puertas = ?"
                + ", automatico = ? "
                + " WHERE matricula = ?";
        System.out.println(query2);
        PreparedStatement pepe = conn.prepareStatement(query2);
        
        pepe.setString(1, cocheModifica.getMarca());
        pepe.setInt(2,cocheModifica.getPuertas());
        pepe.setBoolean(3, cocheModifica.isAutomatico());
        pepe.setString(4, cocheModifica.getMatricula());
       
        int mod = pepe.executeUpdate();
        pepe.close();
        conn.close();
        
        return mod; 
        } else{
            return 0; //no existe la matricula
        }
        
    }

    private boolean existeCocheMatricula(String matricula) throws SQLException {
    conn = dbconnect.getConnection();
    String query = "SELECT COUNT(*) AS 'Numero' FROM coches where matricula = ?";
    PreparedStatement pepe = conn.prepareStatement(query);
    pepe.setString(1,matricula);
    ResultSet rs = pepe.executeQuery();
    int numero = 0;
        if (rs.next()) {
            numero = rs.getInt("Numero");
        }
        return numero == 1; // si ha dado 0 no existe
    }

    public int eliminarCoche(Coche eliminarCoche) throws SQLException {
        conn = dbconnect.getConnection();    
        String query = "DELETE FROM Coches WHERE puertas =?";
        PreparedStatement fernando = conn.prepareStatement(query);
        fernando.setInt(1, eliminarCoche.getPuertas());
        int cochePuertas = fernando.executeUpdate();
        fernando.close();
        conn.close();
        return cochePuertas;
    }
    
     public Coche mostrardatosCoche(String matricula ) throws SQLException {

        conn = dbconnect.getConnection();
        
        String  query ="SELECT * from Coches where matricula = ?  ";
        PreparedStatement pstmt = conn.prepareStatement(query);
        pstmt.setString (1,matricula);
        
        
        ResultSet rs = pstmt.executeQuery();
        
        if (rs.next()){
        String matricula = rs.getString("matricula");
        String marca = rs.getString("marca");
        int puertas = rs.getInt("puertas");
        boolean auto = rs.getBoolean("automatico");
        
        Coche cochesito = new Coche(matricula, marca, puertas, auto);
        
        rs.close();
        pstmt.close();
        conn.close();

        return cochesito;
        
        
        }else {
            rs.close();
            pstmt.close();
            conn.close();
            
            
            return null;
        }
     }
    
}
