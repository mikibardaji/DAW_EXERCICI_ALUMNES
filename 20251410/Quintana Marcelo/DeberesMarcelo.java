import java.util.Random;
import java.util.Scanner;

public class DeberesMarcelo {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        int numeroSecreto = rd.nextInt(1, 101);
        int intento;
        int contador = 0;

        System.out.println("He pensado un número del 1 al 100.");
    

        do {
            System.out.print("Escribe un número: ");
            intento = sc.nextInt();
            contador++;

            if (intento < numeroSecreto) {
                System.out.println(" El número secreto es MAYOR ");
            } else if (intento > numeroSecreto) {
                System.out.println(" El número secreto es MENOR ");
            } else {
                System.out.println(" ¡Has acertado! El número era  " + numeroSecreto);
                System.out.println(" Lo lograste en " + contador + "  intentos ");
            }
        } while (intento != numeroSecreto && contador <=6 );

    }
}
