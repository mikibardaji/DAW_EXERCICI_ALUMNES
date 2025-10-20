import java.util.Random;
import java.util.Scanner;

public class Ejercicio_Wii_Marcos_Gundin {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int eleccio;
        do {
            System.out.print("Escull petard guanyador (1, 2 o 3): ");
            eleccio = sc.nextInt();

            if (eleccio < 1 || eleccio > 3) {
                System.out.println("Valor incorrecte, torna a escribirlo. ");
            }
        } while (eleccio < 1 || eleccio > 3);

        int petard1 = rand.nextInt(0, 21);
        int petard2 = rand.nextInt(0, 21);
        int petard3 = rand.nextInt(0, 21);

        int millor = Math.max(petard1, Math.max(petard2, petard3));
        int guanyador = 0;

        if (petard1 == millor)
            guanyador = 1;
        if (petard2 == millor)
            guanyador = 2;
        if (petard3 == millor)
            guanyador = 3;

        System.out.println("Petard guanyador: " + guanyador);

        System.out.println("   P1   P2   P3");

        int maxAlcada = Math.max(petard1, Math.max(petard2, petard3));

        for (int i = maxAlcada - 1; i >= 0; i--) {
            int nivell = maxAlcada - i;

            if (nivell <= petard1)
                System.out.print("   *   ");
            else
                System.out.print("       ");

            if (nivell <= petard2)
                System.out.print("   *   ");
            else
                System.out.print("       ");

            if (nivell <= petard3)
                System.out.print("   *   ");
            else
                System.out.print("       ");

            System.out.println();
            Thread.sleep(500);
        }

        System.out.println("Petard guanyador: " + guanyador);

        if (eleccio == guanyador) {
            System.out.println("Has guanyat");
        } else {
            System.out.println("No has guanyat");
        }

    }
}
