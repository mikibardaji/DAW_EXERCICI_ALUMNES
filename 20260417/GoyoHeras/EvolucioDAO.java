/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokedex;

import PersistenciaModelo.DbConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EvolucioDAO {
    
    private Connection conn;
    
    public EvolucioDAO() throws ClassNotFoundException {
        DbConnect.loadDriver();
    }
    
    public String obtenirEvolucio(String nomBase) throws SQLException {
        conn = DbConnect.getConnection();
        String sql = "SELECT pokemon_evolucionat FROM evolucions WHERE pokemon_base = ?";
        
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, nomBase);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                return rs.getString("pokemon_evolucionat");
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar evolució: " + e.getMessage());
        } finally {
            conn.close();
        }
        return null;
    }
}
