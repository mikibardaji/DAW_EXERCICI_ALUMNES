//Pedir numero 1
//Pedir el número 2
//Si numero1 es mayor que 2 imprimir el número 2 
// Si numero 2 es mayor que número 1 imprimir numero 1
//Si no imprimir numero 1


import java.util.Scanner;

public class Actividad5 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     double numero1;
     double numero2;
     System.out.println("Pedir numero 1 ? ");
    numero1 = sc.nextDouble();
    System.out.println("Pedir numero 2 ? ");
    numero2 = sc.nextDouble();
    if (numero1>numero2)
    {
        System.out.println("El número mas pequeño es: " + numero2 + " y el número mayor es: " + numero1);
    }

    else if (numero1 < numero2)
    {
        System.out.println("El número mas pequeño es: " + numero1 + " y el número mayor es: " + numero2);
    }
    else if(numero1==numero2)
    {
        System.out.println("Los números son iguales " + numero1);
    }







    }
}
