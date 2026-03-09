package utilitats;


import java.util.ArrayList;
import java.util.List;

public class CocheDAO {

    private List<Coche> coches;

    public CocheDAO() {
        coches = new ArrayList<>();
        cargarDatos();
    }

   private void cargarDatos() {

    coches.add(new Coche("1111AAA", "Toyota", "Supra MK3", 1987, 32000, "Rojo"));
    coches.add(new Coche("2222BBB", "Nissan", "Skyline R32", 1991, 45000, "Negro"));
    coches.add(new Coche("3333CCC", "Mazda", "RX-7 FC", 1989, 38000, "Blanco"));
    coches.add(new Coche("4444DDD", "Honda", "NSX", 1992, 75000, "Rojo"));
    coches.add(new Coche("5555EEE", "Mitsubishi", "3000GT", 1994, 41000, "Gris"));
    coches.add(new Coche("6666FFF", "Subaru", "Impreza WRX", 1999, 29000, "Azul"));
    coches.add(new Coche("7777GGG", "Toyota", "AE86 Trueno", 1986, 36000, "Blanco"));
}
    public boolean anyadirCoche(Coche coche) throws marcaNotValidException {

        if (coche.getMarca().equalsIgnoreCase("BMW") ||
            coche.getMarca().equalsIgnoreCase("Renault")) {

            throw new marcaNotValidException(coche.getMarca());
        }

        return coches.add(coche);
    }

    public boolean cocheVendido(String matricula) {

        Coche borrar = new Coche(matricula, null, null, 0, 0, null);
        return coches.remove(borrar);
    }

    public boolean dejarTrabajarMarca(String marca) {

        boolean eliminado = false;

        for (int i = coches.size() - 1; i >= 0; i--) {

            if (coches.get(i).getMarca().equalsIgnoreCase(marca)) {
                coches.remove(i);
                eliminado = true;
            }
        }

        return eliminado;
    }

    public List<Coche> getLisTodosLosCoches() {
        return coches;
    }

    public List<Coche> getDevueltaCochesMarca(String marca) {

        List<Coche> resultado = new ArrayList<>();

        for (Coche c : coches) {

            if (c.getMarca().equalsIgnoreCase(marca)) {
                resultado.add(c);
            }
        }

        return resultado;
    }

    public List<Coche> getCochesDiezMilE(double precio) {

        List<Coche> baratos = new ArrayList<>();

        for (Coche c : coches) {

            if (c.getPrecio() <= precio) {
                baratos.add(c);
            }
        }

        return baratos;
    }

    public List<Coche> getCohesRangoPrecio(double min, double max) {

        List<Coche> lista = new ArrayList<>();

        for (Coche c : coches) {

            if (c.getPrecio() >= min && c.getPrecio() <= max) {
                lista.add(c);
            }
        }

        return lista;
    }

    public List<Coche> getListCochesEtiquetaMedioambiental(int anyo) {

        List<Coche> lista = new ArrayList<>();

        for (Coche c : coches) {

            if (c.getAnyo() >= anyo) {
                lista.add(c);
            }
        }

        return lista;
    }
}