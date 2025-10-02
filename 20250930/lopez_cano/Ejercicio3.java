import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) throws Exception {

        /**
         * Ejercicio 3: Usar Letras en vez de Números
         * Igual que el ejercicio 2, pero en vez de escribir 0 o 1, escribes la primera
         * letra del personaje en minúscula:
         * - Mago Electrico → m
         * - esbirro mega → e
         * - Cavallero → c
         * - Bandida → b
         */
        Scanner scCopas = new Scanner(System.in);
        Scanner scCarta = new Scanner(System.in);

        System.out.println("¿Cuantas copas tienes?");

        int copas = scCopas.nextInt();

        if (copas < 2000) {

            System.out.print("¿Qué carta quieres? Mago Eléctrico (m) o esbirro mega (e): ");

            String personaje = scCarta.nextLine();

            if (personaje.equals("m")) {

                System.out.println("Has escogido Mago Eléctrico");
            } else if (personaje.equals("e")) {
                System.out.println("Has escogido esbirro megas");
            } else {
                System.out.println("Esta carta no se encuentra en las opciones");

            }
        } else {
            System.out.print("¿Qué carta quieres? Caballero (c) o Bandida (b): ");

            String personaje = scCarta.nextLine();

            if (personaje.equals("c")) {
                System.out.println("Has escogido Caballero");
            } else if (personaje.equals("b")) {
                System.out.println("Has escogido Bandida");
            } else {
                System.out.println("Esta carta no se encuentra en las opciones");
            }
        }

        scCopas.close();
        scCarta.close();

    }
}
