package re;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class CatalegPelicules {
    static List<Pelicula> cataleg = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Iniciem amb 3 pel·lícules per defecte
        cataleg.add(new Pelicula(1, "Inception", 2010, "Ciència-Ficció"));
        cataleg.add(new Pelicula(2, "1917", 2019, "Bèl·lica"));
        cataleg.add(new Pelicula(3, "Scream", 1996, "Terror"));

        int opcio = -1;

        do {
            mostrarMenu();
            try {
                System.out.print("\nSelecciona una opció: ");
                opcio = sc.nextInt();
                sc.nextLine(); // Netejar buffer

                if (opcio < 0 || opcio > 5) {
                    System.out.println("❌ Error: Opció no vàlida.");
                } else {
                    executarOpcio(opcio);
                }
            } catch (InputMismatchException e) {
                System.out.println("❌ Error: Has d'introduir un número.");
                sc.next();
            }
        } while (opcio != 0);
    }

    private static void mostrarMenu() {
        System.out.println("\n--- PROVENFILM ---");
        System.out.println("1.- Afegir Pel·lícula");
        System.out.println("2.- Buscar pel·lícula per ID");
        System.out.println("3.- Buscar pel·lícula per nom");
        System.out.println("4.- Borrar pel·lícula (per ID)");
        System.out.println("5.- Llistar pel·lícules");
        System.out.println("0.- Sortir");
    }

    private static void executarOpcio(int opcio) {
        switch (opcio) {
            case 1: afegirPelicula(); break;
            case 2: buscarPerId(); break;
            case 3: buscarPerNom(); break;
            case 4: borrarPelicula(); break;
            case 5: llistarPelicules(); break;
            case 0: System.out.println("Sortint..."); break;
        }
    }

    public static void afegirPelicula() {
        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nom: ");
        String nom = sc.nextLine();
        System.out.print("Any: ");
        int ano = sc.nextInt();
        sc.nextLine();
        System.out.print("Gènere (Ciència-Ficció, Bèl·lica, Terror): ");
        String gen = sc.nextLine();

        cataleg.add(new Pelicula(id, nom, ano, gen));
        System.out.println("Pel·lícula afegida.");
    }

    public static void buscarPerId() {
        System.out.print("Introdueix l'ID a buscar: ");
        int id = sc.nextInt();
        boolean trobat = false;
        for (int i = 0; i < cataleg.size(); i++) {
            if (cataleg.get(i).getID() == id) {
                System.out.println("Trobada a la posició: " + i);
                System.out.println(cataleg.get(i));
                trobat = true;
                break;
            }
        }
        if (!trobat) System.out.println("No s'ha trobat cap pel·lícula amb aquest ID.");
    }

    public static void buscarPerNom() {
        System.out.print("Introdueix el nom a buscar: ");
        String nom = sc.nextLine();
        boolean trobat = false;
        for (int i = 0; i < cataleg.size(); i++) {
            if (cataleg.get(i).getNom().equalsIgnoreCase(nom)) {
                System.out.println("Trobada a la posició: " + i);
                System.out.println(cataleg.get(i));
                trobat = true;
                break;
            }
        }
        if (!trobat) System.out.println("No s'ha trobat cap pel·lícula amb aquest nom.");
    }

    public static void borrarPelicula() {
        System.out.print("ID de la pel·lícula a esborrar: ");
        int id = sc.nextInt();
        Pelicula pBorrar = null;

        for (Pelicula p : cataleg) {
            if (p.getID() == id) {
                pBorrar = p;
                break;
            }
        }

        if (pBorrar != null) {
            cataleg.remove(pBorrar);
            System.out.println("S'ha borrat la pel·lícula: " + pBorrar.getNom());
        } else {
            System.out.println("No s'ha pogut esborrar (ID no trobat).");
        }
    }

    public static void llistarPelicules() {
        for (Pelicula p : cataleg) {
            System.out.println(p.toString());
        }
        System.out.println("Nombre pel·lícules a ProvenFilm: " + cataleg.size());
    }
}
