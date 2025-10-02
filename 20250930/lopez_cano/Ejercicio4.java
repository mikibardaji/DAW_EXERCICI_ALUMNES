import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) throws Exception {

        /**
         * Ejercicio 4: Igual que el ejercicio 3, pero ahora el programa acepta la letra
         * tanto en mayúscula como en minúscula (M o m, E o e, etc.)
         */
        Scanner scCopas = new Scanner(System.in);
        Scanner scCartas = new Scanner(System.in);

        System.out.println("¿Cuantas copas tienes?");

        int copas = scCopas.nextInt();

        if (copas < 2000) {

            System.out.print("¿Qué carta quieres? Mago Eléctrico (m) o esbirro mega (e): ");

            String personaje = scCartas.nextLine().toLowerCase();

            if (personaje.equals("m")) {

                System.out.println("Has escogido Mago Eléctrico");
            } else if (personaje.equals("e")) {
                System.out.println("Has escogido esbirro megas");
            } else {
                System.out.println("Esta carta no se encuentra en las opciones");

            }
        } else {
            System.out.print("¿Qué carta quieres? Caballero (c) o Bandida (b): ");

            String personaje = scCartas.nextLine().toLowerCase();

            if (personaje.equals("c")) {
                System.out.println("Has escogido Caballero");
            } else if (personaje.equals("b")) {
                System.out.println("Has escogido Bandida");
            } else {
                System.out.println("Esta carta no se encuentra en las opciones");
            }
        }

        scCartas.close();
        scCopas.close();

    }
}
