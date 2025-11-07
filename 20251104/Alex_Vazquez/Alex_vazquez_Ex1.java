import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        double numero1 = sc.nextInt();
        System.out.print("Escribe otro número: ");
        double numero2 = sc.nextInt();
        double result = mutiplicacion(numero1, numero2);
        System.out.println("El resultado de la multiplicación es: " + result);
        sc.close();

    }
    public static double mutiplicacion (double a, double b) {
        double resultado = a * b;
        return resultado;
    }

}
