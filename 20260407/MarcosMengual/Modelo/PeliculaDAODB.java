package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import persistenciamodelo.DbConnect;

public class PeliculaDAODB implements InterfaceDAO {

    Connection conn = null;

    public PeliculaDAODB() throws ClassNotFoundException, SQLException {
        DbConnect.loadDriver();
        conn = DbConnect.getConnection();
    }

@Override
public boolean addPeli(Pelicula anyadir) {
    try {
        conn = DbConnect.getConnection();
        Statement stmt = conn.createStatement();

        String query = "INSERT INTO peliculas (Titol, genere, duracion, segundaParte) VALUES ('"
                + anyadir.getTitol() + "', '"
                + anyadir.getGenere() + "', "
                + anyadir.getDuracion() + ", "
                + anyadir.getSegundaParte() + ")";

        System.out.println("Query: " + query);

        stmt.executeUpdate(query);
        return true;

    } catch (SQLException ex) {
        System.out.println(ex.getMessage());
        return false;
    }
}


public boolean addPeli2(Pelicula anyadir) {
    try {
        conn = DbConnect.getConnection();
        Statement stmt = conn.createStatement();

        String query = "INSERT INTO peliculas" + 
        "(Titol, genere, duracion, segundaParte)"
        + "VALUES (?,?,?,?)"; 

        System.out.println(query);
        PreparedStatement pstmt = conn.prepareStatement(query);
        pstmt.setString(1, anyadir.getTitol());
        pstmt.setString(2, anyadir.getGenere());
        pstmt.setInt(3, anyadir.getDuracion());
        pstmt.setBoolean(4, anyadir.getSegundaParte());

         int filas = pstmt.executeUpdate();
        
         if (filas == 1) 
        {
            return true;
        }
        else {
            return false;
        }

    } catch (SQLException ex) {
        System.out.println(ex.getMessage());
        return false;
    }
    
}

public boolean borrarpeli(Pelicula fakeDelete) {
    try {

        conn = DbConnect.getConnection();
        
        Statement stmt = conn.createStatement();

        
        String querydelete = "DELETE FROM peliculas WHERE Titol = '" + fakeDelete.getTitol() + "'";

        System.out.println("Query: " + querydelete);

        stmt.executeUpdate(querydelete);

        return true;

    } catch (SQLException ex) {
        System.out.println(ex.getMessage());
        return false;
    }
}





    @Override
    public List<Pelicula> allPelis() {
        List<Pelicula> llista = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            String query = "SELECT * FROM peliculas";
            // String querycomedia = "SELECT * FROM peliculas WHERE genere = 'Comedia'";

    
            String queryidpel = "SELECT * FROM peliculas WHERE codiPel > 10";

            int idpel = 12;

            String queryidvariable = "SELECT * FROM peliculas WHERE codiPel >" + idpel; 


            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                Pelicula p = new Pelicula(
                    rs.getInt("codiPel"),
                    rs.getString("Titol"),
                    rs.getString("genere"),
                    rs.getInt("duracion"),
                    rs.getBoolean("segundaParte")
                );
                llista.add(p);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return llista;
    }

    @Override
    public List<Pelicula> AllPelisSecondPart(boolean segunda) {
        return new ArrayList<>();
    }

    @Override
    public boolean borrarPelicula(Pelicula fakeDelete) {
        return false;
    }

    @Override
    public Pelicula findPeli(Pelicula fakeSearch) throws InvalidIdPeliculaException {
        return null;
    }

    @Override
    public List<Pelicula> findPelisGenero(String generoSearch) {
        return new ArrayList<>();
    }

    @Override
    public List<Pelicula> findPelisGenero2(Pelicula generoSearch) {
        return new ArrayList<>();
    }

    @Override
    public int borrarPeliculasNombre(String tituloDelete) {
         try {

        conn = DbConnect.getConnection();
        
        Statement stmt = conn.createStatement();

        
        String querydelete = "DELETE FROM peliculas WHERE Titol = '" + tituloDelete + "'";

        System.out.println("Query: " + querydelete);

        int filas = stmt.executeUpdate(querydelete);
        return filas;

    } catch (SQLException ex) {
        System.out.println(ex.getMessage());
        return 0;
    }
    }


    @Override
      public boolean CambiarNombrePelicula(Pelicula searchPelicula) {
                
        
        
        try {
            conn = DbConnect.getConnection();
            
           String query = "ACTUALIZAR películas ESTABLECER Titol = ? DONDE codiPel = ?";
            System.out.println(query);
            
            
            PreparedStatement pstmt = conn.prepareStatement(query);
            
            pstmt.setString(1, searchPelicula.getTitol());
            
            pstmt.setInt(2, searchPelicula.getCodiPel());
            
            int filas = pstmt.executeUpdate();
            
            return filas ==1;
            
            
            
        } catch (SQLException ex) {

            System.out.println(ex.getMessage());
            return false;

        }
       
        
  
    }
}
