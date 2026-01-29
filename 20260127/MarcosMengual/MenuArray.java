import java.util.Scanner;

public class MenuArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[10];
        char opcion;

        do {
            System.out.println(" ===MENU=== ");
            System.out.println(" a. Mostrar valores ");
            System.out.println(" b. Introducir valores ");
            System.out.println(" c. Salir");
            System.out.print(" Elige una opción: ");
            opcion = sc.next().toLowerCase().charAt(0);

            switch (opcion) {
                case 'a':
                    System.out.println(" Valores del array ");
                    for(int i = 0;i < array.length; i++) {
                        System.out.println(" Posicion " + i + ":" + array[i]);
                    }
                    break;

                case 'b':
                    System.out.print("Introduce el valor: ");
                    int valor = sc.nextInt();

                    System.out.print("Introduce la posición: ");
                    int posicion = sc.nextInt();

                    if (posicion >= 0 && posicion < array.length) {
                        array[posicion] = valor;
                        System.out.println("Valor guardado correctamente.");
                    } else {
                        System.out.println("Posición incorrecta.");
                    }
                case 'c':
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            
                }
        } while (opcion != 'c');
    }
}

