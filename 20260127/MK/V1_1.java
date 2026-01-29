import java.util.Scanner;
public class V1_1 {

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
            System.out.println("Posición " + (i + 1) + ": " + numeros[i]);
        }
    }

    static int obtenerPosicionValida() {
        int posicion = -1;
        while (posicion < 1 || posicion > numeros.length) {
            System.out.print("Introduce la posición (1-" + numeros.length + "): ");
            posicion = sc.nextInt();
            
            if (posicion < 1 || posicion > numeros.length) {
                System.out.println("Posición no válida. Intenta de nuevo.");
            }
        }
        return posicion - 1;  // Retorna el índice
    }

    static void introducirValor() {
        System.out.print("Introduce un valor entero: ");
        int valor = sc.nextInt();

        int indice = obtenerPosicionValida();
        numeros[indice] = valor;
        System.out.println("Valor guardado correctamente.");
    }
}
