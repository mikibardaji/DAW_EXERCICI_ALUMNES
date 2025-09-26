import java.util.Scanner;

public class MengualMarcosEx5 {

    public static void main(String[] args) {
        
        //Pedir numero 1 
        //Pedir numero 2
        //Si numero 1 es mayor que 2 imprimir el numero 2
        //Si numero 2 es mayor que numero 1 imprimir numero 1
        //Si no imprimimos numero 1

        Scanner src = new Scanner(System.in);
        double numero1;
        System.out.println(" Dime un numero ");
        numero1 = src.nextDouble();
        double numero2;
        System.out.println(" Dime otro numero ");
        numero2 = src.nextDouble();
        if (numero1>numero2)
        {
            System.out.println(" El numero mas pequeño es" + numero2 + " Y el mas grande es" + numero1);
        }
        else if (numero1<numero2) 
        {
            System.out.println(" El numero mas pequeño es " + numero1 + " Y el numero mas grande es" + numero2);    
        }
        else if (numero1==numero2)
        {
            System.out.println( + numero1);    
        }
    }
}
