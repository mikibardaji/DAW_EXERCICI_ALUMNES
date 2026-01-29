import java.util.Scanner;
public class V1_0 {

    static Scanner sc = new Scanner(System.in);
    static int[] numeros = new int[10];

    public static void main(String[] args) {
        char opcion;

        do {
            mostrarMenu();
            opcion = sc.next().toLowerCase().charAt(0);

            switch (opcion) {
                case 'a':
                    mostrarValores();
                    break;
                case 'b':
                    introducirValor();
                    break;
                case 'c':
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 'c');

        sc.close();
    }

    static void mostrarMenu() {
        System.out.println("\n--- MENÚ ---");
        System.out.println("a. Mostrar valores");
        System.out.println("b. Introducir valor");
        System.out.println("c. Salir");
        System.out.print("Elige una opción: ");
    }

    static void mostrarValores() {
        System.out.println("\nValores del array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }
    }

    static void introducirValor() {
        System.out.print("Introduce un valor entero: ");
        int valor = sc.nextInt();

        System.out.print("Introduce la posición (0-9): ");
        int posicion = sc.nextInt();

        if (posicion >= 0 && posicion < numeros.length) {
            numeros[posicion] = valor;
            System.out.println("Valor guardado correctamente.");
        } else {
            System.out.println("Posición no válida.");
        }
    }
}

