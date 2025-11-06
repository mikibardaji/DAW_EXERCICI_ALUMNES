import java.util.Scanner;

public class exercici4_a2_jeremypanchana {

    /**
     * 
     * Escribe un programa que pida un número entero por teclado y muestre por pantalla si es
        positivo, negativo o cero. Implementa y utiliza la función:
        int dimeSigno(int a) // Devuelve -1 si es negativo, 0 si es igual a 0, 1 si es positivo
     * @param args
     */
    public static void main(String[] args) {
    
        
        Scanner sc = new Scanner (System.in);

        
        System.out.println("Escribe el numero ");
        int num = sc.nextInt();

        int verificador = dimeSigno(num);

          if (verificador == -1) {
            System.out.println("El numero es negativo.");
        } else if (verificador == 0) {
            System.out.println("El numero es cero.");
        } else {
            System.out.println("El número es positivo.");
        }

    }


    public static int dimeSigno(int a) {

        if (a<0)
        {

            return -1;

        }   
        else if (a>0){

            return 1;


        }
        else {

            return 0;
        }


    }


}





