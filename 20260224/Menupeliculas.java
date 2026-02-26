package Objetos;

import java.util.ArrayList;
import java.util.Scanner;

public class Menupeliculas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Pelicula> catalogo = new ArrayList<>();
        catalogo.add(new Pelicula(1, "Matrix", 1999, "Ciència-Ficció"));
        catalogo.add(new Pelicula(2, "Resacón en Las Vegas", 2009, "Bèl·lica"));
        catalogo.add(new Pelicula(3, "Expediente Warren", 2013, "Terror"));
        catalogo.add(new Pelicula(4, "Interstellar", 2014, "Ciència-Ficció"));
        catalogo.add(new Pelicula(5, "Proyecto X", 2012, "Bèl·lica"));
        catalogo.add(new Pelicula(6, "El Conjuro", 2013, "Terror"));

        int opcion;

        do {
            System.out.println("===== MENÚ PEL·LÍCULES =====");
            System.out.println("1.- Afegir Pel·lícula");
            System.out.println("2.- Buscar pel·lícula per id");
            System.out.println("3.- Buscar pel·lícula per nom");
            System.out.println("4.- Borrar pel·lícula");
            System.out.println("5.- Llistar pel·lícules");
            System.out.println("0.- Sortir");
            System.out.print("Tria una opció: ");

            while (!sc.hasNextInt()) {
                System.out.println("Opció no vàlida! Introdueix un número.");
                sc.next();
            }

            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion < 0 || opcion > 5) {
                System.out.println("Opció no vàlida! Tria entre 0 i 5.");
            } else {

                switch (opcion) {

                    case 1:
                        System.out.print("ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        boolean existe = false;
                        for (Pelicula p : catalogo) {
                            if (p.getId() == id) {
                                existe = true;
                                break;
                            }
                        }

                        if (existe) {
                            System.out.println("Ja existeix una pel·lícula amb aquest ID.");
                        } else {

                            System.out.print("Nom: ");
                            String nom = sc.nextLine();

                            System.out.print("Any: ");
                            int any = sc.nextInt();
                            sc.nextLine();

                            System.out.print("Gènere: ");
                            String genere = sc.nextLine();

                            Pelicula nova = new Pelicula(id, nom, any, genere);
                            catalogo.add(nova);

                            System.out.println("Pel·lícula afegida correctament!");
                        }
                        break;

                    case 2:
                        System.out.print("Introdueix ID: ");
                        int buscarId = sc.nextInt();

                        boolean trobada = false;

                        for (int i = 0; i < catalogo.size(); i++) {
                            if (catalogo.get(i).getId() == buscarId) {
                                System.out.println(catalogo.get(i));
                                System.out.println("Posició: " + i);
                                trobada = true;
                                break; 
                            }
                        }

                        if (!trobada) {
                            System.out.println("Pel·lícula no trobada.");
                        }
                        break;

                    case 3:
                        System.out.print("Introdueix nom: ");
                        String buscarNom = sc.nextLine();

                        boolean trobadaNom = false;

                        for (int i = 0; i < catalogo.size(); i++) {
                            if (catalogo.get(i).getNom().equalsIgnoreCase(buscarNom)) {
                                System.out.println(catalogo.get(i));
                                System.out.println("Posició: " + i);
                                trobadaNom = true;
                                break; 
                            }
                        }

                        if (!trobadaNom) {
                            System.out.println("Pel·lícula no trobada.");
                        }
                        break;

                    case 4:
                        System.out.print("Introdueix ID per borrar: ");
                        int borrarId = sc.nextInt();

                        boolean borrada = false;

                        for (int i = 0; i < catalogo.size(); i++) {
                            if (catalogo.get(i).getId() == borrarId) {
                                System.out.println("S'ha borrat: " + catalogo.get(i).getNom());
                                catalogo.remove(i);
                                borrada = true;
                                break;
                            }
                        }

                        if (!borrada) {
                            System.out.println("No s'ha borrat cap pel·lícula.");
                        }
                        break;

                    case 5:
                        for (Pelicula p : catalogo) {
                            System.out.println(p);
                        }
                        System.out.println("Nombre pel·lícules a ProvenFilm: " + catalogo.size());
                        break;

                    case 0:
                        System.out.println("Sortint del programa...");
                        break;
                }
            }

            System.out.println();

        } while (opcion != 0);

        sc.close();
    }
}
