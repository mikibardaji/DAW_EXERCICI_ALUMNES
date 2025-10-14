import java.util.Random;
import java.util.Scanner;

public class Actividad13MarceloAleatorio {   
public static void main(String[] args) {
Random rd = new Random();
Scanner sc = new Scanner(System.in);
int ordenador_piensa;
int limite_inferior= 1;
int limite_superior = 100;
char respuesta;
do{
 ordenador_piensa=rd.nextInt(limite_inferior,limite_superior+1);
 System.out.println("HE PENSADO el " + ordenador_piensa + "he acertado (=,m (menor), y (mayor) ?"); 
 respuesta = sc.next().charAt(0);
if (respuesta == '-') {

    System.out.println(" Has acertado ");

}
else if (respuesta == 'm') {
    System.out.println("El numero es menor ");
    
}
else if (respuesta  == 'y') {
    System.out.println("El numero es mayor");

}
}while (respuesta!='=');




 }    
}


