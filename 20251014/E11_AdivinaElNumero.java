import java.util.Random;
import java.util.Scanner;

public class E11_AdivinaElNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int numeroSecreto = rd.nextInt(100) + 1;
        int intento = 0;
        int contador = 0;

        System.out.println("¡Adivina el número que estoy pensando (del 1 al 100)!");

        do {
            System.out.print("Escribe tu número: ");
            intento = sc.nextInt();
            contador++;

            if (intento < numeroSecreto) {
                System.out.println("El número secreto es MAYOR.");
            } else if (intento > numeroSecreto) {
                System.out.println("El número secreto es MENOR.");
            } else {
                System.out.println("¡Felicidades! Adivinaste el número en " + contador + " intentos.");
            }

        } while (intento != numeroSecreto);
        sc.close();
    }
}