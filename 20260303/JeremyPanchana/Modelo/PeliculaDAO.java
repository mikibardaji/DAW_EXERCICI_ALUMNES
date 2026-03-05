/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jeremy
 */
public class PeliculaDAO {
       List<Pelicula> cataleg;

    public PeliculaDAO() {
        this.cataleg = new ArrayList<>();
        this.afegirPelisInicials();
    }

    private void afegirPelisInicials() {
        cataleg.add(new Pelicula(1, "Alien", "TERROR", true));
        cataleg.add(new Pelicula(2, "Matrix", "CIENCIA FICCIO", true));
        cataleg.add(new Pelicula(3, "Salvar al Soldado Ryan", "WESTERN", false));
        cataleg.add(new Pelicula(4, "Top Secret", "Comica", false));
    }

    public boolean addPeli(Pelicula anyadir) {
        /*validaciones
        por ejemplo no queremos pelis de 18 años
        lanzaria excepcion (falta atributo edad en pelis)*/
        return cataleg.add(anyadir);
        
    }

    public List<Pelicula> allPelis() {
        return cataleg;
    }

    public List<Pelicula> AllPelisSecondPart(boolean segunda) {
        List<Pelicula> seleccionadas = new ArrayList<>();
        
        for (int i = 0; i < cataleg.size(); i++) {
            if (cataleg.get(i).getSegundaParte()==segunda)
            { //coincide lo añado
                seleccionadas.add(cataleg.get(i));
            }
        }
        return seleccionadas;
    }
    
    
    public List<Pelicula > filtrarGenere(String genere ){
    
    List<Pelicula > seleccionadas = new ArrayList<>();
    
    
        for (Pelicula peli : cataleg) {
            
            if (peli.getGenere().equalsIgnoreCase(genere));
            
            
            seleccionadas.add(peli);
            
            
        }
        
        
        return seleccionadas;
    
    }
    
    
    
    
    public Pelicula buscarporId(int id){
    
    
        for (Pelicula peli : cataleg) {
            if (peli.getCodiPel() == id){
            return peli;
            }
        }
    return null;
    }

    
    
    
    public List <Pelicula > buscarporNombre(String nombre ){
    
    List <Pelicula > encontradas = new ArrayList<>();
    
    for(Pelicula peli : cataleg){
    
    if (peli.getTitol().equalsIgnoreCase(nombre)){
    
    encontradas.add(peli);
    }
    }
    
    return encontradas;
    }
  
    
    
    
    
    public boolean borrarPerId(int id){
        Pelicula peli = buscarporId(id);
        
        
        if (peli != null){
    
    
        cataleg.remove(peli);
        }
        return false;
    
    
    }
    
    public int borrarPorNombre (String nombre ){
    
    int contador = 0;
    
        for (int i = 0; i < cataleg.size(); i++) {
            if (cataleg.get(i).getTitol().equalsIgnoreCase(nombre)){
            
            cataleg.remove(i);
            contador++;
            i--;
            }
        }
    
    return  contador ;
    }
    
    
}

