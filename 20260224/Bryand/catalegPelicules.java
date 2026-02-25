import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class catalegPelicules {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcio = -1;
        List<Pelicula> listado = new ArrayList<>();

        Pelicula p1 = new Pelicula(1, "Blade Runner", "Ciència-Ficció", 1982);
        Pelicula p2 = new Pelicula(2, "Full Metal Jacket", "Bèl·lica", 1987);
        Pelicula p3 = new Pelicula(3, "The Shining", "Terror", 1980);   

        listado.add(p1);
        listado.add(p2);
        listado.add(p3);

        do {
            System.out.println("\n--- CATÀLEG DE PEL·LÍCULES ---");
            System.out.println("1.- Afegir Pel·lícula");
            System.out.println("2.- Buscar pel·lícula per id");
            System.out.println("3.- Buscar pel·lícula per nom");
            System.out.println("4.- Borrar pel·lícula (per ID)");
            System.out.println("5.- Llistar pel·lícules");
            System.out.println("0.- Sortir");
            System.out.print("Tria una opció: ");

            // Validació: comprovem si l'entrada és un número
            if (sc.hasNextInt()) {
                opcio = sc.nextInt();
                sc.nextLine(); // Netegem el buffer del salt de línia

                switch (opcio) {
                    case 1:
                        // Espai per a la implementació d'Afegir
                        //El gènere de les pel·lícules sol podran ser “Ciència-Ficció”, “Bèl·lica”  o de “Terror”, 
                        // si en fiques un altre, creara sempre la pel·lícula de terror.
                        System.out.print("ID: ");
                        int id = sc.nextInt(); sc.nextLine();
                        System.out.print("Nom: ");
                        String nom = sc.nextLine();
                        System.out.print("Gènere: ");
                        String gen = sc.nextLine();
                        if (!gen.equals("Ciència-Ficció") && !gen.equals("Bèl·lica") && !gen.equals("Terror")) {
                            gen = "Terror";
                        }
                        System.out.print("Any: ");
                        int any = sc.nextInt(); sc.nextLine();
                        
                        listado.add(new Pelicula(id, nom, gen, any));
                        break;
                    case 2:
                        // Espai per a la implementació de Buscar per ID
                        System.out.print("ID a buscar: ");
                        int idBuscat = sc.nextInt(); sc.nextLine();
                        boolean found = false;
                        for (int i = 0; i < listado.size(); i++) {
                            if (listado.get(i).getId() == idBuscat) {
                                System.out.println("Posició: " + i + " - " + listado.get(i));
                                found = true;
                                break;
                            }
                        }
                        if (!found) System.out.println("No trobada.");
                        break;
                    case 3:
                        // Espai per a la implementació de Buscar per nom
                        System.out.print("Nom a buscar: ");
                        String nomB = sc.nextLine();
                        boolean foundN = false;
                        for (int i = 0; i < listado.size(); i++) {
                            if (listado.get(i).getNom().equalsIgnoreCase(nomB)) {
                                System.out.println("Posició: " + i + " - " + listado.get(i));
                                foundN = true;
                            }
                        }
                        if (!foundN) System.out.println("No trobada.");
                        break;
                    case 4:
                        // Espai per a la implementació de Borrar
                        System.out.print("ID a borrar: ");
                        int idB = sc.nextInt(); sc.nextLine();
                        boolean deleted = false;
                        for (int i = 0; i < listado.size(); i++) {
                            if (listado.get(i).getId() == idB) {
                                System.out.println("S'ha borrat la pel·lícula: " + listado.get(i).getNom());
                                listado.remove(i);
                                deleted = true;
                                break;
                            }
                        }
                        if (!deleted) System.out.println("No s'ha borrat (ID no trobat).");
                        break;
                    case 5:
                        // Espai per a la implementació de Llistar
                        for (Pelicula p : listado) {
                            System.out.println(p);
                        }
                        System.out.println("Nombre pel·lícules a ProvenFilm: " + listado.size());
                        break;
                    case 0:
                        System.out.println("\nSortint del programa... A reveure!");
                        break;
                    default:
                        System.out.println("\nERROR: Opció no vàlida. Intenta-ho de nou (0-5).");
                }
            } else {
                // Si l'usuari no introdueix un número
                System.out.println("\nERROR: Si us plau, introdueix un número enter.");
                sc.next(); // "Consumim" l'entrada errònia per evitar un bucle infinit
            }

        } while (opcio != 0);

        //Les pel·lícules han de tenir els mateixos camps i restriccions que heu definit al mòdul de base de dades, 
        // canviant sol el gènere per un String.
        
        //El gènere de les pel·lícules sol podran ser “Ciència-Ficció”, “Bèl·lica”  o de “Terror”, 
        // si en fiques un altre, creara sempre la pel·lícula de terror.
        
        //Si mostres un llistat, s’ha de mostrar totes les característiques de les pel·lícules en una sola linea
        //  i mostrar quants registres ha mostrat tipus “Nombre pel·lícules a ProvenFilm: 5”

        //Quant borris, en tots els casos hauras de dir si s’ha borrat o no, i mostrar el nom de la pel·lícula borrada.

        //Al buscar-la m’haureu d’ensenyar totes les característiques de la pel·lícula i en quina posició del catàleg està.

        //Per codi, sòl iniciar, afegiu 3 pel·lícules, per no començar amb un catàleg buit.

        //S’ha de programar amb objectes.

        sc.close();
    }
}