import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) throws Exception {
    /*Programa que llegeix 2 números i en mostra el més gran.
    //pedir valor1 , valor2
    //si valor1>valor2
    - Imprime Valor1
    //sino
    -Imprime Valor2
     */
        Scanner scanner = new Scanner(System.in);

        double valor1, valor2;
        System.out.print("Dime un valor 1: ");
        valor1 = scanner.nextDouble();
        System.out.print("Dime un valor 2: ");
        valor2 = scanner.nextDouble();
        if (valor1 > valor2) {
            System.out.println("El valor 1 es mayor que el valor 2");
        } else if (valor1 < valor2) {
            System.out.println("El valor 1 es menor que el valor 2");
        } else {
            System.out.println("Los dos valores son iguales");
        }

    }
}
