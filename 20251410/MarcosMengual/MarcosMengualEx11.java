import java.util.Random;
import java.util.Scanner;

public class MarcosMengualEx11 {

    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        int numeroSecreto = rd.nextInt(1, 101); 
        int intento;
        int contador = 0;

        System.out.println("He pensado un número entre 1 y 100.");

        do {
            System.out.print("Introduce tu número: ");
            intento = sc.nextInt();
            contador++;

            if (intento < numeroSecreto) {
                System.out.println("Mi número es mayor.");
            } else if (intento > numeroSecreto) {
                System.out.println("Mi número es menor.");
            } else {
                System.out.println("Has adivinado el número en " + contador + " intentos.");
            }

        } while (intento != numeroSecreto && contador <=6);

    }
}

