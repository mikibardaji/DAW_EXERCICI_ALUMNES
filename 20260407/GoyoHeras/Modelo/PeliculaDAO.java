/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author mabardaji
 */
public class PeliculaDAO {
    List<Pelicula> cataleg;

    public PeliculaDAO() {
        this.cataleg = new LinkedList<>();
        this.afegirPelisInicials();
    }

    /**metodo de pruebas
     * para tener datos iniciales
     */
    private void afegirPelisInicials() {
        addPeli(new Pelicula(1, "Alien", "TERROR", true, 120));
        addPeli(new Pelicula(34, "Alien", "TERROR", true, 80));
        addPeli(new Pelicula(14, "Agarralo como puedas 14", "Comica", true, 120));
        addPeli(new Pelicula(2, "Matrix", "CIENCIA FICCIO", true, 110));
        addPeli(new Pelicula(3, "Salvar al Soldado Ryan", "WESTERN", false, 120));
        addPeli(new Pelicula(4, "Top Secret", "Comica", false, 120));
        addPeli(new Pelicula(4, "Agarralo como puedas", "Comica", true, 125));
        addPeli(new Pelicula(24, "Alien", "TERROR", true, 130));
  
    }

    public boolean addPeli(Pelicula anyadir) {
        /*validaciones
        por ejemplo no queremos pelis de 18 a�os
        lanzaria excepcion (falta atributo edad en pelis)*/
        /* validacion que no exista una peli con el mismo id en el catalogo*/
        if (cataleg.contains(anyadir))
        { //no quiero a�adir una peli con el mismo id
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
            { //coincide lo a�ado
                seleccionadas.add(cataleg.get(i));
            }
        }
        return seleccionadas; //cReadud
    }

    public boolean borrarPelicula(Pelicula fakeDelete) {
        /*validaciones si hacen delete
        tuviera prohubido borrar las de western*/
        
        return cataleg.remove(fakeDelete); //equals
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
    
    
}
