/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package catalogopeliculas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Jeremy
 */
public class CatalogoPeliculas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
          List<Pelicula> cataleg;
        int opcio = -1;

        //implementacio real -> ArrayList
        cataleg = new ArrayList<>();
        
        afegirPelis(cataleg);
        
        do {
            mostrarMenu();
            opcio = llegirOpcioValida();

            switch (opcio) {
                case 1:
                    System.out.println("Has seleccionat: Afegir Película");
                    // TODO: Implementar afegir pel·lícula
                    afegirPeli(cataleg);
                    break;

                case 2:
                    System.out.println("Has seleccionat: Buscar pel·lícula per ID");
                    // TODO: Implementar cerca per ID
                    buscarPeliperID(cataleg);
                    
                    
                    break;

                case 3:
                    System.out.println("Has seleccionat: Buscar pel·lícula per nom");
                    // TODO: Implementar cerca per nom
                    
                         buscarPeliperNom(cataleg);
                    break;

                case 4:
                    System.out.println("Has seleccionat: Borrar pel·lícula");
                    // TODO: Implementar esborrar pel·lícula
                    
                    
                    BorrarPeli(cataleg);
                    
                    
                    break;

                case 5:
                    System.out.println("Has seleccionat: Llistar pel·lícules");
                    llistarPelicules(cataleg);
                    break;

                case 0:
                    System.out.println("Sortint del programa...");
                    break;

                default:
                    // No hauria d'entrar aquí perquè validem abans
                    System.out.println("Opció no vàlida.");
            }

            System.out.println();

        } while (opcio != 0);

    }

    public static void mostrarMenu() {
        System.out.println("===== MENÚ GESTIÓ PEL·LÍCULES =====");
        System.out.println("1.- Afegir Pel·lícula");
        System.out.println("2.- Buscar pel·lícula per id");
        System.out.println("3.- Buscar pel·lícula per nom");
        System.out.println("4.- Borrar pel·lícula");
        System.out.println("5.- Llistar pel·lícules");
        System.out.println("0.- Sortir");
        System.out.print("Escull una opció: ");
    }

    public static int llegirOpcioValida() {
        int opcio;
        
        Scanner scanner = new Scanner(System.in);
        boolean valida = false;
        while (!valida) {
            try {
                opcio = scanner.nextInt();

                if (opcio >= 0 && opcio <= 5) {    
                    valida = true;
                    return opcio;
                } else {
                    System.out.print("Opció no vàlida. Introdueix un número entre 0 i 5: ");
                    //no toco valida
                }

            } catch (NumberFormatException e) {
                System.out.print("Error! Introdueix un número vàlid: ");
                valida = false; 
            }
        }
        return -1;
    }

    private static void afegirPelis(List<Pelicula> cataleg) {
        cataleg.add(new Pelicula(1, "Alien", "TERROR", true));
        cataleg.add(new Pelicula(2, "Matrix", "CIENCIA FICCIO", true));
        cataleg.add(new Pelicula(3, "Salvar al Soldado Ryan", "WESTERN", false));
        cataleg.add(new Pelicula(4, "Top Secret", "Comica", false));
    }

    private static void llistarPelicules(List<Pelicula> cataleg) {
        
        for (Pelicula peli : cataleg) {
            System.out.println(peli);
        }
        System.out.println("Numero de pelis: " + cataleg.size());
    }

    private static void afegirPeli(List<Pelicula> cataleg) {
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
        cataleg.add(anyadir);
        System.out.println("Pelicula añadida" + anyadir);
    
    }

    private static void buscarPeliperID(List <Pelicula> cataleg) {
            
            
                Scanner sc = new Scanner (System.in);
                System.out.println("Escribe el id de la pelicula : ");
                int id = sc.nextInt();
                
                Pelicula encontrarpeli = new Pelicula (id,"","",false);
                
                int pos = cataleg.indexOf(encontrarpeli);
                
                
                if (pos != -1){
                
                    System.out.println(cataleg.get(pos));
                }
                else{
                    System.out.println("Peli no encontrada `por ID ");
                }
          
        }

    private static void buscarPeliperNom(List<Pelicula> cataleg) {


     Scanner sc = new Scanner (System.in);
                System.out.println("Escribe el nom de la pelicula : ");
                String  nom = sc.nextLine();
                boolean find = false;
    
                for (Pelicula peli : cataleg) {
                    if (peli.getTitol().equalsIgnoreCase(nom)){
                        System.out.println(peli);
                        find = true;
                        
                    }
        }
                if (!find ){
                    System.out.println("Peli no encontrado por nomnbre");
                }
                
 

    }

    private static void BorrarPeli(List<Pelicula> cataleg) {


          Scanner sc = new Scanner (System.in);
          System.out.println("Escribe el id de la pelicula para borrar: ");
          int idpeli = sc.nextInt();
          
          
          
          Pelicula p = cataleg.remove(idpeli);
          System.out.println("Despues de borrar la peli " + p);
          for (Pelicula pelicula : cataleg) {
              System.out.println(pelicula);
        }
          


    }
    
    
    
    
    
           
}
   
    
    
    
    
    
    
    

