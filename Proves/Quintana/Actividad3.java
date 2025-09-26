// Pedir valor 1
// Pedir valor 2
// Tener la coparativa si el valor 1 es mayor, que el segundo que imprima el valor 1 si no imprimir el valor 2

import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double valor1;
    double valor2;
    System.out.println("Pedir valor 1 ? ");
    valor1 = sc.nextDouble();
    System.out.println("Pedir valor 2 ? ");
    valor2 = sc.nextDouble();
    if (valor1>valor2)
    {
        System.out.println("El numero 1 es mayor: " + valor1);
    }
    else if (valor2>valor1)
    {
        System.out.println("El numero2 es mayor: " + valor2);
    }
    else if(valor1==valor2)
    {
        System.out.println("Los numeros son iguales: " + valor1);
    }
}
}


