import java.util.Random;
import java.util.Scanner;

public class Ex13P2 {
    public static void main(String[] args) {
        /**
         * Programar un programa que el ordenador piensa un numero del 1 al 100, 
         * y el usuario escribe, 
         * si lo acierta para el juego, si no el ordenador debe decir mayor o menor.
         */
        int limite_inferior = 1;
        int limite_superior = 100;
        int ordenador_piensa;
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
         do{
                ordenador_piensa= rd.nextInt(limite_inferior, limite_superior + 1);
                System.out.println("He pensado el numero: " + ordenador_piensa + " he acertado (=,m(Menor),y(Meyor))?");
                char respuesta = sc.next().charAt(0);
                if(respuesta == '='){
                    System.out.println("Has acertado");
                }else if(respuesta == 'Y'){
                    limite_superior = ordenador_piensa;
                    System.out.println("Es mayor");
                }else{
                    System.out.println("Es menor");
                }
            }while(true);
    }
}
