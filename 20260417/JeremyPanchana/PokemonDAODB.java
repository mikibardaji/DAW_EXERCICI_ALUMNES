/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import PersistenciaModelo.DbConnect;


import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

import java.sql.PreparedStatement;
/**
 *
 * @author jpa2698
 */
public class PokemonDAODB {
    
    private EvolucioDAO evolucioDAO;
   

    
    
    Connection conn = null; 
    
    public PokemonDAODB() throws ClassNotFoundException{
        DbConnect.loadDriver();
        evolucioDAO = new EvolucioDAO();
    }
    
    public List<Pokemon> getListaPokemon () throws SQLException{
        conn = DbConnect.getConnection();
        
        
        if (conn!=null){
        List<Pokemon> pokedex = new ArrayList<>();
        
        String query = "SELECT * FROM pokemons";
        
        
            System.out.println(query);
         
            PreparedStatement pikachu = conn.prepareStatement(query);
            
            ResultSet cursor = pikachu.executeQuery();
            
            
            while (cursor.next()){
            
            
                int  id_poke = cursor.getInt("id");
                String nom_poke = cursor.getString("nom");
                String tipus_poke = cursor.getString("tipus");
                int nivell = cursor.getInt("nivell");
                int capturats = cursor.getInt("capturats");
                
                Pokemon pokemon_nou = new Pokemon(id_poke, nom_poke, tipus_poke, nivell, capturats);
                
                
                pokedex.add(pokemon_nou);
                
                
            
            }
            
            cursor.close();
            pikachu.close();
            
            conn.close();
            
            
                  return pokedex;
        
        }else {
        
        throw new SQLException("conexio fallida ");
        }
        
    
    
    
  
    
    
    
    
    }

 public int CapturarPokemon(String nom) throws SQLException {

    conn = DbConnect.getConnection();

    String query = "UPDATE pokemons SET capturats = capturats + 1 WHERE nom = ?";

    PreparedStatement ps = conn.prepareStatement(query);
    ps.setString(1, nom);

    int filas = ps.executeUpdate();

    ps.close();
    conn.close();

    return filas;
}
 
 
 
public boolean isExist(String name_pokemon) throws SQLException {

    conn = DbConnect.getConnection();

    String query = "SELECT * FROM pokemons WHERE nom = ?";

    PreparedStatement pstmt = conn.prepareStatement(query);
    pstmt.setString(1, name_pokemon);

    ResultSet resultado = pstmt.executeQuery();

    boolean existe = resultado.next();

    resultado.close();
    pstmt.close();
    conn.close();

    return existe;
}
    
    public int insertarPokemon(Pokemon p) throws SQLException {

    conn = DbConnect.getConnection();

    String query = "INSERT INTO pokemons (id, nom, tipus, nivell, capturats) VALUES (?, ?, ?, ?, ?)";

    PreparedStatement ps = conn.prepareStatement(query);

    ps.setInt(1, p.getId());
    ps.setString(2, p.getNom());
    ps.setString(3, p.getTipus());
    ps.setInt(4, p.getNivell());
    ps.setInt(5, p.getCapturats());

    int filas = ps.executeUpdate();

    ps.close();
    conn.close();

    return filas;
}
    
  public List<Pokemon> buscarPorNombre(String texto ) throws SQLException {
  
   conn = DbConnect.getConnection();
   List<Pokemon> llista = new ArrayList<>();
   
   String sql = "SELECT * FROM pokemons WHERE nom LIKE ?";
   
   
   PreparedStatement pstmt = conn.prepareStatement(sql);
   pstmt.setString(1,texto);
  
   ResultSet rs = pstmt.executeQuery();
   
   while(rs.next()){
   
        int  id_poke = rs.getInt("id");
                String nom_poke = rs.getString("nom");
                String tipus_poke = rs.getString("tipus");
                int nivell = rs.getInt("nivell");
                int capturats = rs.getInt("capturats");
                
                Pokemon pokemon_nou = new Pokemon(id_poke, nom_poke, tipus_poke, nivell, capturats);
                
                
                llista.add(pokemon_nou);
   }
  
  rs.close();
  pstmt.close();
  conn.close();
  return llista;
  
  }
  
  
  
public boolean evolucionPokemon(String nomPokemon, int cantidad) throws SQLException {
    conn = DbConnect.getConnection();
    

    String evo = evolucioDAO.obtenirEvolucio(nomPokemon);
    
    if (evo == null) {
        conn.close();
        return false;
    }
    
  
    String queryCapturats = "SELECT capturats FROM pokemons WHERE nom = ?";
    PreparedStatement pstmtCapturats = conn.prepareStatement(queryCapturats);
    pstmtCapturats.setString(1, nomPokemon);
    ResultSet rs = pstmtCapturats.executeQuery();
    
    if (!rs.next()) {
        rs.close();
        pstmtCapturats.close();
        conn.close();
        return false; 
    }
    
    int capturats = rs.getInt("capturats");
    rs.close();
    pstmtCapturats.close();
    
    if (capturats < cantidad) {
        conn.close();
        return false;
    }
    
 
    String restarBase = "UPDATE pokemons SET capturats = capturats - ? WHERE nom = ?";
    PreparedStatement psRestar = conn.prepareStatement(restarBase);
    psRestar.setInt(1, cantidad);
    psRestar.setString(2, nomPokemon);
    int filasRestar = psRestar.executeUpdate();
    psRestar.close();
    
    if (filasRestar == 0) {
        conn.close();
        return false;
    }
    

    String existeEvo = "SELECT COUNT(*) FROM pokemons WHERE nom = ?";
    PreparedStatement psExiste = conn.prepareStatement(existeEvo);
    psExiste.setString(1, evo);
    ResultSet rsExiste = psExiste.executeQuery();
    rsExiste.next();
    int count = rsExiste.getInt(1);
    rsExiste.close();
    psExiste.close();
    
    if (count > 0) {
      
        String sumarEvo = "UPDATE pokemons SET capturats = capturats + ? WHERE nom = ?";
        PreparedStatement psSumar = conn.prepareStatement(sumarEvo);
        psSumar.setInt(1, cantidad);
        psSumar.setString(2, evo);
        psSumar.executeUpdate();
        psSumar.close();
    } else {
  
        String datosBase = "SELECT tipus, nivell FROM pokemons WHERE nom = ?";
        PreparedStatement psDatos = conn.prepareStatement(datosBase);
        psDatos.setString(1, nomPokemon);
        ResultSet rsDatos = psDatos.executeQuery();
        
        if (rsDatos.next()) {
            String tipus = rsDatos.getString("tipus");
            int nivell = rsDatos.getInt("nivell");
            rsDatos.close();
            psDatos.close();
            
    
            String insertEvo = "INSERT INTO pokemons (id, nom, tipus, nivell, capturats) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(insertEvo);
            pstmt.setInt(1, 0); 
            pstmt.setString(2, evo);
         pstmt.setString(3, tipus);
           pstmt.setInt(4, nivell);
            pstmt.setInt(5, cantidad);
            pstmt.executeUpdate();
            pstmt.close();
        } else {
            rsDatos.close();
            psDatos.close();
            conn.close();
            return false;
        }
    }
    
    conn.close();
    return true;
}
  
  
    
}
