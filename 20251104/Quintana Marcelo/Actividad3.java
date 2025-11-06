import java.util.Scanner;

public class Actividad3 {
    
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número entero: ");
        int num1 = sc.nextInt();

        System.out.print("Introduce el segundo número entero: ");
        int num2 = sc.nextInt();

        int menor = minimo(num1, num2);

        System.out.println("El número mínimo es: " + menor);
        
    }

  
       public static int minimo(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }
}
