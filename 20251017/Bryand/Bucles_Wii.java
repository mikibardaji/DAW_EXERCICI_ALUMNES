import java.util.Random;
import java.util.Scanner;

public class Bucles_Wii {
public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.println("----- JOC DELS PETARDS -----");
        System.out.print("Tria quin petard vols (1, 2 o 3): ");
         int eleccion = sc.nextInt();
 
        
      int petardo1 = rd.nextInt(21);
          int petardo2 = rd.nextInt(21);
          int petardo3 = rd.nextInt(21);

        System.out.println();
        System.out.println("Explosió dels petards!");

        
        System.out.println("Petardo 1:");
        for (int i = 0; i < petardo1; i++) {
            System.out.print("*");
            Thread.sleep(500);
        }
        System.out.println("(" + petardo1 + " metres)");

        System.out.println("Petardo 2:");
        for (int i = 0; i < petardo2; i++) {
            System.out.print("*");
            Thread.sleep(500);
        }
        System.out.println("(" + petardo2 + " metres)");

        System.out.println("Petardo 3:");
        for (int i = 0; i < petardo3; i++) {
            System.out.print("*");
            Thread.sleep(500);
        }
        System.out.println("(" + petardo3 + " metres)");

        
        int max = Math.max(petard1, Math.max(petardo2, petardo3));
        boolean ganado = false;

        if ((eleccion == 1 && petardo1 == max) ||
            (eleccion == 2 && petardo2 == max) ||
            (eleccion == 3 && petardo3 == max)) {
            ganado = true;
        }

        if (ganado) {
            System.out.println("Has ganado! Tu petardo ha sido del mas largo!");
        } else {
            System.out.println("Has perdido! Otro petardo ha llegado mas lejos...");
        }


}
}


