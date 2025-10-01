import java.util.Scanner;

public class clashRoyale {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        /*Inici
        Preguntar: "Quantes copes tens?"
        Llegir el número de copes.
        Decidir opcions segons el número de copes:
        Si copes < 2000 → Opcions:
        (m) Mago Eléctrico
        (e) Esbirro Mega
        Si 2000 ≤ copes < 3000 → Opcions:
        (c) Caballero
        (b) Bandida
        Si copes ≥ 3000 → Opcions:
        (e) Ejército de esqueletos
        (g) Gigante
        Mostrar per pantalla les dues opcions disponibles.
        Preguntar: "Escriu la lletra de la carta que vols:"
        Llegir la lletra introduïda per l’usuari (acceptar majúscules i minúscules).
        Comparar la lletra amb les opcions disponibles segons el rang de copes:
        Si coincideix amb una de les opcions → guardar el nom complet de la carta.
        Si no coincideix → marcar com a "opció no vàlida".
        Mostrar el resultat:
        Si la lletra era vàlida → "Has escollit XXXX".
        Si no era vàlida → "Opció no vàlida".
        Fi del programa.
        */
        
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

