import java.util.ArrayList;
import java.util.List;

public class PeliculaDAO {

    private List<Pelicula> peliculas;

    public PeliculaDAO() {
        peliculas = new ArrayList<>();
        cargarIniciales();
    }

    private void cargarIniciales() {

        peliculas.add(new Pelicula(1, "Alien", "TERROR", true));
        peliculas.add(new Pelicula(2, "Matrix", "CIENCIA FICCIO", true));
        peliculas.add(new Pelicula(3, "Salvar al Soldado Ryan", "WESTERN", false));
        peliculas.add(new Pelicula(4, "Top Secret", "COMEDIA", false));
    }

    public boolean addPeli(Pelicula peli) {
        return peliculas.add(peli);
    }

    public List<Pelicula> allPelis() {
        return peliculas;
    }

    public List<Pelicula> AllPelisSecondPart(boolean valor) {

        List<Pelicula> resultado = new ArrayList<>();

        for (Pelicula p : peliculas) {
            if (p.getSegundaParte() == valor) {
                resultado.add(p);
            }
        }

        return resultado;
    }

    public List<Pelicula> filtrarGenere(String genero) {

        List<Pelicula> lista = new ArrayList<>();

        for (Pelicula p : peliculas) {
            if (p.getGenere().equalsIgnoreCase(genero)) {
                lista.add(p);
            }
        }

        return lista;
    }

    public Pelicula buscarporId(int id) {

        for (Pelicula p : peliculas) {
            if (p.getCodiPel() == id) {
                return p;
            }
        }

        return null;
    }

    public List<Pelicula> buscarporNombre(String nombre) {

        List<Pelicula> coincidencias = new ArrayList<>();

        for (Pelicula p : peliculas) {
            if (p.getTitol().equalsIgnoreCase(nombre)) {
                coincidencias.add(p);
            }
        }

        return coincidencias;
    }

    public boolean borrarPerId(int id) {

        Pelicula encontrada = buscarporId(id);

        if (encontrada != null) {
            peliculas.remove(encontrada);
            return true;
        }

        return false;
    }

    public int borrarPorNombre(String nombre) {

        int eliminadas = 0;

        for (int i = 0; i < peliculas.size(); i++) {

            Pelicula p = peliculas.get(i);

            if (p.getTitol().equalsIgnoreCase(nombre)) {
                peliculas.remove(i);
                eliminadas++;
                i--;
            }
        }

        return eliminadas;
    }
}