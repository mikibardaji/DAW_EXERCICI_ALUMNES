/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import PersistenciaModelo.DbConnect;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aba7500
 */
public class PokemonDAOBD {
    Connection conn = null;

    public PokemonDAOBD() throws ClassNotFoundException {
        DbConnect.loadDriver();
    }

    public List<Pokemon> getLista() throws SQLException {
      conn = DbConnect.getConnection();
      
      if(conn!=null){
      List<Pokemon> pok = new ArrayList<>();
      String query = "SELECT * FROM pokemons";
      PreparedStatement pepe = conn.prepareStatement(query);
      ResultSet rs = pepe.executeQuery();
      
      while(rs.next()){
      int id = rs.getInt("id");
      String nom = rs.getString("nom");
      String tipus = rs.getString("tipus");
      int nivell = rs.getInt("nivell");
      int capturats = rs.getInt("capturats");
      
      pok.add(new Pokemon(id, nom, tipus, nivell, capturats));
        
      }
      rs.close();
      pepe.close();
      conn.close();
      return pok;
      } 
      
      else{
      throw new SQLException("Conexion fallida");
      }
      
    }
    
    public boolean existencia(String nombre) throws SQLException{
    conn = DbConnect.getConnection();
    String query = "SELECT * FROM pokemons WHERE nom = ?";
    PreparedStatement pepe = conn.prepareStatement(query);
    pepe.setString(1, nombre);
    
    ResultSet rs = pepe.executeQuery();
    
    boolean existe = rs.next();
    
    rs.close();
    pepe.close();
    conn.close();
    
    return existe;
    
    }

    public int addPokemon(Pokemon nuevo) throws SQLException {
     conn = DbConnect.getConnection();
       
    if (conn!= null){
    String query = "INSERT INTO pokemons (id, nom, tipus, nivell, capturats) VALUES(?,?,?,?,?)";
    
    PreparedStatement pepe = conn.prepareStatement(query);
    
    pepe.setInt(1, nuevo.getId());
    pepe.setString(2, nuevo.getNom());
    pepe.setString(3, nuevo.getTipus());
    pepe.setInt(4, nuevo.getNivell());
    pepe.setInt(5, nuevo.getCapturats());
    
    int filas = pepe.executeUpdate();
    
    conn.close();
    pepe.close();
    return filas;
   
    }else  throw new SQLException("CONEXION FALLIDA");

    
    }

    public Pokemon getBuscarPoke(Pokemon pokemon) throws SQLException {
        conn = DbConnect.getConnection();
        String query = "SELECT * FROM pokemons WHERE nom = ?";
        PreparedStatement pepe = conn.prepareStatement(query);
        pepe.setString(1, pokemon.getNom());
        ResultSet rs = pepe.executeQuery();
        
        if(rs.next()){
        int id = rs.getInt("id");
        String no = rs.getString("nom");
        String tip = rs.getString("tipus");
        int niv = rs.getInt("nivell");
        
        Pokemon pok = new Pokemon(id, no, tip, niv, 1);
         
        rs.close();
        conn.close();
        return pok;
        }else{
            rs.close();
            conn.close();
            return null;
        }
           
    }

    public int getBorrar(Pokemon borrar) throws SQLException {
        conn = DbConnect.getConnection();
        String query = "DELETE FROM pokemons WHERE nom =?";
        
        PreparedStatement pepe = conn.prepareStatement(query);  
        
        pepe.setString(1, borrar.getNom());
    
        int borr = pepe.executeUpdate();
        conn.close();
        return borr;
    }
  
    
    
    
}
