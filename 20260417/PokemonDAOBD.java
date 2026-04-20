package Modelo;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import persistencia.Dbconnect;

public class PokemonDAOBD {

    Connection conn = null;

    public PokemonDAOBD() throws ClassNotFoundException {
        Dbconnect.loadDriver();
    }

    public List<Pokemon> getLista() throws SQLException {

        conn = Dbconnect.getConnection();

        if (conn != null) {

            List<Pokemon> catalogo = new ArrayList<>();

            String query = "SELECT * FROM pokemons";
            System.out.println(query);

            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet cursor = ps.executeQuery();

            while (cursor.next()) {
                int id = cursor.getInt("id");
                String nom = cursor.getString("nom");
                String tipus = cursor.getString("tipus");
                int nivell = cursor.getInt("nivell");
                int capturats = cursor.getInt("capturats");

                Pokemon pok = new Pokemon(id, nom, tipus, nivell, capturats);
                catalogo.add(pok);
            }

            cursor.close();
            ps.close();
            conn.close();

            return catalogo;

        } else {
            throw new SQLException("Conexion fallida");
        }
    }

    public int addPokemon(Pokemon nuevo) throws SQLException {

        conn = Dbconnect.getConnection();

        String query = "INSERT INTO pokemons (id, nom, tipus, nivell, capturats) VALUES(?,?,?,?,?)";

        if (conn != null) {

            System.out.println(query);

            PreparedStatement ps = conn.prepareStatement(query);

            ps.setInt(1, nuevo.getId());
            ps.setString(2, nuevo.getNom());
            ps.setString(3, nuevo.getTipus());
            ps.setInt(4, nuevo.getNivell());
            ps.setInt(5, nuevo.getCapturats());

            int filas = ps.executeUpdate();

            ps.close();
            conn.close();

            return filas;

        } else {
            throw new SQLException("Conexion fallida");
        }
    }

    public Pokemon buscarPokemonPorNombre(String nom) throws SQLException {

        conn = Dbconnect.getConnection(); // 🔥 ARREGLADO

        String sql = "SELECT * FROM pokemons WHERE nom = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, nom);

        ResultSet rs = ps.executeQuery();

        Pokemon p = null;

        if (rs.next()) {
            p = new Pokemon(
                    rs.getInt("id"),
                    rs.getString("nom"),
                    rs.getString("tipus"),
                    rs.getInt("nivell"),
                    rs.getInt("capturats")
            );
        }

        rs.close();
        ps.close();
        conn.close();

        return p;
    }

    public void incrementarCapturados(String nom) throws SQLException {

        conn = Dbconnect.getConnection(); // 🔥 ARREGLADO

        String sql = "UPDATE pokemons SET capturats = capturats + 1 WHERE nom = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, nom);

        ps.executeUpdate();

        ps.close();
        conn.close();
    }
}