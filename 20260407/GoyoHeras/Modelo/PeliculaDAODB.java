package Modelo;

import java.util.ArrayList;
import java.util.List;
import PersistenciaModelo.DbConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PeliculaDAODB implements InterfaceDAO {
    
    public PeliculaDAODB() throws ClassNotFoundException {
        DbConnect.loadDriver();
    }

    @Override
    public List<Pelicula> AllPelisSecondPart(boolean segunda) {
        List<Pelicula> peliculas = new ArrayList<>();
        String query = "SELECT * FROM peliculas WHERE segunda_parte = ?";
        
        try (Connection conn = DbConnect.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            
            pstmt.setBoolean(1, segunda);
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()) {
                int codiPel = rs.getInt("codi_pel");
                String titol = rs.getString("titol");
                String genere = rs.getString("genere");
                boolean segundaParte = rs.getBoolean("segunda_parte");
                int duracion = rs.getInt("duracion");
                peliculas.add(new Pelicula(codiPel, titol, genere, segundaParte, duracion));
            }
            rs.close();
            
        } catch (SQLException e) {
            System.err.println("Error al buscar películas por segunda parte: " + e.getMessage());
        }
        return peliculas;
    }

    @Override
    public boolean addPeli(Pelicula anyadir) {
        String query = "INSERT INTO peliculas (codi_pel, titol, genere, segunda_parte, duracion) VALUES (?, ?, ?, ?, ?)";
        
        try (Connection conn = DbConnect.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            
            pstmt.setInt(1, anyadir.getCodiPel());
            pstmt.setString(2, anyadir.getTitol());
            pstmt.setString(3, anyadir.getGenere());
            pstmt.setBoolean(4, anyadir.getSegundaParte());
            pstmt.setInt(5, anyadir.getDuracion());
            
            int filasAfectadas = pstmt.executeUpdate();
            return filasAfectadas > 0;
            
        } catch (SQLException e) {
            if (e.getMessage().contains("Duplicate entry")) {
                System.err.println("Error: Ya existe una película con ese ID.");
            } else {
                System.err.println("Error al añadir película: " + e.getMessage());
            }
            return false;
        }
    }

    @Override
    public List<Pelicula> allPelis() {
        List<Pelicula> all = new ArrayList<>();
        String query = "SELECT * FROM peliculas ORDER BY codi_pel";
        
        try (Connection conn = DbConnect.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            
            while (rs.next()) {
                int codiPelSaved = rs.getInt("codi_pel");
                String titolSaved = rs.getString("titol");
                String genereSaved = rs.getString("genere");
                boolean segundaPartSaved = rs.getBoolean("segunda_parte");
                int duracionSaved = rs.getInt("duracion");
                all.add(new Pelicula(codiPelSaved, titolSaved, genereSaved, segundaPartSaved, duracionSaved));
            }
            
        } catch (SQLException e) {
            System.err.println("Error al obtener todas las películas: " + e.getMessage());
        }
        return all;
    }

    @Override
    public boolean borrarPelicula(Pelicula fakeDelete) {
        String query = "DELETE FROM peliculas WHERE codi_pel = ?";
        
        try (
            Connection conn = DbConnect.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(query)) {
            
            pstmt.setInt(1, fakeDelete.getCodiPel());
            int filasAfectadas = pstmt.executeUpdate();
            return filasAfectadas > 0;
            
        } catch (SQLException e) {
            System.err.println("Error al borrar película con ID " + fakeDelete.getCodiPel() + ": " + e.getMessage());
            return false;
        }
    }

    @Override
    public int borrarPeliculasNombre(String tituloDelete) {
        String query = "DELETE FROM peliculas WHERE titol = ?";
        int contador = 0;
        
        try (Connection conn = DbConnect.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            
            pstmt.setString(1, tituloDelete);
            contador = pstmt.executeUpdate();
            
        } catch (SQLException e) {
            System.err.println("Error al borrar películas por nombre: " + e.getMessage());
        }
        return contador;
    }

    @Override
    public Pelicula findPeli(Pelicula fakeSearch) throws InvalidIdPeliculaException {
        if (fakeSearch.getCodiPel() <= 0) {
            throw new InvalidIdPeliculaException();
        }
        
        String query = "SELECT * FROM peliculas WHERE codi_pel = ?";
        
        try (Connection conn = DbConnect.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            
            pstmt.setInt(1, fakeSearch.getCodiPel());
            ResultSet rs = pstmt.executeQuery();
            
            if (rs.next()) {
                int codiPel = rs.getInt("codi_pel");
                String titol = rs.getString("titol");
                String genere = rs.getString("genere");
                boolean segundaParte = rs.getBoolean("segunda_parte");
                int duracion = rs.getInt("duracion");
                return new Pelicula(codiPel, titol, genere, segundaParte, duracion);
            }
            
        } catch (SQLException e) {
            System.err.println("Error al buscar película: " + e.getMessage());
        }
        return null;
    }

    @Override
    public List<Pelicula> findPelisGenero(String generoSearch) {
        List<Pelicula> peliculas = new ArrayList<>();
        String query = "SELECT * FROM peliculas WHERE UPPER(genere) = UPPER(?)";
        
        try (Connection conn = DbConnect.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            
            pstmt.setString(1, generoSearch);
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()) {
                int codiPel = rs.getInt("codi_pel");
                String titol = rs.getString("titol");
                String genere = rs.getString("genere");
                boolean segundaParte = rs.getBoolean("segunda_parte");
                int duracion = rs.getInt("duracion");
                peliculas.add(new Pelicula(codiPel, titol, genere, segundaParte, duracion));
            }
            
        } catch (SQLException e) {
            System.err.println("Error al buscar películas por género: " + e.getMessage());
        }
        return peliculas;
    }

    @Override
    public List<Pelicula> findPelisGenero2(Pelicula generoSearch) {
        // Este método es similar al anterior pero recibe un objeto Pelicula
        return findPelisGenero(generoSearch.getGenere());
    }

    @Override
    public List<Pelicula> findPelisByCodiMajorQue(int codiMinim) {
    List<Pelicula> peliculas = new ArrayList<>();
    String query = "SELECT * FROM peliculas WHERE codi_pel > ?";
    
    try (Connection conn = DbConnect.getConnection();
         PreparedStatement pstmt = conn.prepareStatement(query)) {
        
        pstmt.setInt(1, codiMinim);  // Aquí pones 10 o el número que quieras
        ResultSet rs = pstmt.executeQuery();
        
        while (rs.next()) {
            int codiPel = rs.getInt("codi_pel");
            String titol = rs.getString("titol");
            String genere = rs.getString("genere");
            boolean segundaParte = rs.getBoolean("segunda_parte");
            int duracion = rs.getInt("duracion");
            peliculas.add(new Pelicula(codiPel, titol, genere, segundaParte, duracion));
        }
        
    } catch (SQLException e) {
        System.err.println("Error al buscar películas con código > " + codiMinim + ": " + e.getMessage());
    }
    return peliculas;
    }

    @Override   
    public boolean updateTitolPelicula(int id, String nouTitol) {
        String sql = "UPDATE peliculas SET titol = ? WHERE codi_pel = ?";
        
        try (Connection conn = DbConnect.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, nouTitol);
            pstmt.setInt(2, id);
            
            int filesActualitzades = pstmt.executeUpdate();
            return filesActualitzades > 0;
            
        } catch (SQLException e) {
            System.err.println("Error al actualizar título: " + e.getMessage());
            return false;
        }
    }
}
