import java.util.Scanner;
import java.util.Random;

public class PetardoBasico {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int elegido;
        int p1, p2, p3;
        int max;
        boolean gana;

        // 1. Pedir elección y validar que sea 1, 2 o 3
        while (true) {
            System.out.print(" Escoge un petardo (1,2,3) ");
            if (!sc.hasNextInt()) {
                // no es un entero
                System.out.println("Error: has de posar 1, 2 o 3 (entrada no vàlida). Torna-ho a intentar.");
                sc.next(); // descarta token no numérico
                continue;
            }
            elegido = sc.nextInt();
            if (elegido < 1 || elegido > 3) {
                System.out.println("Error: només es permet 1, 2 o 3. Torna-ho a intentar.");
            } else {
                break; // valor válido
            }
        }

        // 2. Generamos valores aleatorios
        p1 = random.nextInt(21);
        p2 = random.nextInt(21);
        p3 = random.nextInt(21);

        // 3. Mostramos nombres de columnas arriba
        System.out.println(" P1  P2  P3");

        // 4. Encontrar el máximo (para saber cuántas filas tiene el dibujo)
        max = p1;
        if (p2 > max) max = p2;
        if (p3 > max) max = p3;

        // 5. Dibujamos desde la fila 1 (abajo) hasta max (arriba)
        for (int fila = 1; fila <= max; fila++) {
            // Petardo 1
            if (p1 >= fila) {
                System.out.print(" *  ");
            } else {
                System.out.print("    ");
            }

            // Petardo 2
            if (p2 >= fila) {
                System.out.print(" *  ");
            } else {
                System.out.print("    ");
            }

            // Petardo 3
            if (p3 >= fila) {
                System.out.print(" *  ");
            } else {
                System.out.print("    ");
            }

            // Salto de línea
            System.out.println();
            Thread.sleep(500);
        }

        // 6. Comprobar si ganó
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

        // 7. Resultado
        System.out.println();
        System.out.println("P1: " + p1 + "   P2: " + p2 + "   P3: " + p3);
        if (gana) {
            System.out.println(" Has guanyat! El teu petard ha estat el mes alt o ha empatat.");
        } else {
            System.out.println(" Has perdut. Un altre petard ha arribat més lluny.");
        }

    }
}
