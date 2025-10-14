import java.text.NumberFormat.Style;
import java.util.Random;
import java.util.Scanner;

public class Ex13 {
public static void main(String[] args) {
    //el usuario piensa numero
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();
    int limite_inferior =1;
    int limite_superior=100;
    char respuesta;
    do  
    {
    int ordenador_piensa= rd.nextInt(limite_inferior, limite_superior+1);

    System.out.println("He pensado el: " + ordenador_piensa + " he acertado(=,m,y)?");
    respuesta = sc.next().charAt(0);
    if (respuesta=='=')
    {
        System.out.println("Has acertado");
    }
    else if (respuesta == 'm') 
    {
        limite_superior = ordenador_piensa;
        System.out.println("El numero es menor");    
    }
    else    
    {
        limite_inferior=ordenador_piensa;
        System.out.println("El numero es mayor");
    }
    }while (respuesta != '=');
}
}
