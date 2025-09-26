import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        int valor1, valor2;
        System.out.println("Dime el primer numero: ");
        valor1 = dato.nextInt();

        System.out.println("Dime el segundo numero: ");
        valor2 = dato.nextInt();

        if (valor1 > valor2) {
            System.out.println("El primer numero es mas grande que el segundo");
        }
        else if (valor1 < valor2) {
            System.out.println("El segundo numero es mas grande que el primero");
            
        }
    }
}
