/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import PersistenciaModelo.DbConnect;
import com.mysql.cj.xdevapi.PreparableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 *
 * @author cme9861
 */
public class PokemonDAODB {
    Connection conn = null;
    private EvolucioDAO evolucioDAO;
    
    public PokemonDAODB() throws ClassNotFoundException {
        DbConnect.loadDriver();    
        evolucioDAO = new EvolucioDAO();
        
    }
   
    public List<Pokemon> listarPokemons() throws SQLException {
        conn = DbConnect.getConnection();
        
        if (conn != null) {
            List<Pokemon> Pokedex = new ArrayList<>();
            String query = "SELECT * FROM pokemons";
            System.out.println(query);
            PreparedStatement pstmt = conn.prepareStatement(query);
            ResultSet cursor = pstmt.executeQuery(query);
            
            while(cursor.next()){
                int id = cursor.getInt("id");
                String nom = cursor.getString("nom");
                String tipus = cursor.getString("tipus");
                int nivell = cursor.getInt("nivell");
                int capturats = cursor.getInt("capturats");
               
                Pokemon pokepoke = new Pokemon(id, nom, tipus, nivell, capturats);
                Pokedex.add(pokepoke);
            }
            
            cursor.close();
            pstmt.close();
            conn.close();
            
            return Pokedex;
        } else {
            throw new SQLException("Conexión fallida.");
        }
    } 

   
    public boolean pokemonExiste(String nom) throws SQLException {
        conn = DbConnect.getConnection();
                
        if (conn != null) {
            String query = "SELECT * FROM pokemons WHERE nom = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, nom);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return true;
            } else {
                
                rs.close();
                pstmt.close();
                conn.close();
                return false;
            }
        } return false;
        
    } 

    public int insertarPokemon(Pokemon anyadirPokemonCapturado) throws SQLException {
        conn = DbConnect.getConnection();
        
        String query = "INSERT INTO pokemons " + " (id, nom, tipus, nivell, capturats)"
                + " VALUES (?, ?, ?, ?, ?) ";
        
        if (conn != null) {
        
        PreparedStatement pstmt = conn.prepareStatement(query);
        pstmt.setInt(1, anyadirPokemonCapturado.getId());
        pstmt.setString(2, anyadirPokemonCapturado.getNom());
        pstmt.setString(3, anyadirPokemonCapturado.getTipus());
        pstmt.setInt(4, anyadirPokemonCapturado.getNivell());
        pstmt.setInt(5, anyadirPokemonCapturado.getCapturats());
        int filasInsertadas = pstmt.executeUpdate();
            pstmt.close();
            conn.close();
            return filasInsertadas;
     } else {
        throw new SQLException("Conexión fallida");       
    }
   }

    public int aumentarCapturados(String nom) throws SQLException {
        conn = DbConnect.getConnection();
        
        if (conn != null) {
        String query = "UPDATE pokemons SET capturats = capturats + 1 WHERE nom = ?";
        System.out.println(query);
        PreparedStatement pstmt = conn.prepareStatement(query);
        pstmt.setString(1, nom);
        int filasActualizadas = pstmt.executeUpdate();
        pstmt.close();
            conn.close();
            return filasActualizadas;
        } else {
        throw new SQLException("Conexión fallida");       
    }
    }

    public List<Pokemon> listarPorNombre(String texto) throws SQLException {
        conn = DbConnect.getConnection();
        
        if (conn != null) {
            List<Pokemon> listaNombres = new ArrayList<>();
            String query = "SELECT * FROM pokemons WHERE nom LIKE ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, "%" + texto + "%");
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()) { 
                int id = rs.getInt("id");
                String nom = rs.getString("nom");
                String tipus = rs.getString("tipus");
                int nivell = rs.getInt("nivell");
                int capturats = rs.getInt("capturats");
                
                Pokemon encontrado = new Pokemon(id, nom, tipus, nivell, capturats);
                listaNombres.add(encontrado);
            }   rs.close();
                pstmt.close();
                conn.close();
                return listaNombres;
        }   
            return new ArrayList<>();
    }

    public String pokemonEvolucionado(String nomBase) throws SQLException {
        conn = DbConnect.getConnection();
        
        if (conn != null) {           
             return evolucioDAO.obtenirEvolucio(nomBase);
        } else {
            conn.close();
            return null;
        }
    }

    public int obtenerCapturats(String nom) throws SQLException {
        conn = DbConnect.getConnection();
        
        if (conn != null) {
            String query = "SELECT capturats FROM pokemons WHERE nom = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, nom);
            ResultSet rs = pstmt.executeQuery();
            
            if (rs.next()) {
                return rs.getInt("capturats");
            }
            rs.close();
            pstmt.close();
            conn.close();
        } return 0;
    } 

    public int pokemonEvolution(String nomBase, String nomEvolucionado, int cantidad) throws SQLException {
        conn = DbConnect.getConnection();
        
        if (conn != null) {
            String queryRestar = "UPDATE pokemons SET capturats = capturats - ? WHERE nom = ?";
            PreparedStatement pstmt1 = conn.prepareStatement(queryRestar);
            pstmt1.setInt(1, cantidad);
            pstmt1.setString(2, nomBase);
            int filasBase = pstmt1.executeUpdate();
            
            String querySumar = "UPDATE pokemons SET capturats = capturats + ? WHERE nom = ?";
            PreparedStatement pstmt2 = conn.prepareStatement(querySumar);
            pstmt2.setInt(1, cantidad);
            pstmt2.setString(2, nomEvolucionado);
            int filasEvol = pstmt2.executeUpdate();
            
            pstmt2.close();
            pstmt1.close();
            conn.close();

            return filasBase + filasEvol;
        }
        return 0;
    }
}
    

    
