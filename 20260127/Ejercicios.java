import java.util.Scanner;

public class Ejercicios {


private void rellenarArrays(){

    System.out.println("a. Mostrar valores.");
    System.out.println("b. Introducir valor.");
    System.out.println("c. Salir.");
    char opcion = sc.next().charAt(0);
    Scanner sc = new Scanner (System.in);

int[] posiciones = new int[10];
do {

    switch (opcion) {
        case 'a':
            for (int i = 0; i < posiciones.length; i++) {
                 System.out.println("Posición " + i + ": " + posiciones[i]);
            }
            break;

         case 'b':
            System.out.println("Introduce un valor:");
            int valor = sc.nextInt();
            System.out.println("Introduce una posición:");
            int posicion =sc.nextInt();

            posiciones[posicion] = valor;

            break;
    
        case 'c':
            break;
    }

} while (opcion == 'c');

}

}
