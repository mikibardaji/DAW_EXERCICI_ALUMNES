
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Objetos.ypeli;

public class MenuPeliculas {

    private static Scanner sc = new Scanner(System.in);
    private static List<ypeli> catalog = new ArrayList<>();

    public static void main(String[] args) {

        catalog.add(new ypeli(1, "Inception", "Ciència-Ficció", 2010));
        catalog.add(new ypeli(2, "Dunkerque", "Bèl·lica", 2017));
        catalog.add(new ypeli(3, "El Conjuro", "Terror", 2013));

        int opcion;

        do {
            mostrarMenu();
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    afegirPelicula();
                    break;
                case 2:
                    buscarPerId();
                    break;
                case 3:
                    buscarPerNom();
                    break;
                case 4:
                    borrarPelicula();
                    break;
                case 5:
                    llistarPellicules();
                    break;
                case 0:
                    System.out.println("Sortint del programa...");
                    break;
                default:
                    System.out.println("Opció no vàlida!");
            }

            System.out.println();

        } while (opcion != 0);

        sc.close();
    }

    private static void mostrarMenu() {
        System.out.println("===== MENÚ PEL·LÍCULES =====");
        System.out.println("1.- Afegir Pel·lícula");
        System.out.println("2.- Buscar pel·lícula per id");
        System.out.println("3.- Buscar pel·lícula per nom");
        System.out.println("4.- Borrar pel·lícula");
        System.out.println("5.- Llistar pel·lícules");
        System.out.println("0.- Sortir");
        System.out.print("Tria una opció: ");
    }

    private static void afegirPelicula() {
        System.out.print("Introdueix id: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (ypeli p : catalog) {
            if (p.getId() == id) {
                System.out.println("Id ja existeix!");
                return;
            }
        }

        System.out.print("Introdueix nom: ");
        String nom = sc.nextLine();

        System.out.print("Introdueix género: ");
        String genero = sc.nextLine();

        System.out.print("Introdueix any: ");
        int any = sc.nextInt();

        catalog.add(new ypeli(id, nom, genero, any));
        System.out.println("Pel·lícula afegida correctament!");
    }

    private static void buscarPerId() {
        System.out.print("Introdueix id: ");
        int buscarId = sc.nextInt();

        for (ypeli p : catalog) {
            if (p.getId() == buscarId) {
                System.out.println(p);
                return;
            }
        }

        System.out.println("Pel·lícula no trobada.");
    }

    private static void buscarPerNom() {
        sc.nextLine();
        System.out.print("Introdueix nom: ");
        String buscarNom = sc.nextLine();

        for (ypeli p : catalog) {
            if (p.getNom().equalsIgnoreCase(buscarNom)) {
                System.out.println(p);
                return;
            }
        }

        System.out.println("Pel·lícula no trobada.");
    }

    private static void borrarPelicula() {
        System.out.print("Introdueix id: ");
        int borrarId = sc.nextInt();

        boolean eliminat = catalog.removeIf(p -> p.getId() == borrarId);

        if (eliminat) {
            System.out.println("Pel·lícula borrada correctament.");
        } else {
            System.out.println("Pel·lícula no trobada.");
        }
    }

    private static void llistarPellicules() {
        System.out.println("Nombre de pel·lícules: " + catalog.size());
        for (ypeli p : catalog) {
            System.out.println(p);
        }
    }
}
