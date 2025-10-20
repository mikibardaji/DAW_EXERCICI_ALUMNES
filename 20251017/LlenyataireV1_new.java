import java.util.Scanner;

public class LlenyataireV1_new {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        int lvlLlenyataire, lvlTorre;
        int danyL = 0;
        int vidaT = 0;

        
        do {
            System.out.print("Introdueix el nivell del Llenyataire (9-13): ");
            while (!sc.hasNextInt()) {
                System.out.println("❌ Has d’introduir un número vàlid.");
                System.out.print("Introdueix el nivell del Llenyataire (9-13): ");
                sc.next();
            }
            lvlLlenyataire = sc.nextInt();
            if (lvlLlenyataire < 9 || lvlLlenyataire > 13)
                System.out.println(" Nivell incorrecte! Ha de ser entre 9 i 13.");
        } while (lvlLlenyataire < 9 || lvlLlenyataire > 13);

        
        do {
            System.out.print("Introdueix el nivell de la Torre (9-13): ");
            while (!sc.hasNextInt()) {
                System.out.println(" Has d’introduir un número vàlid.");
                System.out.print("Introdueix el nivell de la Torre (9-13): ");
                sc.next();
            }
            lvlTorre = sc.nextInt();
            if (lvlTorre < 9 || lvlTorre > 13)
                System.out.println(" Nivell incorrecte! Ha de ser entre 9 i 13.");
        } while (lvlTorre < 9 || lvlTorre > 13);

        
        if (lvlLlenyataire == 9) danyL = 340;
        else if (lvlLlenyataire == 10) danyL = 374;
        else if (lvlLlenyataire == 11) danyL = 411;
        else if (lvlLlenyataire == 12) danyL = 452;
        else if (lvlLlenyataire == 13) danyL = 496;

      
        if (lvlTorre == 9) vidaT = 2534;
        else if (lvlTorre == 10) vidaT = 2786;
        else if (lvlTorre == 11) vidaT = 3052;
        else if (lvlTorre == 12) vidaT = 3346;
        else if (lvlTorre == 13) vidaT = 3668;

        System.out.println("\n Comença la batalla!");
        System.out.println("Llenyataire ataca la Torre amb força " + danyL + " | Vida inicial Torre = " + vidaT);

        int cops = 0;

       
        while (vidaT > 0) {
            vidaT -= danyL;
            if (vidaT < 0) vidaT = 0;
            cops++;
            System.out.println(" Llenyataire ataca amb força " + danyL + " ➤ Vida Torre = " + vidaT);
            Thread.sleep(500);
        }

        System.out.println("\nTorre eliminada en " + cops + " cops!");

        sc.close();
    }
}
