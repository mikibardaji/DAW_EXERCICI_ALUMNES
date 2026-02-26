/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package catalegpelis;

import Objetos.Pelicula;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class CatalegPelis {

 public static void main(String[] args) {

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
                    System.out.println("Has seleccionat: Afegir Pel�cula");
                    // TODO: Implementar afegir pel�l�cula
                    afegirPeli(cataleg);
                    break;

                case 2:
                    System.out.println("Has seleccionat: Buscar pel�l�cula per ID");
                    // TODO: Implementar cerca per ID
                    break;

                case 3:
                    System.out.println("Has seleccionat: Buscar pel�l�cula per nom");
                    // TODO: Implementar cerca per nom
                    break;

                case 4:
                    System.out.println("Has seleccionat: Borrar pel�l�cula");
                    // TODO: Implementar esborrar pel�l�cula
                    break;

                case 5:
                    System.out.println("Has seleccionat: Llistar pel�l�cules");
                    llistarPelicules(cataleg);
                    break;

                case 0:
                    System.out.println("Sortint del programa...");
                    break;

                default:
                    // No hauria d'entrar aqu� perqu� validem abans
                    System.out.println("Opci� no v�lida.");
            }

            System.out.println();

        } while (opcio != 0);

    }

    public static void mostrarMenu() {
        System.out.println("===== MEN� GESTI� PEL�L�CULES =====");
        System.out.println("1.- Afegir Pel�l�cula");
        System.out.println("2.- Buscar pel�l�cula per id");
        System.out.println("3.- Buscar pel�l�cula per nom");
        System.out.println("4.- Borrar pel�l�cula");
        System.out.println("5.- Llistar pel�l�cules");
        System.out.println("0.- Sortir");
        System.out.print("Escull una opci�: ");
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
                    System.out.print("Opci� no v�lida. Introdueix un n�mero entre 0 i 5: ");
                    //no toco valida
                }

            } catch (NumberFormatException e) {
                System.out.print("Error! Introdueix un n�mero v�lid: ");
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
        System.out.println("Pelicula a�adida" + anyadir);
    }

    private static void buscarPorId(List<Pelicula> cataleg, int id) {
    boolean encontrado = false;

    for (int i = 0; i < cataleg.size(); i++) {
        Pelicula p = cataleg.get(i);

        if (p.getCodiPel() == id) {
            System.out.println("Pelicula encontrada en la posicion: " + i);
            System.out.println(p);
            encontrado = true;
        }
    }

    if (encontrado == false) {
        System.out.println("No existe ninguna pelicula con ese id");
    }
}

private static void buscarPorNombre(List<Pelicula> cataleg, String nombre) {
    boolean encontrado = false;

    for (int i = 0; i < cataleg.size(); i++) {
        Pelicula p = cataleg.get(i);

        if (p.getTitol().equalsIgnoreCase(nombre)) {
            System.out.println("Pelicula encontrada en la posicion: " + i);
            System.out.println(p);
            encontrado = true;
        }
    }

    if (encontrado == false) {
        System.out.println("No se ha encontrado la pelicula");
    }
}
    
    
}
