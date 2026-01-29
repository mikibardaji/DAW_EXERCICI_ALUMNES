
Marcelo Quintana <maquintanarp@gmail.com>
mar, 27 ene, 11:29 (hace 2 días)
para mí

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
                        System.out.println("Posición " + i + ": " + array[i]);
                    }
                    break;
                   case 'b':
                    System.out.print("Introduce un valor: ");
                    int v = sc.nextInt();
                    System.out.print("Introduce una posición : ");
                    int p = sc.nextInt();
                    
                      if (p >= 0 && p < array.length) {
                        array[p] = v;
                        System.out.println("Valor guardado correctamente.");
                    } else {
                        System.out.println("Posición incorrecta.");
                    }
                    break;

                case 'c':
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 'c');
    }      
}
