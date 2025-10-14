import java.util.Scanner;

public class numerosN {
    public static void main(String[] args) {
        // Crear objeto Scanner para leer desde teclado
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario que introduzca un número
        System.out.print("Introduce un número N: ");
        int N = sc.nextInt();

        // Mostrar los números desde 1 hasta N
        int contador = 1;
        while (contador <= N) {
            System.out.println(contador);
            contador++;
        }

        // Cerrar el scanner
        sc.close();
    }
}
