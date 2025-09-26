import java.util.Scanner;
public class tellezmarkEx3 {
public static void main(String[] args) throws Exception {
Scanner sc = new Scanner(System.in);
System.out.println("Introduce el numero 1");
int num1 = sc.nextInt();
System.out.println("Introduce el numero 2");

int num2 = sc.nextInt();
if (num1 > num2) {
    System.out.println( num1 + "es mayor que el " + num2);
} else if (num1 < num2) {
    System.out.println( num1 + "es menor que el" + num2);
} else {
    System.out.println("Los numeros son iguales");

}
}
}
