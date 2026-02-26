/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package peliculas;

import Objetos.Pelicula;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author rasu2
 */
public class Peliculas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
         ArrayList<Pelicula> cataleg = new ArrayList<>();

        // 3 pel·lícules inicials
        cataleg.add(new Pelicula(1, "Interstellar", 2014, "Ciència-Ficció"));
        cataleg.add(new Pelicula(2, "1917", 2019, "Bèl·lica"));
        cataleg.add(new Pelicula(3, "Expediente Warren", 2013, "Terror"));

        int opcio;

        do {
            mostrarMenu();
            opcio = llegirOpcio();

            switch (opcio) {
                case 1:
                    afegir(cataleg);
                    break;
                case 2:
                    buscarPerId(cataleg);
                    break;
                case 3:
                    buscarPerNom(cataleg);
                    break;
                case 4:
                    borrar(cataleg);
                    break;
                case 5:
                    llistar(cataleg);
                    break;
                case 0:
                    System.out.println("Sortint...");
                    break;
            }

        } while (opcio != 0);
    }

    public static void mostrarMenu() {
        System.out.println("\n1.- Afegir Pelicula");
        System.out.println("2.- Buscar pel·lícula per id");
        System.out.println("3.- Buscar pel·lícula per nom");
        System.out.println("4.- Borrar pel·lícula");
        System.out.println("5.- Llistar pel·lícula");
        System.out.println("0.- Sortir");
        System.out.print("Opció: ");
    }

    public static int llegirOpcio() {
        Scanner sc = new Scanner(System.in);
        int opcio;
        while (true) {
            try {
                opcio = Integer.parseInt(sc.nextLine());
                if (opcio >= 0 && opcio <= 5) {
                    return opcio;
                } else {
                    System.out.print("Opció incorrecta (0-5): ");
                }
            } catch (Exception e) {
                System.out.print("Error. Introdueix un número: ");
            }
        }
    }

    public static void afegir(ArrayList<Pelicula> cataleg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ID: ");
        int id = Integer.parseInt(sc.nextLine());

        System.out.print("Títol: ");
        String titol = sc.nextLine();

        System.out.print("Any: ");
        int any = Integer.parseInt(sc.nextLine());

        System.out.print("Gènere (Ciència-Ficció, Bèl·lica o Terror): ");
        String genere = sc.nextLine();

        Pelicula p = new Pelicula(id, titol, any, genere);
        cataleg.add(p);

        System.out.println("Pel·lícula afegida correctament.");
    }

    public static void buscarPerId(ArrayList<Pelicula> cataleg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix ID: ");
        int id = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < cataleg.size(); i++) {
            if (cataleg.get(i).getId() == id) {
                System.out.println(cataleg.get(i));
                System.out.println("Posició al catàleg: " + i);
                return;
            }
        }

        System.out.println("No trobada.");
    }

    public static void buscarPerNom(ArrayList<Pelicula> cataleg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix nom: ");
        String nom = sc.nextLine();

        for (int i = 0; i < cataleg.size(); i++) {
            if (cataleg.get(i).getTitol().equalsIgnoreCase(nom)) {
                System.out.println(cataleg.get(i));
                System.out.println("Posició al catàleg: " + i);
                return;
            }
        }

        System.out.println("No trobada.");
    }

    public static void borrar(ArrayList<Pelicula> cataleg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.- Borrar per ID");
        System.out.println("2.- Borrar per Nom");
        System.out.print("Opció: ");
        int op = Integer.parseInt(sc.nextLine());

        if (op == 1) {
            System.out.print("ID: ");
            int id = Integer.parseInt(sc.nextLine());

            for (int i = 0; i < cataleg.size(); i++) {
                if (cataleg.get(i).getId() == id) {
                    System.out.println("Pel·lícula borrada: " + cataleg.get(i).getTitol());
                    cataleg.remove(i);
                    return;
                }
            }

        } else if (op == 2) {
            System.out.print("Nom: ");
            String nom = sc.nextLine();

            for (int i = 0; i < cataleg.size(); i++) {
                if (cataleg.get(i).getTitol().equalsIgnoreCase(nom)) {
                    System.out.println("Pel·lícula borrada: " + cataleg.get(i).getTitol());
                    cataleg.remove(i);
                    return;
                }
            }
        }

        System.out.println("No s'ha pogut borrar la pel·lícula.");
    }

    public static void llistar(ArrayList<Pelicula> cataleg) {

        for (Pelicula p : cataleg) {
            System.out.println(p);
        }

        System.out.println("Nombre pel·lícules a ProvenFilm: " + cataleg.size());
    }
}
