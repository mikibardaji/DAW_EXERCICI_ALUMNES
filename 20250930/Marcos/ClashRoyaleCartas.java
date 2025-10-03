import java.util.Scanner;

public class ClashRoyaleCartas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Preguntem les copes
        System.out.print("Quantes copes tens? ");
        int copes = sc.nextInt();
        sc.nextLine(); // Netejar buffer

        String eleccio;

        if (copes < 2000) {
            System.out.println("Pots escollir entre:");
            System.out.println("(m) Mago Eléctrico");
            System.out.println("(e) Esbirro Mega");
            System.out.print("Escriu la lletra de la carta: ");
            eleccio = sc.nextLine().toLowerCase(); // Accepta majúscules i minúscules

            if (eleccio.equals("m")) {
                System.out.println("Has escollit Mago Eléctrico!");
            } else if (eleccio.equals("e")) {
                System.out.println("Has escollit Esbirro Mega!");
            } else {
                System.out.println("Opció incorrecta!");
            }

        } else if (copes < 3000) {
            System.out.println("Pots escollir entre:");
            System.out.println("(c) Cavallero");
            System.out.println("(b) Bandida");
            System.out.print("Escriu la lletra de la carta: ");
            eleccio = sc.nextLine().toLowerCase();

            if (eleccio.equals("c")) {
                System.out.println("Has escollit Cavallero!");
            } else if (eleccio.equals("b")) {
                System.out.println("Has escollit Bandida!");
            } else {
                System.out.println("Opció incorrecta!");
            }

        } else { // copes >= 3000
            System.out.println("Pots escollir entre:");
            System.out.println("(e) Ejército de esqueletos");
            System.out.println("(g) Gigante");
            System.out.print("Escriu la lletra de la carta: ");
            eleccio = sc.nextLine().toLowerCase();

            if (eleccio.equals("e")) {
                System.out.println("Has escollit Ejército de esqueletos!");
            } else if (eleccio.equals("g")) {
                System.out.println("Has escollit Gigante!");
            } else {
                System.out.println("Opció incorrecta!");
            }
        }

        sc.close();
    }
}
