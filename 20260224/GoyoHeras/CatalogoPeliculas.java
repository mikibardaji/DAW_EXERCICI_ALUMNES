package Pelicula;

import objetos.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

public class CatalogoPeliculas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pelicula> cataleg = new ArrayList<>();
        int nextId = 4;

        cataleg.add(new Pelicula(1, "Interstellar", "Christopher Nolan", 2014, "Ciència-Ficció"));
        cataleg.add(new Pelicula(2, "1917", "Sam Mendes", 2019, "Bèl·lica"));
        cataleg.add(new Pelicula(3, "Expediente Warren", "James Wan", 2013, "Terror"));

        System.out.println("Catàleg inicialitzat amb 3 pel·lícules.");

        int opcio;

        do {
            mostrarMenu();
            opcio = llegirOpcio(sc);

            switch (opcio) {
                case 1:
                    afegir(cataleg, nextId);
                    nextId++;
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
        
        sc.close();
    }

    public static void mostrarMenu() {
        System.out.println("\n=== CATÀLEG PEL·LÍCULES ===");
        System.out.println("1.- Afegir Pel·lícula");
        System.out.println("2.- Buscar pel·lícula per id");
        System.out.println("3.- Buscar pel·lícula per nom");
        System.out.println("4.- Borrar pel·lícula");
        System.out.println("5.- Llistar pel·lícules");
        System.out.println("0.- Sortir");
        System.out.print("Opció: ");
    }

    public static int llegirOpcio(Scanner sc) {
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

    public static void afegir(ArrayList<Pelicula> cataleg, int id) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n--- AFEGIR PEL·LÍCULA ---");
        
        System.out.print("Títol: ");
        String titol = sc.nextLine();

        System.out.print("Director: ");
        String director = sc.nextLine();

        System.out.print("Any: ");
        int any;
        while (true) {
            try {
                any = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.print("Error. Introdueix un any vàlid: ");
            }
        }

        System.out.print("Gènere (Ciència-Ficció, Bèl·lica o Terror): ");
        String genere = sc.nextLine();

        Pelicula p = new Pelicula(id, titol, director, any, genere);
        cataleg.add(p);

        System.out.println("Pel·lícula \"" + titol + "\" afegida correctament amb ID: " + id);
    }

    public static void buscarPerId(ArrayList<Pelicula> cataleg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n--- BUSCAR PER ID ---");
        System.out.print("Introdueix ID: ");
        
        int id;
        try {
            id = Integer.parseInt(sc.nextLine());
        } catch (Exception e) {
            System.out.println("ID no vàlid.");
            return;
        }

        for (int i = 0; i < cataleg.size(); i++) {
            if (cataleg.get(i).getId() == id) {
                System.out.println("Pel·lícula trobada a la posició " + i + ":");
                System.out.println(cataleg.get(i));
                return;
            }
        }

        System.out.println("No s'ha trobat cap pel·lícula amb ID: " + id);
    }

    public static void buscarPerNom(ArrayList<Pelicula> cataleg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n--- BUSCAR PER NOM ---");
        System.out.print("Introdueix nom: ");
        String nom = sc.nextLine();

        for (int i = 0; i < cataleg.size(); i++) {
            if (cataleg.get(i).getTitol().equalsIgnoreCase(nom)) {
                System.out.println("Pel·lícula trobada a la posició " + i + ":");
                System.out.println(cataleg.get(i));
                return;
            }
        }

        System.out.println("No s'ha trobat cap pel·lícula amb títol: " + nom);
    }

    public static void borrar(ArrayList<Pelicula> cataleg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n--- BORRAR PEL·LÍCULA ---");
        System.out.println("1.- Borrar per ID");
        System.out.println("2.- Borrar per Títol");
        System.out.print("Opció: ");
        
        int op;
        try {
            op = Integer.parseInt(sc.nextLine());
        } catch (Exception e) {
            System.out.println("Opció no vàlida.");
            return;
        }

        if (op == 1) {
            System.out.print("ID: ");
            int id;
            try {
                id = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("ID no vàlid.");
                return;
            }

            for (int i = 0; i < cataleg.size(); i++) {
                if (cataleg.get(i).getId() == id) {
                    System.out.println("Pel·lícula borrada: " + cataleg.get(i).getTitol());
                    cataleg.remove(i);
                    return;
                }
            }
            System.out.println("No s'ha trobat cap pel·lícula amb ID: " + id);

        } else if (op == 2) {
            System.out.print("Títol: ");
            String nom = sc.nextLine();

            for (int i = 0; i < cataleg.size(); i++) {
                if (cataleg.get(i).getTitol().equalsIgnoreCase(nom)) {
                    System.out.println("Pel·lícula borrada: " + cataleg.get(i).getTitol());
                    cataleg.remove(i);
                    return;
                }
            }
            System.out.println("No s'ha trobat cap pel·lícula amb títol: " + nom);

        } else {
            System.out.println("Opció no vàlida.");
        }
    }

    public static void llistar(ArrayList<Pelicula> cataleg) {
        System.out.println("\n--- LLISTAT DE PEL·LÍCULES ---");
        
        if (cataleg.isEmpty()) {
            System.out.println("El catàleg està buit.");
            return;
        }

        for (Pelicula p : cataleg) {
            System.out.println(p);
        } 

        System.out.println("\nNombre pel·lícules a ProvenFilm: " + cataleg.size());
    }

}
