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
    public boolean addPeli(Pelicula anyadir) { //throws SQLException (si fos per a la interface)

        try {
            conn = DbConnect.getConnection();
        
       Statement stmt = conn.createStatement();
       
       String query = "INSERT INTO "
               + "movies(Titol,genere,duracion,segundaParte)" +
                  "VALUES ( '"+ anyadir.getTitol()+ "',' " 
               + anyadir.getGenere() +" '," 
               + anyadir.getDuracion() + ","
               + anyadir.getSegundaParte() + " )";
       
            System.out.println("QUERY- " + query );
           return  stmt.execute(query) == false;
          
               
               
        } catch (SQLException ex) {
            
            System.out.println(ex.getMessage());
            return false;
            
        }

    }
    
    
    
     public boolean addPeli2(Pelicula anyadir) { //throws SQLException (si fos per a la interface)

        try {
            conn = DbConnect.getConnection();
       
            String query ="INSERT INTO movies "
                    + " (Titol,genere , duracion,segundaParte) "
                    +"VALUES (?,?,?,?) ";
            System.out.println(query);
            
                    PreparedStatement pstmt = conn.prepareStatement(query);
                    
                    pstmt.setString(1, anyadir.getTitol());
                    pstmt.setString(2, anyadir.getGenere());
                    pstmt.setInt(3, anyadir.getDuracion());
                    pstmt.setBoolean(4, anyadir.getSegundaParte());
                    
                    
                    int filas =pstmt.executeUpdate();//retorna un int 
                    
                    //return pstmt.executeUpdate()==1;
                    //return filas ==1
                    if (filas ==1) return true;
                    else return false;
                    
        } catch (SQLException ex) {
            
            System.out.println(ex.getMessage());
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
               // String query = "SELECT * FROM MOVIES where genere = 'Sci-Fi'";
                
                //String genere = "Sci-Fi";
                // String query = "SELECT * FROM MOVIES"; original  
               // String querySciFi = "SELECT * FROM MOVIES where genere = ' " + genere  + " ' ";
                
                 
                
                int idpelquery=10;
                String queryId10 = "SELECT * FROM MOVIES where codiPel>" + idpelquery;
                
                
              //  ResultSet rs = stmt.executeQuery(query); //resultat es una clase que
                
                ResultSet rs = stmt.executeQuery(queryId10); 
                //ResultSet rs = stmt.executeQuery(querySciFi);
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

       
        try {
            conn = DbConnect.getConnection();
            
             String query ="DELETE  from  movies "
                    + " where  codiPel = " + "?";
            System.out.println(query);
            
                    PreparedStatement pstmt = conn.prepareStatement(query);
                    
                    
                    pstmt.setInt(1, fakeDelete.getCodiPel());
                    
                    
                    
                    int filas =pstmt.executeUpdate();//retorna un int 
                    
                    //return pstmt.executeUpdate()==1;
                    //return filas ==1
                    if (filas ==1) return true;
                    else return false;
            
            
            
            
        } catch (SQLException ex) {

            System.out.println(ex.getMessage());
            return false; 

        }
       
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
int filas = 0;
 try {
            conn = DbConnect.getConnection();
            
             String query ="DELETE  from  movies "
                    + " where  Titol = " + "?";
            System.out.println(query);
            
                    PreparedStatement pstmt = conn.prepareStatement(query);
                    
                    
                    pstmt.setString(1,tituloDelete);
                    
                    
                      //pstmt.setInt(1, fakeDelete.getCodiPel());
                     filas =pstmt.executeUpdate();//retorna un int 
                    
                    //return pstmt.executeUpdate()==1;
                    //return filas ==1
             
            
            
            
            
        } catch (SQLException ex) {

            System.out.println(ex.getMessage());
             

        }

 
        return filas;
    }

    @Override
    public boolean CambiarNombrePelicula(Pelicula searchPelicula) {
                
        
        
        try {
            conn = DbConnect.getConnection();
            
           String query = "UPDATE movies SET Titol = ? WHERE codiPel = ?";
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
