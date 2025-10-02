import java.util.Scanner;

public class clashRoyale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántas copas tienes? ");
        int copas = sc.nextInt();
        sc.nextLine();

        String cartaEscogida = "";

        if (copas < 2000) {
            System.out.print("Elige carta: Mago Eléctrico (m) o Esbirro Mega (e): ");
            String eleccion = sc.nextLine().toLowerCase();

            if (eleccion.equals("m")) {
                cartaEscogida = "Mago Eléctrico";
            } else if (eleccion.equals("e")) {
                cartaEscogida = "Esbirro Mega";
            } else {
                System.out.println("Opción no válida.");
                return;
            }

        } else if (copas >= 2000 && copas < 3000) {
            System.out.print("Elige carta: Caballero (c) o Bandida (b): ");
            String eleccion = sc.nextLine().toLowerCase();

            if (eleccion.equals("c")) {
                cartaEscogida = "Caballero";
            } else if (eleccion.equals("b")) {
                cartaEscogida = "Bandida";
            } else {
                System.out.println("Opción no válida.");
                return;
            }

        } else { // copas >= 3000
            System.out.print("Elige carta: Ejército de esqueletos (e) o Gigante (g): ");
            String eleccion = sc.nextLine().toLowerCase();

            if (eleccion.equals("e")) {
                cartaEscogida = "Ejército de esqueletos";
            } else if (eleccion.equals("g")) {
                cartaEscogida = "Gigante";
            } else {
                System.out.println("Opción no válida.");
                return;
            }
        }

        System.out.println("Has escogido " + cartaEscogida);

        sc.close();
    }

}