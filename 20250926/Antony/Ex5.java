import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        int num1, num2;
        System.out.println("Escribe el primer numero: ");
        num1 = dato.nextInt();

        System.out.println("Escribe el segundo numero: ");
        num2 = dato.nextInt();

        if (num1 > num2) {
            System.out.println(num2 +" < "+ num1) ;
        }
        else if (num1 < num2) {
            System.out.println(num1 + " < " + num2);
        }
        else if (num1 == num2) {
            System.out.println(num1 + "=" + num2);
        }
    }
}
