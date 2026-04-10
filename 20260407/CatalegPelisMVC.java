package catalegpelismvc;

import Modelo.InvalidIdPeliculaException;
import Modelo.Pelicula;
import Modelo.PeliculaDAODB;
import java.util.Collections;
import java.util.Comparator;
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
            PeliculaDAODB cataleg;
            cataleg = new PeliculaDAODB();
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
                        System.out.println("Has seleccionat: Buscar película per ID");
                        buscarPeliId(cataleg);
                        break;

                    case 4:
                        System.out.println("Has seleccionat: Buscar película segunda Parte");
                        buscarPeliSegundaParte(cataleg);
                        break;

                    case 5:
                        System.out.println("Has seleccionat: Borrar película");
                        borrarPeli(cataleg);
                        break;

                    case 6:
                        System.out.println("Has seleccionat: Llistar películas");
                        llistarPelicules(cataleg);
                        break;

                    case 7:
                        System.out.println("Has seleccionat: Borrar película nombre");
                        borrarPeliNombre(cataleg);
                        break;

                    case 8:
                        System.out.println("Has seleccionat: Filtrar por genero");
                        filtrarGenere(cataleg);
                        break;

                    case 9:
                        System.out.println("Has seleccionat: Llistar películas ordenades");
                        llistarPeliculesOrdenades(cataleg);
                        break;
                        
                    case 10:
                        System.out.println("Has seleccionat: actualitzar nombre pelicula");
                        CambiarNombrePelicula(cataleg);
                        break;
                }

                System.out.println();

            } while (opcio != menuConsola.getOpcioSalida());

            System.out.println("Sortint del programa...");
            
        } catch (ClassNotFoundException e) {
            System.err.println("Error: No se pudo cargar el driver de la base de datos.");
            System.err.println("Asegúrate de tener el conector MySQL en el classpath.");
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Error inesperado: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void anyadirItemsMenu(Menu menuConsola) {
        menuConsola.afegirOpcio("Afegir Película");
        menuConsola.afegirOpcio("Buscar película per id");
        menuConsola.afegirOpcio("Buscar película con segundas parte");
        menuConsola.afegirOpcio("Borrar película");
        menuConsola.afegirOpcio("Llistar películas");
        menuConsola.afegirOpcio("Borrar película por nombre");
        menuConsola.afegirOpcio("Filtrar por Genero");
        menuConsola.afegirOpcio("Llistar películas ordenades");
        menuConsola.afegirOpcio("Canviar Titulo a peli (id)(PreparedStatement)");
    }

    private void afegirPeli(PeliculaDAODB cataleg) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Pon el id: ");
            int id = sc.nextInt();
            sc.nextLine();
            
            System.out.print("Pon el titol: ");
            String titulo = sc.nextLine();
            
            System.out.print("Pon el genere: ");
            String genero = sc.nextLine();
            
            System.out.print("Tiene segunda parte? (SI/NO): ");
            String segunda = sc.nextLine();
            
            System.out.print("Pon la duración (minutos): ");
            int duracion = sc.nextInt();
            sc.nextLine();
            
            Pelicula anyadir;
            if (segunda.equalsIgnoreCase("SI")) {
                anyadir = new Pelicula(id, titulo, genero, true, duracion);
            } else {
                anyadir = new Pelicula(id, titulo, genero, false, duracion);
            }
            
            if (cataleg.addPeli(anyadir)) {
                System.out.println("Película añadida correctamente");
            } else {
                System.out.println("Película no se ha podido añadir. Posiblemente por id repetido.");
            }
            
        } catch (Exception e) {
            System.out.println("Error al introducir datos: " + e.getMessage());
            sc.nextLine();
        }
    }

    private void buscarPeliId(PeliculaDAODB cataleg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pon id de peli a buscar: ");
        int idPel = sc.nextInt();
        
        Pelicula fakeSearch = new Pelicula(idPel, "Delete", "TERROR", true, 120);
        try {
            Pelicula find = cataleg.findPeli(fakeSearch);
            if (find != null) {
                System.out.println("Peli encontrada: " + find);
            } else {
                System.out.println("Peli con id " + idPel + " no existe.");
            }
        } catch (InvalidIdPeliculaException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void buscarPeliSegundaParte(PeliculaDAODB cataleg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quieres pelis con segunda parte (SI/NO): ");
        String yesNo = sc.nextLine();
        boolean segunda = yesNo.equalsIgnoreCase("SI");
        
        List<Pelicula> all = cataleg.AllPelisSecondPart(segunda);
        if (all.isEmpty()) {
            System.out.println("No hay películas con segunda parte = " + segunda);
        } else {
            for (Pelicula peli : all) {
                System.out.println(peli);
            }
            System.out.println("Pelis listadas: " + all.size());
        }
    }

    private void borrarPeli(PeliculaDAODB cataleg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pon id de peli a borrar: ");
        int idPel = sc.nextInt();
        
        Pelicula fakeDelete = new Pelicula(idPel, "Delete", "TERROR", true, 125);
        if (cataleg.borrarPelicula(fakeDelete)) {
            System.out.println("Has borrado la peli con id " + fakeDelete.getCodiPel());
        } else {
            System.out.println("No has borrado la peli con id " + fakeDelete.getCodiPel());
        }
    }

    private void llistarPelicules(PeliculaDAODB cataleg) {
        List<Pelicula> all = cataleg.allPelis();
        if (all.isEmpty()) {
            System.out.println("No hay películas en el catálogo");
        } else {
            for (Pelicula peli : all) {
                System.out.println(peli);
            }
            System.out.println("Pelis listadas: " + all.size());
        }
    }

    private void borrarPeliNombre(PeliculaDAODB cataleg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pon titulo de peli a borrar: ");
        String tituloDelete = sc.nextLine();
        
        int borradas = cataleg.borrarPeliculasNombre(tituloDelete);
        if (borradas == 0) {
            System.out.println("No se han borrado pelis con título " + tituloDelete);
        } else {
            System.out.println("Películas borradas: " + borradas);
        }
    }

    private void filtrarGenere(PeliculaDAODB cataleg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qué tipo de género quieres ver: ");
        String generoSearch = sc.nextLine();
        
        List<Pelicula> selec = cataleg.findPelisGenero(generoSearch);
        
        if (selec.isEmpty()) {
            System.out.println("No hay pelis del género " + generoSearch);
        } else {
            for (Pelicula peli : selec) {
                System.out.println(peli);
            }
            System.out.println("Películas mostradas: " + selec.size());
        }
    }

    private void llistarPeliculesOrdenades(PeliculaDAODB cataleg) {
        List<Pelicula> all = cataleg.allPelis();
        
        if (all.isEmpty()) {
            System.out.println("No hay películas para ordenar");
            return;
        }
        
        Menu menuOrdenacion = new Menu("Eleccion orden");
        anyadirOpcionesMenu(menuOrdenacion);
        
        menuOrdenacion.mostrarMenu();
        int opcion = menuOrdenacion.llegirOpcioValida();
        
        switch (opcion) {
            case 1:
                Collections.sort(all, Comparator.comparing(Pelicula::getCodiPel));
                System.out.println("=== PELÍCULAS ORDENADAS POR CÓDIGO ===");
                break;
            case 2:
                Collections.sort(all, Comparator.comparing(Pelicula::getTitol));
                System.out.println("=== PELÍCULAS ORDENADAS POR TÍTULO ===");
                break;
            case 3:
                Collections.sort(all, Comparator.comparing(Pelicula::getGenere));
                System.out.println("=== PELÍCULAS ORDENADAS POR GÉNERO ===");
                break;
            case 4:
                Collections.sort(all, Comparator.comparing(Pelicula::getSegundaParte));
                System.out.println("=== PELÍCULAS ORDENADAS POR SEGUNDA PARTE ===");
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

    // ========== NUEVO MÉTODO PARA ACTUALIZAR TÍTULO ==========
    private void CambiarNombrePelicula(PeliculaDAODB cataleg) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introdueix el id de la pel·lícula a modificar: ");
        int id = sc.nextInt();
        sc.nextLine();
        
        // Comprobar si existe (opcional pero recomendado)
        Pelicula fakeSearch = new Pelicula(id, "", "", false, 0);
        try {
            Pelicula existeix = cataleg.findPeli(fakeSearch);
            if (existeix == null) {
                System.out.println("No existeix cap pel·lícula amb id " + id);
                return;
            }
        } catch (InvalidIdPeliculaException e) {
            System.out.println(e.getMessage());
            return;
        }
        
        System.out.print("Nou títol: ");
        String nouTitol = sc.nextLine();
        
        boolean actualitzat = cataleg.updateTitolPelicula(id, nouTitol);
        if (actualitzat) {
            System.out.println("✓ Títol actualitzat correctament per a la pel·lícula amb id " + id);
        } else {
            System.out.println("✗ No s'ha pogut actualitzar (potser l'id no existeix)");
        }
    }
}