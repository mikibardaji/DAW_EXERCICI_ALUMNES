import java.util.Scanner;

public class FuncionsEx3 {
    public static int minimo(int a, int b) {
        if (a < b) {
            return a;
        } 
        
        else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Escribe el segundo número: ");
        int num2 = sc.nextInt();


        int menor = minimo(num1, num2);
        System.out.println("El número menor es: " + menor);

    }
}