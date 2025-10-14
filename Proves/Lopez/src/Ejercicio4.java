import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número N: ");
        int numeroFinal = sc.nextInt();

        for (int numero = 1; numero <= numeroFinal; numero++) {
            System.out.println(numero);
        }

    }
}
