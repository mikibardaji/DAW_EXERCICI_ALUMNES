/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import PersistenciaModelo.DbConnect;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
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
        
        if (conn != null) {
            List<Coche> Tienda = new ArrayList<>();
            String query = "SELECT * FROM coches" ;
            System.out.println(query);
            PreparedStatement itadori = conn.prepareStatement(query);
            ResultSet cursor = itadori.executeQuery(query);
            
            while(cursor.next()){
                String matricula = cursor.getString("matricula");
                String marca = cursor.getString("marca");
                int puerta = cursor.getInt("puertas");
                boolean automatico = cursor.getBoolean("automatico");
                
                Coche carOkkotsu = new Coche(matricula, marca, puerta, automatico);
                Tienda.add(carOkkotsu);
            }
            
            cursor.close();
            itadori.close();
            conn.close();
            
            return Tienda;
            
        } else {
            throw new SQLException("Conexión fallida");
        }
    }
    
    public int addCoche (Coche nuevo) throws SQLException{
        conn = DbConnect.getConnection();

        String query = "INSERT INTO coches "+ "(matricula, marca,puertas, automatico)" +
        " VALUES (?,?,?,?)";

        if(conn != null){
            System.out.println(query);
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, nuevo.getMatricula());
            pstmt.setString(2, nuevo.getMarca());
            pstmt.setInt(3, nuevo.getPuertas());
            pstmt.setBoolean(4, nuevo.isAutomatico());
            pstmt.executeUpdate();
            int filas = pstmt.executeUpdate();
            pstmt.close();
            conn.close();
            return filas;
        } else {
            throw new SQLException("Conexión fallida");       
        }
                
    }

    public int modificarCar(Coche cochesModificar) throws SQLException {
        conn = DbConnect.getConnection();//
        
        boolean existe = existeCocheMatricula(cochesModificar.getMatricula());
        
        if (existe == true) {
            
        String query2 = "UPDATE coches SET marca = ?"
                + ", puertas = ?"
                + ", automatico = ?"
                + " WHERE matricula = ?";
        System.out.println("query2");
        PreparedStatement pstmt = conn.prepareStatement(query2);
        pstmt.setString(1, cochesModificar.getMarca());
        pstmt.setInt(2, cochesModificar.getPuertas());
        pstmt.setBoolean(3, cochesModificar.isAutomatico());
        pstmt.setString(4, cochesModificar.getMatricula());
        
        int preparedtate = pstmt.executeUpdate();
        
        pstmt.close();
        conn.close();
        
        return preparedtate;
    }
        else {
            return 0; // porque no existe la matrícula
        }
}

    private boolean existeCocheMatricula(String matricula) throws SQLException {
        conn = DbConnect.getConnection();
        
        String query = "SELECT COUNT(*) AS 'Numero' FROM coches WHERE matricula = ?";
        PreparedStatement pstmt = conn.prepareStatement(query);
        pstmt.setString(1, matricula);
        ResultSet rs = pstmt.executeQuery();
        int numero = 0;
        if (rs.next()) {
            numero = rs.getInt("Número");
        }
        return numero == 1; // si ha dado 1 es que existe y si no es false.
    }

    public int eliminarPorPuertas(Coche cochesEliminarPorPuerta) throws SQLException {
        conn = DbConnect.getConnection();
        
        String query = "DELETE FROM coches WHERE puertas = ?";
        System.out.println(query);
        PreparedStatement pstmt = conn.prepareStatement(query);
        pstmt.setInt(1, cochesEliminarPorPuerta.getPuertas());
        
        int preparedStatet = pstmt.executeUpdate();
        
        pstmt.close();
        conn.close();
        
        return preparedStatet;
    }

    public Coche buscarCocheCaract(Coche cochesBuscarCaract) throws SQLException {
        conn = DbConnect.getConnection();
        
        String query = "SELECT * FROM coches WHERE matricula = ?";
        PreparedStatement pstmt = conn.prepareStatement(query);
        pstmt.setString(1, cochesBuscarCaract.getMatricula());
        ResultSet rs = pstmt.executeQuery();
   
        if (rs.next()) {
            String matricula = rs.getString("matricula");
            String marca = rs.getString("marca");
            int puertas = rs.getInt("puertas");
            boolean automatico = rs.getBoolean("automatico");
            
            Coche devolverCaractCoche = new Coche(matricula, marca, puertas, automatico);
            
            return devolverCaractCoche;

        } else {
        return null ;
    }
    
    }
}
