import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        /**
         * Realiza un programa que muestre los números pares 
         * comprendidos entre el 1 y el 200. Esta vez utiliza 
         * un contador sumando de 1 en 1. 
         */
        Scanner sc = new Scanner(System.in);
        int contador = 1;
        while (contador <= 200) { // mientras el contador sea menor o igual a 200
            if (contador % 2 == 0) { // si el contador es par
                System.out.println(contador); // muestra el valor del contador
            }
            contador++; // suma 1 al contador
        }
    }
}
