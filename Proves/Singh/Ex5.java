import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
    /*Programa que llegeix dos números i els visualitza en ordre ascendent.
    //Pedir num1
    //Pedir num2
    //si num1>num2
    -imprimir num2 >num1
    //Sino si num2>num1
    -Impirmir num1 -num2
    //Sino
    -Impirmir num1 */
    
    Scanner scanner = new Scanner(System.in);
    double valor1, valor2;
    System.out.print("Dime un valor 1: ");
    valor1 = scanner.nextDouble();
    System.out.print("Dime un valor 2: ");
    valor2 = scanner.nextDouble();
    if (valor1 > valor2) {
        System.out.println(valor2 + " - " + valor1);
    } else if (valor2 > valor1) {
        System.out.println(valor1 + " - " + valor2);
    } else {
        System.out.println(valor1);
    }
}
}