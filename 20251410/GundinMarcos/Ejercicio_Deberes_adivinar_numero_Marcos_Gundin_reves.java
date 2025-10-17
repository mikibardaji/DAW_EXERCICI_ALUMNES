import java.util.Scanner;
import java.util.Random;

public class Ejercicio_Deberes_adivinar_numero_Marcos_Gundin_reves {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int numeroSecreto = rd.nextInt(1,101) + 1;
        int intento;
        int contadorIntentos = 0;

        System.out.println("He pensado en un número del 1 al 100...");
        System.out.println("¡Intenta adivinarlo!");

        do {
            System.out.print("Introduce tu intento: ");
            intento = sc.nextInt();
            contadorIntentos++;

            if (intento < numeroSecreto) {
                System.out.println("Mi número es MAYOR que " + intento);
            } else if (intento > numeroSecreto) {
                System.out.println("Mi número es MENOR que " + intento);
            } else {
                System.out.println("¡Correcto! Has adivinado mi número en " + contadorIntentos + " intentos.");
            }

        } while (intento != numeroSecreto);
    }
}
