import java.util.Scanner;

public class MenuArrayFunciones {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] numeros = new int[10];

        char opcion;

        do {
            opcion = mostrarMenu();

            switch (opcion) {

                case 'a':
                    mostrarValores(numeros);
                    break;

                case 'b':
                    introducirValor(numeros);
                    break;

                case 'c':
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 'c');
    }


    public static char mostrarMenu() {

        System.out.println(" --- MENÚ ---");
        System.out.println("a. Mostrar valores");
        System.out.println("b. Introducir valor");
        System.out.println("c. Salir");
        System.out.print("Elige una opción: ");

        return sc.next().charAt(0);
    }

    public static void mostrarValores(int[] array) {

        System.out.println("\nValores del array:");

        for (int i = 0; i < array.length; i++) {
            System.out.println("Posición " + (i + 1) + ": " + array[i]);
        }
    }

    public static void introducirValor(int[] array) {

        System.out.print("Introduce el valor: ");
        int valor = sc.nextInt();

        int posicion = pedirPosicion(array.length);

        int indice = posicion - 1;

        if (array[indice] != 0) {

            System.out.println("Ya existe el valor: " + array[indice]);
            System.out.print("¿Quieres machacarlo? (s/n): ");

            char respuesta = sc.next().charAt(0);

            if (respuesta == 's' || respuesta == 'S') {
                array[indice] = valor;
                System.out.println("Valor sustituido.");
            } else {
                System.out.println("No se ha modificado.");
            }

        } else {
            array[indice] = valor;
            System.out.println("Valor guardado.");
        }
    }

    public static int pedirPosicion(int max) {

        int pos;

        do {
            System.out.print("Introduce la posición (1-" + max + "): ");
            pos = sc.nextInt();

            if (pos < 1 || pos > max) {
                System.out.println("Posición incorrecta.");
            }

        } while (pos < 1 || pos > max);

        return pos;
    }
}
