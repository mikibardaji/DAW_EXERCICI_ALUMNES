/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokedex;

import PersistenciaModelo.DbConnect;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

/**
 *
 * @author ghe2503
 */
public class PokemonDAODB {

    Connection conn;

    public PokemonDAODB() throws ClassNotFoundException {
        DbConnect.loadDriver();
    }

    public List<Pokemon> getLista() throws SQLException {
        conn = DbConnect.getConnection();
        if (conn != null) {
            List<Pokemon> pokemons = new ArrayList<>();
            String query = "SELECT * FROM pokemons";
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nom");
                String tipo = rs.getString("tipus");
                int nivel = rs.getInt("nivell");
                int capturados = rs.getInt("capturats");

                Pokemon poke = new Pokemon(id, nombre, tipo, nivel, capturados);
                pokemons.add(poke);
            }
            rs.close();
            stmt.close();
            conn.close();
            return pokemons;
        } else {
            throw new SQLException("Conexion fallida");
        }
    }

    public boolean comprobarExiste(String nom) throws SQLException {
        conn = DbConnect.getConnection();
        String query = "SELECT * FROM pokemons WHERE nom = ?";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, nom);

        ResultSet resultado = stmt.executeQuery();
        if (resultado.next()) {
            return true;
        } else {
            return false;
        }

    }

    public int actualizarCaptura(String nom) throws SQLException {
        conn = DbConnect.getConnection();
        String query2 = "UPDATE pokemon SET capturats = capturats + 1 +"
                + " WHERE nom = ?";
        PreparedStatement stmt = conn.prepareStatement(query2);
        stmt.setString(1, nom);

        int capturado = stmt.executeUpdate();
        stmt.close();
        conn.close();
        return capturado;
    }
    
    public int inserirPokemon(int id, String nom, String tipus, int nivell) throws SQLException {
        conn = DbConnect.getConnection();
        String query = "INSERT INTO pokemons (id, nom, tipus, nivell, capturats) VALUES (?, ?, ?, ?, 1)";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setInt(1, id);
        stmt.setString(2, nom);
        stmt.setString(3, tipus);
        stmt.setInt(4, nivell);
        
        int filasInsertadas = stmt.executeUpdate();
        
        stmt.close();
        conn.close();
        
        return filasInsertadas;
    }

    public List<Pokemon> buscarPerNom(String nom) throws SQLException {
        conn = DbConnect.getConnection();
        List<Pokemon> encontrados = new ArrayList<>();
        
        String query = "SELECT * FROM pokemons WHERE nom LIKE ?";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, nom);
        ResultSet rs = stmt.executeQuery();
        
        while (rs.next()) {
            Pokemon p = new Pokemon(
                rs.getInt("id"),
                rs.getString("nom"),
                rs.getString("tipus"),
                rs.getInt("nivell"),
                rs.getInt("capturats")
            );
            encontrados.add(p);
        }
        
        rs.close();
        stmt.close();
        conn.close();
        
        return encontrados;
    }
}
