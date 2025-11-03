import java.util.Random;
import java.util.Scanner;

public class Joc_de_wii_sly{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Bienvenido al juego de los petardos.");
        System.out.println("Elige un petardo (1, 2 o 3):");

        int elegido = sc.nextInt();

        System.out.println("Lanzando los petardos...");
    
        int p1 = rand.nextInt(0,50);
        int p2 = rand.nextInt(0,50);
        int p3 = rand.nextInt(0,50);

        System.out.println("Resultados:");
        System.out.println("Petardo 1: " + p1);
        System.out.println("Petardo 2: " + p2);
        System.out.println("Petardo 3: " + p3);

        int valorElegido;
        switch (elegido) {
            case 1:
                valorElegido = p1;
                break;
            case 2:
                valorElegido = p2;
                break;
            default:
                valorElegido = p3;
                break;
        }

        boolean gana;
        gana = switch (elegido) {
            case 1 -> valorElegido >= p2 && valorElegido >= p3;
            case 2 -> valorElegido >= p1 && valorElegido >= p3;
            default -> valorElegido >= p1 && valorElegido >= p2;
        };

        if (gana) {
            System.out.println("¡Has ganado! Tu petardo llegó más lejos.");
        } else {
            System.out.println("Has perdido. Otro petardo llegó más lejos.");
        }

    }
}