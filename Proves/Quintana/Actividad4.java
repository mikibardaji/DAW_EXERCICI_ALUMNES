//Pedir el numero 1
// Si el número es mayor que cero es positivo
//Sinó es más pequeño que cero negativo
//Si es igual a cero imprimo 0

import java.util.Scanner;   
public class Actividad4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero1;
        System.out.println(" Pedir el numero 1 ? ");
        numero1 = sc.nextDouble();
        if (numero1>0)
        {
            System.out.println("El número es positivo: " + numero1);
        }
        else if (numero1<0)
        {
            System.out.println("El número es negativo: " + numero1);
        }
        else if(numero1==0)
        {
            System.out.println("El número es 0: " + numero1);
        }
    }
}
