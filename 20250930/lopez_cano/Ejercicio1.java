import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) throws Exception {

        /**
         * Ejercicio 1: Versión Básica.
         * - El programa pregunta qué carta quieres: Mago Electrico (0) o esbirro mega
         * (1)
         * - El usuario escribe 0 o 1
         * - El programa muestra: "Has escollit [nombre de la carta]"
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Qué carta quieres? Mago Eléctrico (0) o esbirro mega (1): ");

        int carta = sc.nextInt();

        if (carta == 0) {

            System.out.println("Has escogido Mago Eléctrico");
        } else if (carta == 1) {
            System.out.println("Has escogido esbirro megas");
        } else {
            System.out.println("Esta carta no se encuentra en las opciones");

        }

        sc.close();

    }
}
