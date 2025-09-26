import java.util.Scanner;
public class tellezmarkEx7 {
public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce el numero 1");
    int num1 = sc.nextInt();
    System.out.println("Introduce el numero 2");
    int num2 = sc.nextInt();
    System.out.println("Introduce el numero 3");
    int num3 = sc.nextInt();
    if (num1 > num2 && num1 > num3) {
        System.out.println(num1 + " es mayor que el " + num2 + " y que el " + num3);
    } else if (num2 > num1 && num2 > num3) {
        System.out.println(num2 + " es mayor que el " + num1 + " y que el " + num3);
    } else if (num3 > num1 && num3 > num2) {
        System.out.println(num3 + " es mayor que el " + num1 + " y que el " + num2);
    } else {
        System.out.println("Los numeros son iguales");
    }
    }
}
