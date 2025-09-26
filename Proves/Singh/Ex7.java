import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        /*Programa que llegeix tres números diferents i ens diu quin és el més gran.
//Pedir num1, num2, num3
//num1>num2 y num1>num3
-imprimir num1
//num2 > num1 y num2>num3
-imp num2
//num3>num1 y num3>num2
-imp num3
 */
        Scanner scanner = new Scanner(System.in);
        double valor1, valor2, valor3;
        System.out.print("Dime un valor 1: ");
        valor1 = scanner.nextDouble();
        System.out.print("Dime un valor 2: ");
        valor2 = scanner.nextDouble();
        System.out.print("Dime un valor 3: ");
        valor3 = scanner.nextDouble();
        if (valor1 >= valor2 && valor1 >= valor3) {
            System.out.println(valor1);}
        else if (valor2 >= valor1 && valor2 >= valor3) {
                System.out.println(valor2);}
        else if (valor3 >= valor1 && valor3 >= valor2) {
                System.out.println(valor3);}
        else {
                System.out.println(valor1);
            }
    }
}
