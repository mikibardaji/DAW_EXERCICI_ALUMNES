import java.util.Random;
import java.util.Scanner;

public class Exercici_PensarNumero_jeremypanchana {



    /*
     * Programar un programa que el ordenador piensa un numero del 1 al 100,
     *  y el usuario escribe, si lo acierta para el juego,
     *  si no el ordenador debe decir mayor o menor.
     * 
     */
    public static void main(String[] args) {
        
        int respuesta_usuario;

        


        Random rd = new Random();
         
        int numero_ordenador = rd.nextInt(0, 101);
        Scanner sc = new Scanner (System.in);
        

        System.out.println("Has de adivinar un numero del 1 al 100 que he pensado . ");
       //  System.out.println("->" + numero_ordenador);

       


        do {
                System.out.println("Escribe el numero para ver si aciertas: ");
             respuesta_usuario = sc.nextInt();


               if (respuesta_usuario < numero_ordenador) {
                System.out.println(" El numero que ha pensado el ordenador es MAYOR.");
            } else if (respuesta_usuario > numero_ordenador) {

                System.out.println("El numero que ha pensado el ordenador es MENOR.");
            } else {
                
                System.out.println("Has acertado era el " + numero_ordenador);
            }



        }while(respuesta_usuario != numero_ordenador);
        

        


        }
}
