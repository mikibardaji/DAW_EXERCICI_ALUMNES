/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;


import PersistenciaModelo.DbConnect;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mabardaji
 */
public class CocheDAODB {
    Connection conn = null;
    public CocheDAODB() throws ClassNotFoundException{
    
    DbConnect.loadDriver();
    
    
    }

    public List <Coche>  getLista() throws SQLException {
        
        conn = DbConnect.getConnection();
        
        if (conn!= null){
            List <Coche> tienda = new ArrayList<>();
            System.out.println("Has entrado ");
            
            String query = "SELECT * FROM coches ";
            
            System.out.println(query);
            PreparedStatement pstmt = conn.prepareStatement(query);
            
            ResultSet cursor = pstmt.executeQuery();
            while (cursor.next()){
            
                    String matricula  = cursor.getString("matricula");
                    
                    String marca = cursor.getString("marca");
                    int puertas = cursor .getInt("puertas");
                    boolean automatico = cursor.getBoolean("automatico");
                    
                    Coche car = new Coche(matricula, marca, puertas, automatico);
                    
                    tienda.add(car);
                    
            }
        
            cursor.close();
            pstmt.close();
                  
            
        conn.close();
        
        return tienda ;
        
        
            
        }
        else  {
        throw new SQLException("conexion fallida");
        }

    }
    public int  addCoche (Coche anyadir) throws SQLException{
    
       
            conn = DbConnect.getConnection();
            
            
            String query = "INSERT INTO coches "+ "(matricula, marca,puertas, automatico) " +
                    "VALUES (?,?,?,?)";
            if (conn != null ){
            System.out.println(query);
           
             PreparedStatement pstmt = conn.prepareStatement(query);
             
             pstmt.setString(1, anyadir.getMatricula());
             pstmt.setString(2, anyadir.getMarca());
             pstmt.setInt(3, anyadir.getPuertas());
             pstmt.setBoolean(4,anyadir.isAutomatico());
            
              int filas = pstmt.executeUpdate();
              
                pstmt.close();
              conn.close();
                
              
            
             
             return filas;
             
            }else {
               throw new SQLException("Conexion fallida");
            
            }
            
           
            
//           
//            
//            pstmt.setString(1, anyadir.getMatricula());
//             pstmt.setString(2, anyadir.getMarca());
//              pstmt.setInt(3, anyadir.getPuertas());
//               pstmt.setBoolean(4, anyadir.isAutomatico());
//               
//               int filas = pstmt.executeUpdate();
//               
//           if (filas == 1) return true;
//        else return false; 
            
    
        
    
    
    
    }

    public int modificarCar(Coche cochemodificado) throws SQLException {
                
    conn = DbConnect.getConnection();
    
    
    
    boolean existe = existeCocheMatricula(cochemodificado.getMatricula());

    //String query = "UPDATE Coches " + " SET  matricula =? ";
    
    if (existe ==true){
    String query = "UPDATE Coches SET marca =? "
            +" , puertas =? "
            + " , automatico =? "
            +"WHERE matricula =?";
        System.out.println(query);
        PreparedStatement pepe = conn.prepareStatement(query);
        
        pepe.setString(1, cochemodificado.getMarca());
        pepe.setInt(2, cochemodificado.getPuertas());
        pepe.setBoolean(3, cochemodificado.isAutomatico());
        pepe.setString(4, cochemodificado.getMatricula());
        
        
        int mod = pepe.executeUpdate();
        
        
        
        
        pepe.close();
        conn.close();
        
        return mod;
           }
    else {
    
    return 0;
    }
    
    }
    
  
 

    private boolean existeCocheMatricula(String matricula) throws SQLException {


            conn = DbConnect.getConnection();


             String query = "SELECT COUNT (*) AS 'Numero'  FROM coches WHERE matricula = ?  ";

            PreparedStatement pepe = conn.prepareStatement(query);
            pepe.setString(1, matricula);

            ResultSet rs = pepe.executeQuery();
               int numero =0;
            if (rs.next()){
            numero =rs.getInt("Numero");
            }
            return numero ==1;
            
    
    }

    public int venderCoche(Coche cochevendido) throws SQLException {


        conn = DbConnect.getConnection();
        
        String query = "DELETE FROM Coches WHERE puertas  = ?"; 
        System.out.println(query);
        
        PreparedStatement alonso  = conn.prepareStatement(query);
        
        
        alonso.setInt(1, cochevendido.getPuertas());
        
        int cochepuertas = alonso.executeUpdate();
        
        
        alonso.close();
        conn.close();
        return cochepuertas;
        

    }

    public Coche mostrardatosCoche(String matricula ) throws SQLException {

        conn = DbConnect.getConnection();
        
        String  query ="SELECT * from Coches where matricula = ?  ";
        PreparedStatement pstmt = conn.prepareStatement(query);
        pstmt.setString (1,matricula);
        
        
        ResultSet rs = pstmt.executeQuery();
        
        if (rs.next()){
        String mat = rs.getString("matricula");
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
