import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) throws Exception {
        /**
         * Realiza un programa que muestre los números pares 
         * comprendidos entre el 1 y el 200. Para ello utiliza 
         * un contador y suma de 2 en 2.
         */
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        while (contador <= 200) { // mientras el contador sea menor o igual a 200
            System.out.println(contador);// muestra el valor del contador
            contador += 2;// suma 2 al contador
        }
        sc.close();
    }
}
