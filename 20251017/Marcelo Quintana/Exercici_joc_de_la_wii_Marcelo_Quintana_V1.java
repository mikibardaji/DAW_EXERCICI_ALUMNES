import java.util.Scanner;
import java.util.Random;

public class Exercici_joc_de_la_wii_Marcelo_Quintana_V1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random aleatori = new Random();
        System.out.print("Tria quin petard vols fer explotar (1, 2 o 3): ");
        int eleccio = sc.nextInt();


        int petardA = aleatori.nextInt(21);
        int petardB = aleatori.nextInt(21);
        int petardC = aleatori.nextInt(21);

 
        System.out.println("Resultats dels petards:");
        System.out.println("Petard 1 -> " + petardA);
        System.out.println("Petard 2 -> " + petardB);
        System.out.println("Petard 3 -> " + petardC);


        int major = petardA;
        if (petardB > major) {
            major = petardB;
        }
        if (petardC > major) {
            major = petardC;
        }

     
        boolean victoria = false;

        if (eleccio == 1 && petardA == major) {
            victoria = true;
        } else if (eleccio == 2 && petardB == major) {
            victoria = true;
        } else if (eleccio == 3 && petardC == major) {
            victoria = true;
        }

   
        System.out.println();
        if (victoria) {
            System.out.println(" Enhorabona! El teu petard ha estat el més potent!");
        } else {
            System.out.println(" Llàstima! Un altre petard ha arribat més lluny.");
        }
    }
}
