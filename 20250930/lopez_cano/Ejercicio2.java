import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) throws Exception {

        /**
         * Ejercicio 2: Sistema de Copas
         * - Primero pregunta: "Quantes copes tens?"
         * - El usuario escribe 0 o 1
         * - Después:
         * - Si tienes MENOS de 2000 copas → Eliges entre Mago Electrico (0) y esbirro
         * mega (1)
         * - Si tienes 2000 copas o MÁS → Eliges entre Cavallero (0) y Bandida (1)
         */
        Scanner scCopas = new Scanner(System.in);
        Scanner scCarta = new Scanner(System.in);

        System.out.println("¿Cuantas copas tienes?");

        int copas = scCopas.nextInt();

        if (copas < 2000) {

            System.out.print("¿Qué carta quieres? Mago Eléctrico (0) o esbirro mega (1): ");

            int carta = scCarta.nextInt();

            if (carta == 0) {

                System.out.println("Has escogido Mago Eléctrico");
            } else if (carta == 1) {
                System.out.println("Has escogido esbirro megas");
            } else {
                System.out.println("Esta carta no se encuentra en las opciones");

            }
        } else {
            System.out.print("¿Qué carta quieres? Caballero (0) o Bandida (1): ");

            int carta = scCarta.nextInt();

            if (carta == 0) {
                System.out.println("Has escogido Caballero");
            } else if (carta == 1) {
                System.out.println("Has escogido Bandida");
            } else {
                System.out.println("Esta carta no se encuentra en las opciones");
            }
        }

        scCarta.close();
        scCopas.close();

    }
}
