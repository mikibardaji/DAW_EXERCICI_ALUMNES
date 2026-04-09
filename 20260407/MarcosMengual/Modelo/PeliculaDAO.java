package Modelo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import persistenciamodelo.DbConnect;

/**
 *
 * @author mabardaji
 */
public class PeliculaDAO implements InterfaceDAO{
    List<Pelicula> cataleg;

    public PeliculaDAO() {
        this.cataleg = new LinkedList<>();
        this.afegirPelisInicials();
    }

    /**metodo de pruebas
     * para tener datos iniciales
     */
    private void afegirPelisInicials() {
        addPeli(new Pelicula(1, "Alien", "TERROR", 100, true));
        addPeli(new Pelicula(34, "Alien", "TERROR",100, true));
        addPeli(new Pelicula(14, "Agarralo como puedas 14", "Comica", 100,true));
        addPeli(new Pelicula(2, "Matrix", "CIENCIA FICCIO", 100,true));
        addPeli(new Pelicula(3, "Salvar al Soldado Ryan", "WESTERN",100, false));
        addPeli(new Pelicula(4, "Top Secret", "Comica", 100,false));
        addPeli(new Pelicula(4, "Agarralo como puedas", "Comica", 100,true));
        addPeli(new Pelicula(24, "Alien", "TERROR",100, true));
  
    }

    public boolean addPeli(Pelicula anyadir) {
        /*validaciones
        por ejemplo no queremos pelis de 18 años
        lanzaria excepcion (falta atributo edad en pelis)*/
        /* validacion que no exista una peli con el mismo id en el catalogo*/
        if (cataleg.contains(anyadir))
        { //no quiero añadir una peli con el mismo id
            return false;//la otra opcion seria tirar una exception
        }
        return cataleg.add(anyadir);
        //CreateRUD
    }

    public List<Pelicula> allPelis() {
        return cataleg; //cReadud
    }

    public List<Pelicula> AllPelisSecondPart(boolean segunda) {
        List<Pelicula> seleccionadas = new ArrayList<>();
        
        for (int i = 0; i < cataleg.size(); i++) {
            if (cataleg.get(i).getSegundaParte()==segunda)
            { //coincide lo añado
                seleccionadas.add(cataleg.get(i));
            }
        }
        return seleccionadas; //cReadud
    }

    public boolean borrarPelicula(Pelicula fakeDelete) {
        try {
        Connection conn = DbConnect.getConnection();

       Statement stmt = conn.createStatement();

        String querydelete = "DELETE FROM peliculas WHERE Titol = '" + fakeDelete.getTitol() + "'";

        System.out.println("Query: " + querydelete);

        int filas = stmt.executeUpdate(querydelete);
        return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        } 
    }

    public Pelicula findPeli(Pelicula fakeSearch) throws InvalidIdPeliculaException {
        //posibles validaciones si id es negativo ya no puede existir
        if (fakeSearch.getCodiPel()<=0)
        {
            throw new InvalidIdPeliculaException();
        }
        //si no fuera campo informada del equalds tendira que hacer un for
        
        int pos = cataleg.indexOf(fakeSearch); //-1 si no existe
        if (pos!=-1)
        {
            return cataleg.get(pos); //objeto entero
        }
        else
        {
            return null; //no existe la peli
        }
        
    }

    public List<Pelicula> findPelisGenero(String generoSearch) {
        /* validacion
        si el genero es de un genero valido
        "WESTERN".equalsIgnoreCase(generoSearch) 
                || "CIENCIA FICCIO".equalsIgnoreCase(generoSearch)
                || "TERROR".equalsIgnoreCase(generoSearch)*/
        
        List<Pelicula> seleccionado = new ArrayList<>();
        for (int i = 0; i < cataleg.size(); i++) {
            if(cataleg.get(i).getGenere().equalsIgnoreCase(generoSearch))
            {
                seleccionado.add(cataleg.get(i));
            }
        }
        return seleccionado;
    }

    public List<Pelicula> findPelisGenero2(Pelicula generoSearch) {
        /* se podria hacer esta opcion
        pero no me ahorro el for y por tanto no gano */
        
        List<Pelicula> seleccionado = new ArrayList<>();
        for (int i = 0; i < cataleg.size(); i++) {
            if(cataleg.get(i).getGenere().equalsIgnoreCase(generoSearch.getGenere()))
            {
                seleccionado.add(cataleg.get(i));
            }
        }
        return seleccionado;
    }  

    public int borrarPeliculasNombre(String tituloDelete) {
        boolean borrado = false;//opcion 1 ok pero simple
        int contDeletes=0;
         for (int i = 0; i < cataleg.size(); i++) {
            if (cataleg.get(i).getTitol().equalsIgnoreCase(tituloDelete))
            {
                cataleg.remove(i);
                //cataleg.remove(cataleg.get(i)); valida
                borrado = true;
                contDeletes++;
            }
        }
        //return borrado;
        return contDeletes;
    }
        @Override
    public boolean CambiarNombrePelicula(Pelicula searchPelicula) {

        return false;


    }

    
}
    
