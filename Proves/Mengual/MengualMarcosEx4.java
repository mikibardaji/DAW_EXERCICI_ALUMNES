import java.util.Scanner;

public class MengualMarcosEx4 {

    public static void main(String[] args) {
        
        //Pedir numero 1
        //Si el numero es mayor que cero es positivo
        //Si es mas pequeño que cero es negativo
        //Si es igual a cero imprimo 0

        Scanner src = new Scanner(System.in);
        double numero1;
        System.out.println(" Dime un numero ");
        numero1 = src.nextDouble();
        if (numero1>0)
        {
            System.out.println(" Positivo ");
        }
        else if (numero1<0)
        {
            System.out.println(" Negativo ");
        }
        else if (numero1==0)
        {
            System.out.println(" 0 ");
        }
    }
}
