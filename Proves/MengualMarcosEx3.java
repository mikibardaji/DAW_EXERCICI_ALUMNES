import java.util.Scanner;

public class MengualMarcosEx3 {

     public static void main(String[] args) {
            
        //Pedir valor 1 
        //Pedir valor 2
        //Hacer la comparativa si el valor 1 es mayor que el segundo que imprima el valor 1 si no imprime el valor 2

        Scanner src = new Scanner(System.in);
        double valor1;
        System.out.println(" Dime un numero ");
        valor1 = src.nextDouble();
        double valor2;
        System.out.println(" Dime otro numero ");
        valor2 = src.nextDouble();
        if (valor1>valor2)
        {
            System.out.println( " El numero mas grande es" + valor1);    
        }
        else if (valor1<valor2)
        {
            System.out.println(" El numero mas grande es " + valor2);
        }
        else if (valor1==valor2)
        {
            System.out.println(" El numero mas grande es "+valor1);
        }
    }
}
