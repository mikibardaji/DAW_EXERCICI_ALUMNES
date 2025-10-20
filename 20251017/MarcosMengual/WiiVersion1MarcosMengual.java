import java.util.Random;
import java.util.Scanner;

public class WiiVersion1MarcosMengual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("Elige un petardo (1, 2 o 3): ");
        int elegido = sc.nextInt();

        
        int p1 = rnd.nextInt(0,21);
        int p2 = rnd.nextInt(0,21);
        int p3 = rnd.nextInt(0,21);

        System.out.println("Resultados:");
        System.out.println("Petardo 1: " + p1);
        System.out.println("Petardo 2: " + p2);
        System.out.println("Petardo 3: " + p3);

        int valorElegido;
        if (elegido == 1) valorElegido = p1;
        else if (elegido == 2) valorElegido = p2;
        else valorElegido = p3;

        boolean gana;
        if (elegido == 1) {
            gana = (valorElegido >= p2 && valorElegido >= p3);
        } else if (elegido == 2) {
            gana = (valorElegido >= p1 && valorElegido >= p3);
        } else {
            gana = (valorElegido >= p1 && valorElegido >= p2);
        }

        if (gana) {
            System.out.println("Has ganado Tu petardo ha llegado más lejos (o empatado).");
        } else {
            System.out.println("Has perdido. Otro petardo llegó más lejos.");
        }

    }
}
