
package CatalegPelisMVC;

import Model.InvalidIdPeliculaException;
import Model.Pelicula;
import Model.PeliculaDAO;
import Model.PeliculaDAODB;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import Utilitats.Menu;


public class CatalegPelisMVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CatalegPelisMVC app = new CatalegPelisMVC();
        app.run();
               
    }

    private void run() { //main sense public static
        
       try {
    PeliculaDAODB cataleg;
    
    cataleg = new PeliculaDAODB();  // faltaban los paréntesis
    Menu menuConsola = new Menu("Catalogo de pelis", true);
    anyadirItemsMenu(menuConsola);
    int opcio;
    do {
        menuConsola.mostrarMenu();
        opcio = menuConsola.llegirOpcioValida();
        switch (opcio) {
            
            case 2:
                System.out.println("Has seleccionat: Afegir Pel·cula");
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
                System.out.println("Has seleccionat: Canviar titulo a peli (id )");
               CanviarNombrePeli(cataleg);
                break;
        }

        System.out.println();

    } while (opcio != menuConsola.getOpcioSalida());

    System.out.println("Sortint del programa...");

} catch (ClassNotFoundException e) {
    System.out.println("Error: No se encontró el driver de MySQL.");
    e.printStackTrace();
} catch (Exception e) {
    System.out.println("Error inesperat: " + e.getMessage());
    e.printStackTrace();
}
    }
    private void afegirPeli(PeliculaDAODB cataleg) {
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
         System.out.print("Pon la duración (en minutos): ");
        int duracion = sc.nextInt();
         sc.nextLine(); // limpia
        Pelicula anyadir;
        if (segunda.equalsIgnoreCase("SI"))
        {
            anyadir = new Pelicula(id, titulo, genero, true, duracion);
        }
        else
        {
          anyadir = new Pelicula(id, titulo, genero, true, duracion);
        }
        /* segunda interaccion con Modelo (DAO)
                */
        if (cataleg.addPeli(anyadir))
        { /*3 parte recoger y mostrar salida*/
            System.out.println("Pelicula a�adida correctamente");
        }
        else
        {
            System.out.println("Pelicula no se ha podido a�adir"
           + " posiblemente por id repetido ");
        }
    }

    private void buscarPeliId(PeliculaDAODB cataleg) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Pon id de peli a buscar: ");
    int idPel = sc.nextInt(); //campo del equals

   
    Pelicula fakeSearch = new Pelicula(idPel, "Delete", "TERROR", true, 0);

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

    }

    private void borrarPeli(PeliculaDAODB cataleg) {
    // 1) pedir datos entrada
    Scanner sc = new Scanner(System.in);
    System.out.println("Pon id de peli a borrar? ");
    int idPel = sc.nextInt(); // campo del equals

 
    Pelicula fakeDelete = new Pelicula(idPel, "Delete", "TERROR", true, 0);

    // interaccionar modelo CRUDDelete
    if (cataleg.borrarPelicula(fakeDelete)) {
        System.out.println("Has borrado la peli " + fakeDelete.getCodiPel());
    } else {
        System.out.println("No has borrado la peli con id " + fakeDelete.getCodiPel());
    }
}

    private void llistarPelicules(PeliculaDAODB cataleg) {
        List<Pelicula> all = cataleg.allPelis();
        for (Pelicula peli : all) {
            System.out.println(peli);
        }
        System.out.println("Pelis listadas: " + all.size());
    }

    private void borrarPeliNombre(PeliculaDAODB cataleg) {
        /*pedir datos entrada*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon titulo peli a borrar? ");
        String tituloDelete = sc.nextLine();//campo del equals
        //modelo. cruDelete
        int borradas = cataleg.borrarPeliculasNombre(tituloDelete);
        if (borradas==0)
        {
            System.out.println("No se han borrado pelis con titulo " 
                    + tituloDelete);
        }
        else
        {
            System.out.println("Peliculas borradas: "
            + borradas);
        }
        //salidaDatos 
        
    }

    private void CanviarNombrePeli (PeliculaDAODB cataleg) {
        Scanner sc = new Scanner(System.in);        
        System.out.println("Escribe el ID de la peli : ");
        int idpel = sc.nextInt();
        sc.nextLine();
        System.out.println("Escribe el nuevo titulo : ");
        String nouTitol = sc.nextLine();

        Pelicula peli = new Pelicula(idpel, nouTitol, "",false, 0);
        
         if (cataleg.CambiarNombrePelicula(peli)){
                    System.out.println("Se ha podido actualizar el titulo ");

        }
        else {
             System.out.println("No se ha podido actualizar titulo ");
                        
             }
            
    }


    private void filtrarGenere(PeliculaDAODB cataleg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que tipo de genero quieres ver");
        String generoSearch = sc.nextLine();
       
        //Podria hacerlo pero al ser un campo que no 
        //esta en el equals no obtengo ninguna ventaja
        //Pelicula fakeGenero = new Pelicula(1000, "generoSearch", generoSearch, true);
        List<Pelicula> selec = cataleg.findPelisGenero(generoSearch);
        
        if(selec.size()>0)
        {
            for (Pelicula peli : selec) {
            System.out.println(peli);
            }
        
            System.out.println("Peliculas mostradas: " + selec.size());
        }
        else
        {
            System.out.println("No hay pelis del tipo " 
                    + generoSearch );
        }
        
    }

    private void buscarPeliSegundaParte(PeliculaDAODB cataleg) {
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

    private void anyadirItemsMenu(Menu menuConsola) {
        menuConsola.afegirOpcio("Afegir Pelicula");
        menuConsola.afegirOpcio("Buscar Pelicula per id");
        menuConsola.afegirOpcio("Buscar Pelicula con segundas parte");
        menuConsola.afegirOpcio("Borrar Pelicula");
        menuConsola.afegirOpcio("Llistar Pelicula");
        menuConsola.afegirOpcio("Borrar Pelicula por nombre");
        menuConsola.afegirOpcio("Filtrar por Genero");
        menuConsola.afegirOpcio("Afegir Pelicula");
        menuConsola.afegirOpcio("Llistar pelicules ordenades");
        menuConsola.afegirOpcio("Canviar el titulo a peli (id)");
    }

    private void llistarPeliculesOrdenades(PeliculaDAODB cataleg) {
        List<Pelicula> all = cataleg.allPelis();   
        Menu menuOrdenacion = new Menu("Eleccion orden");
        anyadirOpcionesMenu(menuOrdenacion);
        
        menuOrdenacion.mostrarMenu();
        int opcion = menuOrdenacion.llegirOpcioValida();
        switch(opcion)
        {
            case 1:
                Collections.sort(all,Comparator.comparing(Pelicula::getCodiPel));
                break;
            case 2:
                Collections.sort(all,Comparator.comparing(Pelicula::getTitol));
                break;   
            case 3:
                Collections.sort(all,Comparator.comparing(Pelicula::getGenere));
                break;    
            case 4:
                Collections.sort(all,Comparator.comparing(Pelicula::getSegundaParte));
                break;    
        }  
               
        //Collections.sort(all); //el objeto que contiene el List tiene la interface Comparable implementada
        //Collections.sort(all,Comparator.comparing(Pelicula::getGenere));
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
    
}