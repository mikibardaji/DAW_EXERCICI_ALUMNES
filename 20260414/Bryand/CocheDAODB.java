import PersistenciaModelo.DBConnect;
import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class CocheDAODB {
    Connection conn = null;
    public CocheDAODB() throws ClassNotFoundException {
        DBConnect.loadDriver();
    }


    public List<Coche> getLista() throws SQLException {
        conn = DBConnect.getConnection();
        if(conn != null){
            List<Coche> tienda = new ArrayList<>();
            String query = "SELECT * FROM coches";
            System.out.println(query);
            PreparedStatement pepereina = conn.prepareStatement(query);
            ResultSet cursor = pepereina.executeQuery();
            while(cursor.next()){
                String matricula = cursor.getString("matricula");
                String marca = cursor.getString("marca");
                int puerta = cursor.getInt("puertas");
                boolean esAutomatico = cursor.getBoolean("esAutomatico");
                Coche car = new Coche(matricula, marca, puerta, esAutomatico);
                tienda.add(car);
            }
            cursor.close();
            pepereina.close();
            conn.close();
            return tienda;
        }else{
            throw new SQLException("Conexion no realizada");
        }
        
    }

    public int addCoche(Coche nuevo) throws SQLException {
        conn = DBConnect.getConnection();
        String query = "INSERT INTO coches (matricula, marca, puertas, esAutomatico) VALUES(?, ?, ?, ?)";
        if(conn != null){
            System.out.println(query);
            PreparedStatement pepereina = conn.prepareStatement(query);
            pepereina.setString(1, nuevo.getMatricula());
            pepereina.setString(2, nuevo.getMarca());
            pepereina.setInt(3, nuevo.getPuertas());
            pepereina.setBoolean(4, nuevo.isEsAutomatico());
            int filas = pepereina.executeUpdate();
            pepereina.close();
            conn.close();
            return filas;
        }else{
            throw new SQLException("Conexion no realizada");
        }
    }

    public int modificarCar(Coche cochesModificar) throws SQLException {
        conn = DBConnect.getConnection();
        
        boolean existe = existeCocheMatricula(cochesModificar.getMatricula());
        
        if(existe==true){
            String query = "UPDATE coches SET marca = ? "
                + ", puertas = ? "
                + ", esAutomatico = ? "
                + " WHERE matricula = ?";
        
            //System.out.println(query);
            PreparedStatement pepe = conn.prepareStatement(query);
            pepe.setString(1, cochesModificar.getMarca());
            pepe.setInt(2, cochesModificar.getPuertas());
            pepe.setBoolean(3, cochesModificar.isEsAutomatico());
            pepe.setString(4, cochesModificar.getMatricula());
            int mod = pepe.executeUpdate();
            pepe.close();
            conn.close();
            return mod;
        }else{
            return 0;
        }
        
    }

    private boolean existeCocheMatricula(String matricula) throws SQLException {
        conn = DBConnect.getConnection();
        String query = "SELECT COUNT(*) AS 'Numero' FROM coches WHERE matricula = ?";
        PreparedStatement pepe = conn.prepareStatement(query);
        pepe.setString(1, matricula);
        ResultSet rs = pepe.executeQuery();
        int numero = 0;
        if(rs.next()){
            numero = rs.getInt("Numero");
        }
        return numero == 1;
    }

    public int eliminarCar(int puertas) throws SQLException {
        conn = DBConnect.getConnection();
        String query = "DELETE FROM coches WHERE puertas = ?";
        PreparedStatement pepe = conn.prepareStatement(query);
        pepe.setInt(1, puertas);
        int del = pepe.executeUpdate();
        pepe.close();
        conn.close();
        return del;
    }

    public Coche datosCoche(String matricula) throws SQLException {
        conn = DbConnect.getConnection();       
        String  query ="SELECT * from Coches where matricula = ? ";
        PreparedStatement pstmt = conn.prepareStatement(query);
        pstmt.setString (1,matricula);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()){
            String mat = rs.getString("matricula");
            String marca = rs.getString("marca");
            int puertas = rs.getInt("puertas");
            boolean auto = rs.getBoolean("automatico");
        
            Coche car = new Coche(matricula, marca, puertas, auto);
        
            rs.close();
            pstmt.close();
            conn.close();

            return car;
        }else {
            rs.close();
            pstmt.close();
            conn.close();

            return null;
        }}
    
}