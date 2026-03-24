import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FestivalRepository repo = new FestivalRepository();

        int opcio;

        do {
            System.out.println("\n--- FEST MANAGER ---");
            System.out.println("1. Registrar entrada");
            System.out.println("2. Buscar entrada");
            System.out.println("3. Llistar assistents");
            System.out.println("4. Cancel·lar entrada");
            System.out.println("5. Calcular edat mitjana");
            System.out.println("6. Actualitzar nom");
            System.out.println("0. Sortir");
            System.out.print("Opció: ");
            opcio = sc.nextInt();
            sc.nextLine();

            switch (opcio) {

                case 1:
                    System.out.print("Codi ticket: ");
                    String codi = sc.nextLine();

                    System.out.print("Nom: ");
                    String nom = sc.nextLine();

                    System.out.print("Edat: ");
                    int edat = sc.nextInt();
                    sc.nextLine();

                    Assistent a = new Assistent(codi, nom, edat);

                    if (repo.registrarAssistent(a)) {
                        System.out.println("Entrada registrada correctament.");
                    } else {
                        System.out.println("ERROR: Ticket duplicat.");
                    }
                    break;

                case 2:
                    System.out.print("Codi ticket: ");
                    String buscar = sc.nextLine();

                    Assistent trobat = repo.buscarPerTicket(buscar);
                    if (trobat != null) {
                        System.out.println(trobat);
                    } else {
                        System.out.println("No trobat.");
                    }
                    break;

                case 3:
                    System.out.println("Assistents:");
                    for (Assistent as : repo.obtenirLlista()) {
                        System.out.println(as);
                    }
                    break;

                case 4:
                    System.out.print("Codi ticket: ");
                    String eliminar = sc.nextLine();

                    if (repo.cancellarEntrada(eliminar)) {
                        System.out.println("Entrada cancel·lada.");
                    } else {
                        System.out.println("No existeix.");
                    }
                    break;

                case 5:
                    double mitjana = repo.calcularEdatMitjana();
                    System.out.println("Edat mitjana: " + mitjana);
                    break;

                case 6:
                    System.out.print("Codi ticket: ");
                    String cod = sc.nextLine();

                    Assistent ass = repo.buscarPerTicket(cod);
                    if (ass != null) {
                        System.out.print("Nou nom: ");
                        String nouNom = sc.nextLine();
                        ass.setNom(nouNom);
                        System.out.println("Nom actualitzat.");
                    } else {
                        System.out.println("No trobat.");
                    }
                    break;

                case 0:
                    System.out.println("Sortint...");
                    break;

                default:
                    System.out.println("Opció incorrecta.");
            }

        } while (opcio != 0);

        sc.close();
    }
}