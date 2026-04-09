/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import PersistenciaModelo.DbConnect;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mabardaji
 */
public class PeliculaDAOBD implements InterfaceDAO{
    Connection conn=null;

    public PeliculaDAOBD() throws ClassNotFoundException {
        DbConnect.loadDriver();
    }
    
    
    
    

    @Override
    public boolean addPeli(Pelicula anyadir)  {   //throws SQLException (si no fos per la interface)    
        try {
        conn = DbConnect.getConnection(); //creo conexion a traves de la cual ejecutare 

        String query = "INSERT INTO movies"
                + " (Titol, genere,duracion,segundaParte) "
                + " VALUES (?,?,?,?) ";
        System.out.println(query);
        PreparedStatement pstmt = conn.prepareStatement(query); //preparada
        //PERO NO EXECUTADA 
        pstmt.setString(1, anyadir.getTitol());
        pstmt.setString(2, anyadir.getGenere());
        pstmt.setInt(3, anyadir.getDuracion());
        pstmt.setBoolean(4, anyadir.getSegundaParte());

        int filas = pstmt.executeUpdate(); //retorna un int
        //return pstmt.executeUpdate()==1;
        //return filas == 1;
        
        if (filas == 1) return true;
        else return false; //insert
        
        
        } catch (SQLException ex) {
            System.out.println(ex.getMessage()); //esto no deberia estar aqui            
            return false;
        }
    }

    public boolean addPeli2(Pelicula anyadir)  {   //throws SQLException (si no fos per la interface)    
        //utilizando Statement que es mas SUCIO
        try {
        conn = DbConnect.getConnection(); //creo conexion a traves de la cual ejecutare 

        Statement stmt = conn.createStatement();
        String query = "INSERT INTO "
                + "movies (Titol,genere,duracion,segundaParte)" +
                " VALUES ('"+ anyadir.getTitol() + "','"+ 
                anyadir.getGenere()+ "'," 
                + anyadir.getDuracion()+ ","
                + anyadir.getSegundaParte()+ ")";
        //verificacions
        System.out.println("Query=" + query);
        return stmt.execute(query)==false;
        
        
        } catch (SQLException ex) {
            System.out.println(ex.getMessage()); //esto no deberia estar aqui            
            return false;
        }
    }
    
    
    
    /**
     *
     * @return
     * @throws SQLException
     */
    @Override
    public List<Pelicula> allPelis() { //throws SQLException
        List<Pelicula> all = new ArrayList<>();
        try {
            conn = DbConnect.getConnection(); //creo conexion a traves de la cual ejecutare 
            //las instruccioes sql
            if (conn!=null)
            {
                Statement stmt = conn.createStatement(); // import java.sql.Statement
                String query = "SELECT * FROM MOVIES"; 
                String querySciFi = "SELECT * FROM MOVIES where genere = 'Sci-Fi'"; 
                
                String genere = "Sci-Fi";
                String querySciFi3 = "SELECT * FROM MOVIES where genere = '" + genere + "'"; 
                String queryidPel = "SELECT * FROM MOVIES WHERE codiPel > 10";
                int idPeli = 12;
                String queryidPelVariable = 
                        "SELECT * FROM MOVIES WHERE codiPel > " + idPeli + 
                        " AND genere = '" + genere + "'";
                System.out.println(queryidPelVariable);
                ResultSet rs = stmt.executeQuery(queryidPelVariable); //resultat es una clase que
                //contendra todas las filas
                //List<Pelicula> all = new ArrayList<>();
                while(rs.next()) //si da true es que hay una siguiente
                {
                   int codiPelSaved = rs.getInt("codiPel");
                   String titolSaved = rs.getString("Titol");
                   String genereSaved = rs.getString("genere");
                   int duracionSaved = rs.getInt("duracion");
                   boolean segundaParteSaved = rs.getBoolean("segundaParte");
                   all.add(new Pelicula(codiPelSaved, titolSaved, genereSaved, duracionSaved, segundaParteSaved));
                }
                rs.close();
                stmt.close();
                conn.close();
                return all; //retorno la lista
            }
            else
                return all;
        } catch (SQLException ex) { //esto seria throws SQLEXCETPTION en la cabecera, 
            //pero el interface no deja
            System.out.println(ex.getMessage());
            return all; 
        }
    }

    @Override
    public List<Pelicula> AllPelisSecondPart(boolean segunda) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean borrarPelicula(Pelicula fakeDelete) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Pelicula findPeli(Pelicula fakeSearch) throws InvalidIdPeliculaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Pelicula> findPelisGenero(String generoSearch) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Pelicula> findPelisGenero2(Pelicula generoSearch) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int borrarPeliculasNombre(String tituloDelete) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
