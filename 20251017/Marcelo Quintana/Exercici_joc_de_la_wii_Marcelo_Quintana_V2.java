import java.util.Scanner;
import java.util.Random;

public class Exercici_joc_de_la_wii_Marcelo_Quintana_V2 {
    public static void main(String[] args) throws InterruptedException {
        Scanner entrada = new Scanner(System.in);
        Random aleatori = new Random();
        System.out.print("Escull quin petard vols fer explotar (1, 2 o 3): ");
        int eleccio = entrada.nextInt();

       
        int petard1 = aleatori.nextInt(21);
        int petard2 = aleatori.nextInt(21);
        int petard3 = aleatori.nextInt(21);

        
        System.out.println("Resultats dels petards:");
        System.out.println("Petard 1 -> " + petard1);
        System.out.println("Petard 2 -> " + petard2);
        System.out.println("Petard 3 -> " + petard3);

        
        int maxim = petard1;
        if (petard2 > maxim) maxim = petard2;
        if (petard3 > maxim) maxim = petard3;

       
        System.out.println("\n              P1        P2        P3");

       
        for (int i = 1; i <= maxim; i++) {
            // Petard 1
            if (petard1 >= i) {
                System.out.print("              *");
            } else {
                System.out.print("              ");
            }

            // Petard 2
            if (petard2 >= i) {
                System.out.print("        *");
            } else {
                System.out.print("        ");
            }

            // Petard 3
            if (petard3 >= i) {
                System.out.print("        *");
            }

            System.out.println(); 
            Thread.sleep(500); 
        }

       
        boolean guanyat = false;
        if (eleccio == 1 && petard1 == maxim) guanyat = true;
        else if (eleccio == 2 && petard2 == maxim) guanyat = true;
        else if (eleccio == 3 && petard3 == maxim) guanyat = true;

      
        System.out.println();
        if (guanyat) {
            System.out.println(" Has guanyat! El teu petard ha arribat més lluny!");
        } else {
            System.out.println(" Has perdut! Un altre petard ha arribat més lluny.");
        }


    }
}
