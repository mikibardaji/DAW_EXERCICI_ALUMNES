
import java.util.Random;
import java.util.Scanner;

public class WiiParty {
    public static void main(String[] args) throws InterruptedException {
            Scanner sc = new Scanner(System.in);
            Random rd = new Random();

            int petardo1 = rd.nextInt(21);
            int petardo2 = rd.nextInt(21);
            int petardo3 = rd.nextInt(21);

            System.out.println("Elegie un petardo del 1-3 ");
            int elige = sc.nextInt();

            // Comprobar si el usuario ha ganado
            int valorTriat = 0;
            if (elige == 1) valorTriat = petardo1;
            if (elige == 2) valorTriat = petardo2;
            if (elige == 3) valorTriat = petardo3;

            boolean guanyat = true;
            for (int i = 1; i <= 3; i++) {
                int valorComparar = 0;
                if (i == 1) valorComparar = petardo1;
                if (i == 2) valorComparar = petardo2;
                if (i == 3) valorComparar = petardo3;

                if (valorTriat < valorComparar) {
                    guanyat = false;
                }
                
            }
            if (guanyat) {
                System.out.println("Has guanyat!");
            } 
            else {
                System.out.println("Has perdut!");
            }
        
            System.out.println("\n              P1        P2        P3");

             int maxim = petardo1;
        if (petardo2 > maxim) maxim = petardo2;
        if (petardo3 > maxim) maxim = petardo3;
        for (int i = 1; i <= maxim; i++) {
            // Petard 1
            if (petardo1 >= i) {
                System.out.print("              *");
            } else {
                System.out.print("              ");
            }

            // Petard 2
            if (petardo2 >= i) {
                System.out.print("        *");
            } else {
                System.out.print("        ");
            }

            // Petard 3
            if (petardo3 >= i) {
                System.out.print("        *");
            }

            System.out.println(); 
            Thread.sleep(500); 
        }
        sc.close();
    }
}
