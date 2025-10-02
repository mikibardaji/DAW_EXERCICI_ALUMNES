import java.util.Scanner;

public class Ejercicio_Clash_royale {
    public static void main(String[] args) throws Exception {

        // Pedir copas al usuario

        // si tiene menos de 2000 copas
        // Dejar escojer entre mago electrico i mega esbirro
        // Mostrar resultado al usuario

        // Si el usuario tiene menos de 3000 copas i mas o igual a 2000 copas
        // Dejar escojer entre bandida i caballero
        // Mostrar resultado al usuario

        // I si el usuario tiene mas de 3000 copas o 3000 copas
        // Dejar escojer entre gigante noble i ejercito de esqueletos
        // Mostrar el resultado al usuario

        Scanner sc = new Scanner(System.in);

        double copas;
        char carta;

        final int primercopas = 2000;
        final int segundocopas = 3000;

        System.out.println("¿Cuántas copas tienes? ");
        copas = sc.nextInt();

        if (copas < primercopas) {
            System.out.println("Elige entre estas dos cartas: ");
            System.out.println("- Mago eléctrico (M) ");
            System.out.println("- Mega esbirro (E)");

            carta = sc.next().charAt(0);
            if (carta == 'M' || carta == 'm') {
                System.out.println("Felicidades has escogido al Mago eléctrico");
            } else if (carta == 'E' || carta == 'e') {
                System.out.println("Felicidades has escogido al Mega esbirro");
            } else {
                System.out.println("Escoge una carta válida");
            }
        } else if (copas >= primercopas && copas < segundocopas) {
            System.out.println("Elige entre estas dos cartas: ");
            System.out.println("- Bandida (B) ");
            System.out.println("- Caballero (C)");

            carta = sc.next().charAt(0);
            if (carta == 'B' || carta == 'b') {
                System.out.println("Felicidades has escogido a la Bandida");
            } else if (carta == 'C' || carta == 'c') {
                System.out.println("Felicidades has escogido al Caballero");
            } else {
                System.out.println("Escoge una carta válida");
            }
        } else { // copas >= 3000
            System.out.println("Elige entre estas dos cartas: ");
            System.out.println("- Gigante noble (G) ");
            System.out.println("- Ejército de esqueletos (E)");

            carta = sc.next().charAt(0);
            if (carta == 'G' || carta == 'g') {
                System.out.println("Felicidades has escogido al Gigante noble");
            } else if (carta == 'E' || carta == 'e') {
                System.out.println("Felicidades has escogido al Ejército de esqueletos");
            } else {
                System.out.println("Escoge una carta válida");
            }
        }
    }
}