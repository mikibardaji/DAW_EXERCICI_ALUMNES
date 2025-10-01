import java.util.Scanner;

public class clashRoyale {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Demanar al usuari les copes
        System.out.println("Quantes copes tens?");
        int copes = scanner.nextInt();
        // Determinar les cartes disponibles segons les copes
        String carta1;
        String carta2;
        // Mostrar les cartes disponibles
        if (copes < 2000) // 0-1999
        {
            carta1 = "Mago Electrico (m)";
            carta2 = "Esbirro Mega (e)";
        } else if (copes < 3000) // 2000-2999
        {
            carta1 = "Caballero (c)";
            carta2 = "Bandida (b)";
        } else // 3000 o més
        {
            carta1 = "Ejercito de esqueletos (e)";
            carta2 = "Gigante (g)";
        }

        // Mostrar les cartes disponibles
        System.out.println("Puedes elegir entre:");
        System.out.println(carta1);
        System.out.println(carta2);

        // Demanar al usuari que esculli una carta
        System.out.println("Escribe la lletra de la carta que quieres:");
        String eleccion = scanner.next().toLowerCase();
        
        // Mostrar la carta escollida
        switch (eleccion) {
            case "m": // Mago Electrico
                System.out.println("Has elegido Mago Electrico");
                break;
            case "e": // Esbirro Mega o Ejercito de esqueletos
                if (copes < 2000) {
                    System.out.println("Has elegido Esbirro Mega");
                } else {
                    System.out.println("Has elegido Ejercito de esqueletos");
                }
                break;
            case "c": // Caballero
                System.out.println("Has elegido Caballero");
                break;
            case "b":// Bandida
                System.out.println("Has elegido Bandida");
                break;
            case "g":// Gigante
                System.out.println("Has elegido Gigante");
                break;
            default:// Carta no valida
                System.out.println("No has elegido ninguna carta valida");
        }
    }
}
