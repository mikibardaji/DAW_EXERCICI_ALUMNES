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
  
    
    
    
}
