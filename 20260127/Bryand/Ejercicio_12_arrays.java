import java.util.Scanner;

public class Ejercicio_12_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[10];
        char opcion;

        do {
            System.out.println("--- MENÚ ---");
            System.out.println("a. Mostrar valores");
            System.out.println("b. Introducir valor");
            System.out.println("c. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.next().charAt(0);

            switch (opcion) {
                case 'a':
                    System.out.println("Valores del array:");
                    for (int i = 0; i < array.length; i++) {
                        System.out.println("Posición " + (i + 1) + ": " + array[i]);
                    }
                    break;

                case 'b':
                    System.out.print("Introduce un valor: ");
                    int v = sc.nextInt();

                    int p;
                    do {
                        System.out.print("Introduce una posición (1-10): ");
                        p = sc.nextInt();
                    } while (p < 1 || p > array.length);

                    p = p - 1;

                    if (array[p] != 0) {
                        System.out.print("La posición ya tiene valor. ¿Quieres machacarlo? (s/n): ");
                        char respuesta = sc.next().charAt(0);
                        if (respuesta == 's' || respuesta == 'S') {
                            array[p] = v;
                            System.out.println("Valor sobrescrito correctamente.");
                        } else {
                            System.out.println("No se ha modificado el valor.");
                        }
                    } else {
                        array[p] = v;
                        System.out.println("Valor guardado correctamente.");
                    }
                    break;

                case 'c':
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 'c');
    }
}
