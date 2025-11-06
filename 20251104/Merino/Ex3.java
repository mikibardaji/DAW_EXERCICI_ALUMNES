import java.util.Scanner;

public class Ex3 {

    public static int minimo(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("Introduce el primer número: ");
        num1 = sc.nextInt();

        System.out.println("Introduce el segundo número: ");
        num2 = sc.nextInt();

        int menor = minimo(num1, num2);

        System.out.println("El número más pequeño es: " + menor);
    }
}
