import java.util.Scanner;

public class Ex3 {

    // Función que devuelve el menor entre a y b
    public static int minimo(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número entero: ");
        int num1 = sc.nextInt();

        System.out.print("Introduce el segundo número entero: ");
        int num2 = sc.nextInt();

        int menor = minimo(num1, num2);

        System.out.println("El número mínimo es: " + menor);

        sc.close();
    }
}

