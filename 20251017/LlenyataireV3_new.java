import java.util.Scanner;

public class LlenyataireV3_new { 
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int lvlLlenyataire, lvlTorre;
        int danyL = 0, vidaL = 0, danyT = 0, vidaT = 0;

        System.out.print("Nivell del Llenyataire (9–13): ");
        lvlLlenyataire = sc.nextInt();

        System.out.print("Nivell de la Torre (9–13): ");
        lvlTorre = sc.nextInt();

        // Llenyataire
        if (lvlLlenyataire == 9) { danyL = 340; vidaL = 1060; }
        else if (lvlLlenyataire == 10) { danyL = 374; vidaL = 1166; }
        else if (lvlLlenyataire == 11) { danyL = 411; vidaL = 1282; }
        else if (lvlLlenyataire == 12) { danyL = 452; vidaL = 1409; }
        else if (lvlLlenyataire == 13) { danyL = 496; vidaL = 1548; }

        // Torre
        if (lvlTorre == 9) { vidaT = 2534; danyT = 90 * 2; }
        else if (lvlTorre == 10) { vidaT = 2786; danyT = 99 * 2; }
        else if (lvlTorre == 11) { vidaT = 3052; danyT = 109 * 2; }
        else if (lvlTorre == 12) { vidaT = 3346; danyT = 119 * 2; }
        else if (lvlTorre == 13) { vidaT = 3668; danyT = 131 * 2; }

        while (vidaL > 0 && vidaT > 0) {
            vidaT -= danyL;
            if (vidaT < 0) vidaT = 0;
            System.out.println(" Llenyataire ➤ Vida Torre = " + vidaT);

            if (vidaT <= 0) break;

            vidaL -= danyT;
            if (vidaL < 0) vidaL = 0;
            System.out.println(" Torre (doble atac) ➤ Vida Llenyataire = " + vidaL);

            Thread.sleep(500);
        }

        if (vidaL <= 0 && vidaT <= 0)
            System.out.println("\n Empat!");
        else if (vidaT <= 0)
            System.out.println("\n Guanya el Llenyataire!");
        else
            System.out.println("\n Guanya la Torre!");

        sc.close();
    }
}
