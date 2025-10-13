import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        /**
         * Realiza un programa que muestre los números desde 
         * el 1 hasta un número N que se introducirá por teclado.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número N: ");
        int n = sc.nextInt();
        int contador = 1;
        while (contador <= n) { // mientras el contador sea menor o igual a N
            System.out.println(contador); // muestra el valor del contador
            contador++; // suma 1 al contador
        }
        sc.close();
    }

}
