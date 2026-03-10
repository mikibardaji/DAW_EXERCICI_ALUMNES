package catalegpelismvc;
import Modelo.Pelicula;
import Modelo.PeliculaDAO;
import utilidades.MenuConsola;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class CatalegPelisMVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CatalegPelisMVC app = new CatalegPelisMVC();
        app.run();
               
    }

    private void run() { //main sense public static 
        PeliculaDAO cataleg;

        MenuConsola menu = new MenuConsola("GESTION DE PELICULAS");

        menu.anyadirOpcion("Salir"); //opcion 0
        menu.anyadirOpcion("Añadir Peli"); //opcioin 1
        menu.anyadirOpcion("Busar peli (ID)"); //opcion2
        menu.anyadirOpcion("Buscar segunda parte");
        menu.anyadirOpcion("Borrar peli");
        menu.anyadirOpcion("Listar pelis");
        menu.anyadirOpcion("Borrar peli (nombre)");
        menu.anyadirOpcion("Filtrar genero");
        
        menu.setOpcionSalida(0); //decimos que el 0 es salie
        
        
        cataleg = new PeliculaDAO(); //inicialitzar ArrayList i afegeix pelis
        int opcio;
        do {
            menu.mostrarMenu();
            opcio = menu.llegirOpcioValida();

            switch (opcio) {
                case 1:
                    System.out.println("Has seleccionat: Afegir Pel�cula");
                    // TODO: Implementar afegir pel�l�cula
                    afegirPeli(cataleg);
                    break;

                case 2:
                    System.out.println("Has seleccionat: Buscar pel�l�cula per ID");
                    buscarPeliId(cataleg);
                    break;

                case 3:
                    System.out.println("Has seleccionat: Buscar pel�l�cula segunda Parte");
                    buscarPeliSegundaParte(cataleg);
                    break;

                case 4:
                    System.out.println("Has seleccionat: Borrar pel�l�cula");
                    borrarPeli(cataleg);
                    break;

                case 5:
                    System.out.println("Has seleccionat: Llistar pel�l�cules");
                    llistarPelicules(cataleg);
                    break;

                case 6:
                    System.out.println("Has seleccionat: Borrar pel�l�cula nombre");
                    borrarPeliNombre(cataleg);
                    break;                    


                case 7:
                    System.out.println("Has seleccionat: Filtrar por genero");
                    filtrarGenere(cataleg);
                    break; 
                case 0:
                    System.out.println("Sortint del programa...");
                    break;

                default:
                    // No hauria d'entrar aqu� perqu� validem abans
                    System.out.println("Opci� no v�lida.");
            }

            System.out.println();

        } while (opcio != menu.getOpcionSalida());        
    }

    private void afegirPeli(PeliculaDAO cataleg) {
        /*Datos entrada*/
        Scanner sc = new Scanner(System.in);
        System.out.print("Pon el id:");
        int id = sc.nextInt();
        sc.nextLine(); //limpiar buffer y return
        System.out.print("Pon el titol:");
        String titulo = sc.nextLine();
        System.out.print("Pon el genere:");
        String genero = sc.nextLine();
        System.out.print("Tiene segunda parte?:");
        String segunda = sc.nextLine();
        Pelicula anyadir;
        if (segunda.equalsIgnoreCase("SI"))
        {
            anyadir = new Pelicula(id, titulo, genero, true);
        }
        else
        {
            anyadir = new Pelicula(id, titulo, genero, false);
        }
        /* segunda interaccion con Modelo (DAO)
                */
        if (cataleg.addPeli(anyadir))
        { /*3 parte recoger y mostrar salida*/
            System.out.println("Pelicula a�adida correctamente");
        }
        else
        {
            System.out.println("Pelicula no se ha podido a�adir");
        }
    }

    private void buscarPeliId(PeliculaDAO cataleg) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void buscarPeliNombre(PeliculaDAO cataleg) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void borrarPeli(PeliculaDAO cataleg) {
        /*1 pedir datos entrada*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon id de peli a borrar? ");
        int idPel = sc.nextInt();//campo del equals
        
        Pelicula fakeDelete = new Pelicula(idPel, "Delete", "TERROR", true);
        /*interaccionar modelo CRUDelete*/
        if (cataleg.borrarPelicula(fakeDelete))
        {
            System.out.println("Has borrado la peli " + fakeDelete.getCodiPel());
        }
        else
        {
            System.out.println("No has borrado la peli con id " + + fakeDelete.getCodiPel());
        }
        /*salida de datos*/
    }

    private void llistarPelicules(PeliculaDAO cataleg) {
        List<Pelicula> all = cataleg.allPelis();
        for (Pelicula peli : all) {
            System.out.println(peli);
        }
        System.out.println("Pelis listadas: " + all.size());
    }

    private void borrarPeliNombre(PeliculaDAO cataleg) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void filtrarGenere(PeliculaDAO cataleg) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void buscarPeliSegundaParte(PeliculaDAO cataleg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quieres pelis con segunda parte(Si/No)");
        String yesNo = sc.nextLine();
        boolean segunda;
        if (yesNo.equalsIgnoreCase("Si"))
        {
            segunda = true;
        }
        else
        {
            segunda = false;
        }
        /* Si volgues directament sol pelis amb segona part
        No faria falta la pregunta
        podria ficar una simple linea uqe fos
        boolean segunda = true;
        */
        List<Pelicula> all = cataleg.AllPelisSecondPart(segunda);
        for (Pelicula peli : all) {
            System.out.println(peli);
        }
        System.out.println("Pelis listadas: " + all.size());
    }
    
}
