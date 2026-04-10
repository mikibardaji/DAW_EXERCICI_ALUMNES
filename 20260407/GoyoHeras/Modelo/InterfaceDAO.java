package Modelo;

import java.util.List;

public interface InterfaceDAO {
    public boolean addPeli(Pelicula anyadir);
    public List<Pelicula> allPelis();
    public List<Pelicula> AllPelisSecondPart(boolean segunda);
    public boolean borrarPelicula(Pelicula fakeDelete);
    public Pelicula findPeli(Pelicula fakeSearch) throws InvalidIdPeliculaException;
    public List<Pelicula> findPelisGenero(String generoSearch);
    public List<Pelicula> findPelisGenero2(Pelicula generoSearch);
    public int borrarPeliculasNombre(String tituloDelete);
    public List<Pelicula> findPelisByCodiMajorQue(int codiMinim);
    public boolean updateTitolPelicula(int id, String nouTitol);
}
