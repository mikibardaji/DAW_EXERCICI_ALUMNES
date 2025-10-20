import java.util.Scanner;
import java.util.Random;

public class EX2_V1_new {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        System.out.print("Escull el teu petard (1-3): ");
        int eleccio = sc.nextInt();

      
        int p1 = rnd.nextInt(21);
        int p2 = rnd.nextInt(21);
        int p3 = rnd.nextInt(21);

       
        System.out.println("\nResultats dels petards:");
        System.out.println("Petard 1 -> " + p1);
        System.out.println("Petard 2 -> " + p2);
        System.out.println("Petard 3 -> " + p3);

        
        int max = Math.max(p1, Math.max(p2, p3));

       
        boolean guanyat = (eleccio == 1 && p1 == max) ||
                          (eleccio == 2 && p2 == max) ||
                          (eleccio == 3 && p3 == max);

        
        if (guanyat)
            System.out.println("\nHas guanyat! El teu petard ha arribat més lluny.");
        else
            System.out.println("\nHas perdut! Un altre petard ha arribat més lluny.");

        sc.close();
    }
}
