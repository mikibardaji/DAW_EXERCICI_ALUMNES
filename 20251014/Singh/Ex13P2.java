import java.util.Random;
import java.util.Scanner;

public class Ex13P2 {
    public static void main(String[] args) {
        /**
         * Programar un programa que el ordenador piensa un numero del 1 al 100, 
         * y el usuario escribe, 
         * si lo acierta para el juego, si no el ordenador debe decir mayor o menor.
         */
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int num_maquina = rd.nextInt(1, 101);
        int usuario, contador=0;
        //System.out.println("he pensado " + num_maquina);
        do {
        System.out.println("Que numero crees que he pensado?");
        usuario = sc.nextInt();
        contador++;
        if (usuario == num_maquina){
            System.out.println("Has acertado");
        } else if (usuario < num_maquina){
            System.out.println("Es mayor");
        } else if (usuario > num_maquina){
            System.out.println("Es menor");
        }
        }while (usuario != num_maquina && contador<=6);

        if (usuario == num_maquina) {
            System.out.println("Has acertado");
        }else if (usuario != num_maquina) {
            System.out.println("Has perdido");
        }
    }
}
