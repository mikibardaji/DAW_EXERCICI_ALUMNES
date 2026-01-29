import java.util.Scanner;

public class Ejercicio_12_arrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        char opcion;

        do {
            mostrarMenu();
            opcion = leerOpcion(sc);

            switch (opcion) {
                case 'a':
                    mostrarValores(array);
                    break;
                case 'b':
                    introducirValor(array, sc);
                    break;
                case 'c':
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 'c');


    }

 
    public static void mostrarMenu() {
        System.out.println("--- MENÚ ---");
        System.out.println("a. Mostrar valores");
        System.out.println("b. Introducir valor");
        System.out.println("c. Salir");
        System.out.print("Elige una opción: ");
    }

    
    public static char leerOpcion(Scanner sc) {
        return sc.next().charAt(0);
    }


    public static void mostrarValores(int[] array) {
        System.out.println("Valores del array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Posición " + i + ": " + array[i]);
        }
    }

    public static void introducirValor(int[] array, Scanner sc) {
        System.out.print("Introduce un valor: ");
        int valor = sc.nextInt();

        System.out.print("Introduce una posición: ");
        int posicion = sc.nextInt();

        if (posicion >= 0 && posicion < array.length) {
            array[posicion] = valor;
            System.out.println("Valor guardado correctamente.");
        } else {
            System.out.println("Posición incorrecta.");
        }
    }
}
