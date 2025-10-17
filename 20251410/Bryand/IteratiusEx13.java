import java.util.Random;
import java.util.Scanner;

public class IteratiusEx13 {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int limite_inferior = 1;
        int limite_superior = 100;
        int ordenador_piensa;
        char respuesta;

        do{
        ordenador_piensa = rd.nextInt(limite_inferior, limite_superior + 1);

        System.out.print("He pensado el " + ordenador_piensa + " he acertado (=,m,y)? ");
        respuesta = sc.next().charAt(0);
        if (respuesta == '='){
            System.out.println("Has acertado");
        }
        else if ( respuesta == 'm'){
        limite_superior = ordenador_piensa;
        System.out.println("El numero es menor");
        }

        else {
            limite_inferior = ordenador_piensa;
            System.out.println("El numero es mayor");
        }
    }while(respuesta != '=');
    }

}
