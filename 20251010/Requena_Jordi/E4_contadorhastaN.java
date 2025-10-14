import java.util.Scanner;

public class E4_contadorhastaN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número N: ");
        int N = sc.nextInt(); // Leemos el número N

        // Bucle que recorre del 1 hasta N
        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }

        sc.close();
    }
}
