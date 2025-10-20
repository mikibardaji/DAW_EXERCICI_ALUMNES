import java.util.Scanner;
import java.util.Random;

public class WiiVersion2MarcosMengual {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int elegido;
        int p1, p2, p3;
        int max;
        boolean gana;

        while (true) {
            System.out.print(" Escoge un petardo (1,2,3) ");
            if (!sc.hasNextInt()) {
                System.out.println(" Error: tienes que poner 1, 2 o 3. Intentalo de nuevo. ");
                sc.next();
                continue;
            }
            elegido = sc.nextInt();
            if (elegido < 1 || elegido > 3) {
                System.out.println(" Error: tienes que poner  1, 2 o 3. Intentalo de nuevo. ");
            } else {
                break; 
            }
        }

        p1 = random.nextInt(0,21);
        p2 = random.nextInt(0,21);
        p3 = random.nextInt(0,21);

        System.out.println(" P1  P2  P3");

        max = p1;
        if (p2 > max) max = p2;
        if (p3 > max) max = p3;

        for (int fila = 1; fila <= max; fila++) {
            if (p1 >= fila) {
                System.out.print(" *  ");
            } else {
                System.out.print("    ");
            }

            if (p2 >= fila) {
                System.out.print(" *  ");
            } else {
                System.out.print("    ");
            }

            if (p3 >= fila) {
                System.out.print(" *  ");
            } else {
                System.out.print("    ");
            }

            System.out.println();
            Thread.sleep(500);
        }

        int valorElegido = 0;
        if (elegido == 1) {
            valorElegido = p1;
        } else if (elegido == 2) {
            valorElegido = p2;
        } else if (elegido == 3) {
            valorElegido = p3;
        }

        if (elegido == 1 && valorElegido >= p2 && valorElegido >= p3) {
            gana = true;
        } else if (elegido == 2 && valorElegido >= p1 && valorElegido >= p3) {
            gana = true;
        } else if (elegido == 3 && valorElegido >= p1 && valorElegido >= p2) {
            gana = true;
        } else {
            gana = false;
        }

        System.out.println();
        System.out.println("P1: " + p1 + "   P2: " + p2 + "   P3: " + p3);
        if (gana) {
            System.out.println(" Has ganado Tu petardo esta mas alto o ha empatado con otro petardo. ");
        } else {
            System.out.println(" Has perdido. Otro petardo ha llegado mas lejos. ");
        }
    }
}
