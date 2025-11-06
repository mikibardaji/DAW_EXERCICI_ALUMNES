import java.util.Scanner;

public class exercici3_a2_jeremypanchana {


    /**
     * Escribe un programa que pida dos números enteros por teclado 
     * y muestre por pantalla cual es el mínimo.
     Implementa y utiliza la función:
     int minimo(int a, int b) // Devuelve el menor entre a y b

     * @param args
     */

    public static void main(String[] args) {
    
        Scanner sc = new Scanner (System.in);

        System.out.println("Escribe el primer numero : ");
        int num1 = sc.nextInt();

        System.out.println("Escribe el segundo  numero : ");
        int num2 = sc.nextInt();



        minimo(num1, num2);


        
     }

     public static int minimo(int a, int b){


        if (a>b){


            System.out.println("El minimo es " + b);
            return b;

        }
        else {

            System.out.println("El minimo es " + a);
            return a;
        }




        

     }
     


}
