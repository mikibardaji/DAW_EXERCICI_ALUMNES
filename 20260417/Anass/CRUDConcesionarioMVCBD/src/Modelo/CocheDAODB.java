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

    public int addCoche(Coche nuevo) throws SQLException {
       conn = DbConnect.getConnection();
       
       String query = "INSERT INTO coches (matricula, marca, puertas, automatico) VALUES(?,?,?,?)";
       if (conn!=null){
           System.out.println(query);
           PreparedStatement pepereina = conn.prepareStatement(query);
           pepereina.setString(1,nuevo.getMatricula());
           pepereina.setString(2, nuevo.getMarca());
           pepereina.setInt(3, nuevo.getPuertas());
           pepereina.setBoolean(4, nuevo.isAutomatico());
           
           int filas = pepereina.executeUpdate();
           conn.close();
           
           return filas;
           
       } else {
           throw new SQLException("Conexion fallida");
       }
       
    }

    public int modificarCar(Coche cocheModif) throws SQLException {
       conn = DbConnect.getConnection();
       
       boolean existe = existeCocheMatricula(cocheModif.getMatricula());
       if(existe==true){
       String query2 = "UPDATE coches SET marca =? "  + ", puertas = ? " + ", automatico = ? " + " WHERE matricula = ?";
       
       System.out.println(query2);
       
       PreparedStatement pepe = conn.prepareStatement(query2);
       
       pepe.setString(1, cocheModif.getMarca());
       pepe.setInt(2, cocheModif.getPuertas());
       pepe.setBoolean(3, cocheModif.isAutomatico());
       pepe.setString(4, cocheModif.getMatricula());
       
       int modificar = pepe.executeUpdate();
       conn.close();
       return modificar;
       } 
       else return 0; // porque no existe la matricula
    }

    public boolean existeCocheMatricula(String matricula) throws SQLException {
        conn = DbConnect.getConnection();
        String query = "SELECT COUNT(*) AS 'Numero' FROM coches where matricula =?";
        PreparedStatement pepe = conn.prepareStatement(query);
        pepe.setString(1, matricula);
        ResultSet rs = pepe.executeQuery();
        int numero = 0;
        if (rs.next()){
        numero = rs.getInt("Numero");}
        return numero == 1;
            
        
    }

    public int borrarCarPuertas(Coche borrar) throws SQLException {
       conn = DbConnect.getConnection();
       String query = "DELETE FROM coches WHERE puertas =?";
        System.out.println(query);
       PreparedStatement pepe = conn.prepareStatement(query);
       pepe.setInt(1, borrar.getPuertas());
       
       int borr = pepe.executeUpdate();
       conn.close();
       return borr;
    }
    
    public Coche carcateristicasCoche(Coche carCarateristicas) throws SQLException {
       conn = DbConnect.getConnection();
       String query = "SELECT * FROM coches WHERE matricula = ?";
        System.out.println(query);
        PreparedStatement pepe = conn.prepareStatement(query);
        pepe.setString(1, carCarateristicas.getMatricula());
        ResultSet rs = pepe.executeQuery();
       
        if(rs.next()){
        String mat = rs.getString("matricula");
        String mar = rs.getString("marca");
        int puert = rs.getInt("puertas");
        boolean auto = rs.getBoolean("automatico");
       
        Coche car = new Coche(mat, mar, puert, auto);
       
        rs.close();
        conn.close();
        return car;
        } else {
        rs.close();
        conn.close();
       return null;
        }
    }
    
    
}
