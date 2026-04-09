package catalegpelismvc;

import Modelo.InvalidIdPeliculaException;
import Modelo.Pelicula;
import Modelo.PeliculaDAO;
import Modelo.PeliculaDAOBD;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import utilitats.Menu;

public class CatalegPelisMVC {

    public static void main(String[] args) {
        CatalegPelisMVC app = new CatalegPelisMVC();
        app.run();
    }

    private void run() {
        try {
            PeliculaDAOBD cataleg;
            cataleg = new PeliculaDAOBD();

            Menu menuConsola = new Menu("Catalogo de pelis", true);
            anyadirItemsMenu(menuConsola);

            int opcio;
            do {
                menuConsola.mostrarMenu();
                opcio = menuConsola.llegirOpcioValida();

                switch (opcio) {

                    case 2:
                        System.out.println("Has seleccionat: Afegir Película");
                        afegirPeli(cataleg);
                        break;

                    case 3:
                        System.out.println("Has seleccionat: Buscar pel·lícula per ID");
                        buscarPeliId(cataleg);
                        break;

                    case 4:
                        System.out.println("Has seleccionat: Buscar pel·lícula segunda Parte");
                        buscarPeliSegundaParte(cataleg);
                        break;

                    case 5:
                        System.out.println("Has seleccionat: Borrar pel·lícula");
                        borrarPeli(cataleg);
                        break;

                    case 6:
                        System.out.println("Has seleccionat: Llistar pel·lícules");
                        llistarPelicules(cataleg);
                        break;

                    case 7:
                        System.out.println("Has seleccionat: Borrar pel·lícula nombre");
                        borrarPeliNombre(cataleg);
                        break;

                    case 8:
                        System.out.println("Has seleccionat: Filtrar por genero");
                        filtrarGenere(cataleg);
                        break;

                    case 9:
                        System.out.println("Has seleccionat: Llistar pel·lícules ordenadas por nombre");
                        llistarPeliculesOrdenades(cataleg);
                        break;

                    case 10:
                        System.out.println("Has seleccionat: Actualitzar nom pel·lícula per id");
                        actualizarNombrePelicula(cataleg);
                        break;
                }

                System.out.println();

            } while (opcio != menuConsola.getOpcioSalida());

            System.out.println("Sortint del programa...");

        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void afegirPeli(PeliculaDAOBD cataleg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pon el id:");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Pon el titol:");
        String titulo = sc.nextLine();
        System.out.print("Pon el genere:");
        String genero = sc.nextLine();
        System.out.print("Pon la duracion pelicula:");
        int duracion = sc.nextInt();
        sc.nextLine();
        System.out.print("Tiene segunda parte?:");
        String segunda = sc.nextLine();

        Pelicula anyadir;
        if (segunda.equalsIgnoreCase("SI")) {
            anyadir = new Pelicula(id, titulo, genero, duracion, true);
        } else {
            anyadir = new Pelicula(id, titulo, genero, duracion, false);
        }

        if (cataleg.addPeli(anyadir)) {
            System.out.println("Pelicula añadida correctamente");
        } else {
            System.out.println("Pelicula no se ha podido añadir posiblemente por id repetido ");
        }
    }

    private void buscarPeliId(PeliculaDAOBD cataleg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon id de peli a borrar? ");
        int idPel = sc.nextInt();

        Pelicula fakeSearch = new Pelicula(idPel, "Delete", "TERROR", 100, true);
        try {
            Pelicula find = cataleg.findPeli(fakeSearch);
            if (find != null) {
                System.out.println("Peli encontrada: " + find);
            } else {
                System.out.println("Peli con id " + idPel + " no existe.. ");
            }
        } catch (InvalidIdPeliculaException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void buscarPeliNombre(PeliculaDAO cataleg) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private void borrarPeli(PeliculaDAOBD cataleg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon id de peli a borrar? ");
        int idPel = sc.nextInt();

        Pelicula fakeDelete = new Pelicula(idPel, "Delete", "TERROR", 0, true);

        if (cataleg.borrarPelicula(fakeDelete)) {
            System.out.println("Has borrado la peli " + fakeDelete.getCodiPel());
        } else {
            System.out.println("No has borrado la peli con id " + fakeDelete.getCodiPel());
        }
    }

    private void llistarPelicules(PeliculaDAOBD cataleg) {
        List<Pelicula> all = cataleg.allPelis();
        for (Pelicula peli : all) {
            System.out.println(peli);
        }
        System.out.println("Pelis listadas: " + all.size());
    }

    private void borrarPeliNombre(PeliculaDAOBD cataleg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon titulo peli a borrar? ");
        String tituloDelete = sc.nextLine();

        int borradas = cataleg.borrarPeliculasNombre(tituloDelete);
        if (borradas == 0) {
            System.out.println("No se han borrado pelis con titulo " + tituloDelete);
        } else {
            System.out.println("Peliculas borradas: " + borradas);
        }
    }

    private void filtrarGenere(PeliculaDAOBD cataleg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que tipo de genero quieres ver");
        String generoSearch = sc.nextLine();

        List<Pelicula> selec = cataleg.findPelisGenero(generoSearch);

        if (selec.size() > 0) {
            for (Pelicula peli : selec) {
                System.out.println(peli);
            }

            System.out.println("Peliculas mostradas: " + selec.size());
        } else {
            System.out.println("No hay pelis del tipo " + generoSearch);
        }
    }

    private void buscarPeliSegundaParte(PeliculaDAOBD cataleg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quieres pelis con segunda parte(Si/No)");
        String yesNo = sc.nextLine();
        boolean segunda;

        if (yesNo.equalsIgnoreCase("Si")) {
            segunda = true;
        } else {
            segunda = false;
        }

        List<Pelicula> all = cataleg.AllPelisSecondPart(segunda);
        for (Pelicula peli : all) {
            System.out.println(peli);
        }
        System.out.println("Pelis listadas: " + all.size());
    }

    private void anyadirItemsMenu(Menu menuConsola) {
        menuConsola.afegirOpcio("Afegir Pel·lícula");
        menuConsola.afegirOpcio("Buscar pel·lícula per id");
        menuConsola.afegirOpcio("Buscar pel·lícula con segundas parte");
        menuConsola.afegirOpcio("Borrar pel·lícula");
        menuConsola.afegirOpcio("Llistar pel·lícules");
        menuConsola.afegirOpcio("Borrar pel·lícula por nombre");
        menuConsola.afegirOpcio("Filtrar por Genero");
        menuConsola.afegirOpcio("Afegir Pel·lícula");
        menuConsola.afegirOpcio("Llistar pel·lícules ordenades");
        menuConsola.afegirOpcio("Actualizar nombre pelicula por id");
    }

    private void llistarPeliculesOrdenades(PeliculaDAOBD cataleg) {
        List<Pelicula> all = cataleg.allPelis();
        Menu menuOrdenacion = new Menu("Eleccion orden");
        anyadirOpcionesMenu(menuOrdenacion);

        menuOrdenacion.mostrarMenu();
        int opcion = menuOrdenacion.llegirOpcioValida();

        switch (opcion) {
            case 1:
                Collections.sort(all, Comparator.comparing(Pelicula::getCodiPel));
                break;
            case 2:
                Collections.sort(all, Comparator.comparing(Pelicula::getTitol));
                break;
            case 3:
                Collections.sort(all, Comparator.comparing(Pelicula::getGenere));
                break;
            case 4:
                Collections.sort(all, Comparator.comparing(Pelicula::getSegundaParte));
                break;
        }

        for (Pelicula peli : all) {
            System.out.println(peli);
        }
        System.out.println("Pelis listadas: " + all.size());
    }

    private void anyadirOpcionesMenu(Menu menuOrdenacion) {
        menuOrdenacion.afegirOpcio("Codi Pelicula");
        menuOrdenacion.afegirOpcio("Titulo");
        menuOrdenacion.afegirOpcio("Genero");
        menuOrdenacion.afegirOpcio("Segundas partes");
    }

    private void actualizarNombrePelicula(PeliculaDAOBD cataleg) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Escribe el ID de la peli:");
            int idPel = sc.nextInt();
            sc.nextLine();

            System.out.println("Escribe el nuevo titulo:");
            String nouTitol = sc.nextLine();

            Pelicula peli = new Pelicula(idPel, nouTitol, "", 0, false);

            if (cataleg.actualizarNombrePelicula(peli)) {
                System.out.println("Se ha podido actualizar el titulo");
            } else {
                System.out.println("No se ha podido actualizar el titulo");
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: has d'introduir un número válido.");
            sc.nextLine();
        }
    }
}