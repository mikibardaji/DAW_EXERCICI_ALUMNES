import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número: "); 
        int num1 = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = sc.nextInt();
        int minimo = minimo(num1, num2);
        System.out.println("El número mínimo es: " + minimo);
        sc.close();
        
    }
    public static int minimo(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
        
    }
    
    

}
