
//Pedir hora , minuto y segundos
//Sumar 1 al segundo
// Sies mayor a >= a 60 sumar 1 al minuto
//Si el minuto >= a 60 sumar 1 a la hora
//Inicializar a 0 el minuto
//Si la hora es >= a 24 inicializar a 0 la hora

import java.util.Scanner;
public class Actividad9 {
     public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int hora;
     int minuto;        
     int segundo;    

     System.out.println( "Pedir hora ");
    hora = sc.nextInt();
    System.out.println( "Pedir minuto  ");
    minuto = sc.nextInt();
    System.out.println( "Pedir segundo  ");
    segundo= sc.nextInt();
    segundo=segundo+1;
    if (segundo>=60)
    {
        segundo=0;
        minuto=minuto+1;
    }
    if (minuto>=60)
    {
        minuto=0;
        hora=hora+1;    
    }
    if (hora>=24)
    {
        hora=0;
    }

    System.out.println("La hora es  " + hora + ":" + minuto + ":" + segundo);
















     }  
}
