import java.util.Scanner;

public class LlenyataireV4_new {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lvlLlenyataire = 0, lvlTorre = 0;
        int danyL = 0, vidaL = 0, danyT = 0, vidaT = 0;

        do {
            System.out.print("Nivell del Llenyataire (9-13): ");
            lvlLlenyataire = sc.nextInt();
        } while (lvlLlenyataire < 9 || lvlLlenyataire > 13);

        do {
            System.out.print("Nivell de la Torre (9-13): ");
            lvlTorre = sc.nextInt();
        } while (lvlTorre < 9 || lvlTorre > 13);

        if (lvlLlenyataire == 9) { danyL = 340; vidaL = 1060; }
        else if (lvlLlenyataire == 10) { danyL = 374; vidaL = 1166; }
        else if (lvlLlenyataire == 11) { danyL = 411; vidaL = 1282; }
        else if (lvlLlenyataire == 12) { danyL = 452; vidaL = 1409; }
        else if (lvlLlenyataire == 13) { danyL = 496; vidaL = 1548; }

        if (lvlTorre == 9) { vidaT = 2534; danyT = 90 * 2; }
        else if (lvlTorre == 10) { vidaT = 2786; danyT = 99 * 2; }
        else if (lvlTorre == 11) { vidaT = 3052; danyT = 109 * 2; }
        else if (lvlTorre == 12) { vidaT = 3346; danyT = 119 * 2; }
        else if (lvlTorre == 13) { vidaT = 3668; danyT = 131 * 2; }

        System.out.println("\nComença la batalla!");

        while (vidaL > 0 && vidaT > 0) {
            vidaT -= danyL;
            if (vidaT < 0) vidaT = 0;
            System.out.println("Llenyataire ataca -> Vida Torre = " + vidaT);

            if (vidaT <= 0) break;

            vidaL -= danyT;
            if (vidaL < 0) vidaL = 0;
            System.out.println("Torre (ràpida) ataca -> Vida Llenyataire = " + vidaL);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (vidaL <= 0 && vidaT <= 0)
            System.out.println("\nResultat: Empat!");
        else if (vidaT <= 0)
            System.out.println("\nResultat: Guanya el Llenyataire!");
        else
            System.out.println("\nResultat: Guanya la Torre!");

        sc.close();
    }
}
