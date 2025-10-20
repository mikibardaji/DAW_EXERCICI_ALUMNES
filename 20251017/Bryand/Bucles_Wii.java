import java.util.Random;
import java.util.Scanner;

public class Bucles_Wii {
public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.println("----- JOC DELS PETARDS -----");
        System.out.print("Tria quin petard vols (1, 2 o 3): ");
        int eleccio = sc.nextInt();

        
        int petard1 = rd.nextInt(21);
        int petard2 = rd.nextInt(21);
        int petard3 = rd.nextInt(21);

        System.out.println();
        System.out.println("Explosió dels petards!");

        
        System.out.println("Petard 1:");
        for (int i = 0; i < petard1; i++) {
            System.out.print("*");
            Thread.sleep(500);
        }
        System.out.println("(" + petard1 + " metres)");

        System.out.println("Petard 2:");
        for (int i = 0; i < petard2; i++) {
            System.out.print("*");
            Thread.sleep(500);
        }
        System.out.println("(" + petard2 + " metres)");

        System.out.println("Petard 3:");
        for (int i = 0; i < petard3; i++) {
            System.out.print("*");
            Thread.sleep(500);
        }
        System.out.println("(" + petard3 + " metres)");

        
        int max = Math.max(petard1, Math.max(petard2, petard3));
        boolean guanyat = false;

        if ((eleccio == 1 && petard1 == max) ||
            (eleccio == 2 && petard2 == max) ||
            (eleccio == 3 && petard3 == max)) {
            guanyat = true;
        }

        if (guanyat) {
            System.out.println("Has ganado! Tu petardo ha sido del mas largo!");
        } else {
            System.out.println("Has perdido! Otro petardo ha llegado mas lejos...");
        }


}
}

