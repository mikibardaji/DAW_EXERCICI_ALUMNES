import java.util.Scanner;

public class LlenyataireV0new{
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        int danyL = 0, vidaL = 0;
        int danyT = 0, vidaT = 0;

        int lvlLlenyataire, lvlTorre;

       
        do {
            System.out.print("Introdueix el nivell del Llenyataire (9-13): ");
            while (!sc.hasNextInt()) {
                System.out.println(" Has d’introduir un número vàlid.");
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

          if (lvlLlenyataire == 13) {
            danyL = 496;
            vidaL = 1548;
        } else if (lvlLlenyataire == 12) {
            danyL = 452;
            vidaL = 1409;
        } else if (lvlLlenyataire == 11) {
            danyL = 411;
            vidaL = 1282;
        } else if (lvlLlenyataire == 10) {
            danyL = 374;
            vidaL = 1166;
        } else { // 9
            danyL = 340;
            vidaL = 1060;
        }

        
        if (lvlTorre == 13) {
            danyT = 131 * 2; 
            vidaT = 3668;
        } else if (lvlTorre == 12) {
            danyT = 119 * 2;
            vidaT = 3346;
        } else if (lvlTorre == 11) {
            danyT = 109 * 2;
            vidaT = 3052;
        } else if (lvlTorre == 10) {
            danyT = 99 * 2;
            vidaT = 2786;
        } else { // 9
            danyT = 90 * 2;
            vidaT = 2534;
        }

       
        System.out.println("\n Comença la batalla!");
        System.out.println("Llenyataire (nivell " + lvlLlenyataire + ") — Vida: " + vidaL + " | Dany: " + danyL);
        System.out.println("Torre (nivell " + lvlTorre + ") — Vida: " + vidaT + " | Dany base: " + (danyT / 2) + " x2 per atac\n");

        int ronda = 1;
        while (vidaL > 0 && vidaT > 0) {
            System.out.println("  Ronda " + ronda);

            vidaT -= danyL;
            if (vidaT < 0) vidaT = 0;
            System.out.println(" Llenyataire ataca amb força " + danyL + " ➤ Vida Torre = " + vidaT);

            if (vidaT <= 0) break;

            vidaL -= danyT;
            if (vidaL < 0) vidaL = 0;
            System.out.println(" Torre respon amb força " + danyT + " ➤ Vida Llenyataire = " + vidaL);

            System.out.println("----------------------------------");
            Thread.sleep(500);
            ronda++;
        }

        // Resultat final
        System.out.println("\n Fi del combat!");
        if (vidaL <= 0 && vidaT <= 0)
            System.out.println("Empat! Els dos han caigut!");
        else if (vidaL <= 0)
            System.out.println(" La Torre ha guanyat!");
        else
            System.out.println(" El Llenyataire ha guanyat!");

        sc.close();
    }
}