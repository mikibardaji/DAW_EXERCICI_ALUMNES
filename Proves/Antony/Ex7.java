import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        int dato1, dato2, dato3;
        System.out.println("Dime el primer numero: ");
        dato1 = dato.nextInt();

        System.out.println("Dime el segundo numero: ");
        dato2 = dato.nextInt();
        
        System.out.println("Dime el tercer numero");
        dato3 = dato.nextInt();

        if (dato1 >= dato2 && dato1 >= dato3) {
            System.out.println("El mas grande es el primer numero (" + dato1 + ")");
        }
        else if (dato2 >= dato1 && dato2 >= dato3) {
            System.out.println("El mas grande es el segundo numero (" + dato2 + ")");
        }
        else if (dato3 >= dato1 && dato3 >= dato2) {
            System.out.println("El mas grande es el tercer numero (" + dato3 + ")");
        }
    }
}
