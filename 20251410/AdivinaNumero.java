import java.util.Scanner;
import java.util.Random;

public class AdivinaNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int numeroSecreto = r.nextInt(100) + 1; // número del 1 al 100
        int intento = 0;
        int intentos = 0;

        System.out.println("🎲 He pensado un número entre 1 y 100. ¡Intenta adivinarlo!");

        // Bucle hasta que el usuario acierte
        while (intento != numeroSecreto) {
            System.out.print("Escribe tu número: ");
            intento = sc.nextInt();
            intentos++;

            if (intento < numeroSecreto) {
                System.out.println("📈 El número secreto es MAYOR.");
            } else if (intento > numeroSecreto) {
                System.out.println("📉 El número secreto es MENOR.");
            } else {
                System.out.println("🎉 ¡Has acertado en " + intentos + " intentos!");
            }
        }

        sc.close();
    }
}
