import java.util.Random;
import java.util.Scanner;

public class AdivinaNumeroRandom {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
   

        int min = 1;
        int max = 100;
        int intento;
        char respuesta;
        int intentosTotales = 0;

        System.out.println("Piensa en un número del 1 al 100 y yo intentaré adivinarlo.");
        System.out.println("Cuando te diga un número, responde:");
        System.out.println("- '+' si tu número es mayor");
        System.out.println("- '-' si tu número es menor");
        System.out.println("- '=' si he acertado");

        do {
            // Genera un número aleatorio dentro del rango actual
            intento = rand.nextInt(max - min + 1) + min;
            intentosTotales++;

            System.out.print("¿Es " + intento + "? (+ / - / =): ");
            respuesta = sc.next().charAt(0);
            respuesta = Character.toLowerCase(respuesta);

            if (respuesta == '+') {
                min = intento + 1; // Ajustamos el mínimo
            } else if (respuesta == '-') {
                max = intento - 1; // Ajustamos el máximo
            } else if (respuesta == '=') {
                System.out.println("🎯 ¡He adivinado tu número! Era " + intento + " 🎉");
                System.out.println("Lo he conseguido en " + intentosTotales + " intento(s).");
            } else {
                System.out.println("Por favor, responde solo con '+', '-' o '='.");
            }

            // Seguridad: si min > max, significa que hubo un error en las respuestas
            if (min > max) {
                System.out.println("¡Algo no cuadra con tus respuestas! Reinicia el juego.");
                break;
            }

        } while (respuesta != '=');

        sc.close();
    }
}
