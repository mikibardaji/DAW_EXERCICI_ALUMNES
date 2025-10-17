import java.util.Random;
import java.util.Scanner;

public class Jedi13 {
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    Random rd = new Random();

    int limite_inferio = 1;
    int limite_superior = 100;
    int ordenador_piensa;
    char respuesta;
    
do{
    ordenador_piensa = rd.nextInt(limite_inferio,limite_superior);

    System.out.println("He pensado el " +ordenador_piensa+ " he acertado? (=,m,y)");

     respuesta = sc.next().charAt(0);

    if (respuesta=='='){
        System.out.println("Has acertado");

    }else if (respuesta=='m'){
        limite_superior = ordenador_piensa;
        System.out.println("El numero es menor");

    }else if (respuesta=='y'){
        System.out.println("El numero es mayor");
        

    }else{

    }   

    }while (respuesta != '=');


}
}
