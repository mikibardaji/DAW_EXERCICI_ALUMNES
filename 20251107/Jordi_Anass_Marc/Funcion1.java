import java.util.Scanner;

public class Funcion1 {

    public static int jugada() {
        Scanner sc = new Scanner(System.in);
        int opcion = -1;

        do {
            System.out.print("¿Qué sacas? (0 piedra, 1 papel, 2 tijera): ");
            if (sc.hasNextInt()) {
                opcion = sc.nextInt();
                if (opcion < 0 || opcion > 2) {
                    System.out.println(" Valor no válido. Intenta de nuevo.");
                }
            } else {
                System.out.println(" Debes introducir un número (0, 1 o 2).");
            }
        } while (opcion < 0 || opcion > 2);

        return opcion;
    }

    public static void main(String[] args) {
        int eleccion = jugada();
        
    }
}

