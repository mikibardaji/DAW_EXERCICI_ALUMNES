import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) throws Exception {

        /**
         * Ejercicio 5: Añades un nuevo nivel de copas
         * - Menos de 2000 copas → Mago Electrico / esbirro mega
         * - 2000 a 2999 copas → Cavallero / Bandida
         * - 3000 copas o más → Ejercito de esqueletos / Gigante
         */
        Scanner scCopas = new Scanner(System.in);
        Scanner scPersonaje = new Scanner(System.in);

        System.out.println("¿Cuantas copas tienes?");

        int copas = scCopas.nextInt();

        if (copas < 2000) {

            System.out.print("¿Qué carta quieres? Mago Eléctrico (m) o esbirro mega (e): ");

            String personaje = scPersonaje.nextLine();

            if (personaje.equals("m")) {

                System.out.println("Has escogido Mago Eléctrico");
            } else if (personaje.equals("e")) {
                System.out.println("Has escogido esbirro megas");
            } else {
                System.out.println("Esta carta no se encuentra en las opciones");

            }
        } else if (copas >= 2000 && copas < 3000) {
            System.out.print("¿Qué carta quieres? Caballero (c) o Bandida (b): ");

            String personaje = scPersonaje.nextLine().toLowerCase();

            if (personaje.equals("c")) {
                System.out.println("Has escogido Caballero");
            } else if (personaje.equals("b")) {
                System.out.println("Has escogido Bandida");
            } else {
                System.out.println("Esta carta no se encuentra en las opciones");
            }
        } else {
            System.out.print("¿Qué carta quieres? Ejercito de esqueletos (e) o Gigante (g): ");

            String personaje = scPersonaje.nextLine().toLowerCase();

            if (personaje.equals("e")) {
                System.out.println("Has escogido Ejercito de esqueletos");
            } else if (personaje.equals("g")) {
                System.out.println("Has escogido Gigante");
            } else {
                System.out.println("Esta carta no se encuentra en las opciones");
            }
        }

        scCopas.close();
        scPersonaje.close();

    }
}
