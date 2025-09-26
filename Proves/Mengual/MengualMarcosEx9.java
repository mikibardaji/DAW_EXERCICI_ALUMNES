import java.util.Scanner;

public class MengualMarcosEx9 {

    public static void main(String[] args) {
        
        //Pedir hora minuto y segundos
        //Sumar 1 al segundo
        //Si segundos es >= a 60 sumar 1 al minuto
        //Iniciailizar a 0 el segundo
        //Si minutos es >= a 60 sumar 1 a la hora
        //Iniciailizar a 0 el minuto
        //SI la hora es > a 24 inicializar a 0 la hora

        Scanner src = new Scanner(System.in);
        int hora;
        System.out.println(" Dime la hora ");
        hora = src.nextInt();
        int minutos;
        System.out.println(" Dime los minutos ");
        minutos = src.nextInt();
        int segundos;
        System.out.println(" Dime los segundos ");
        segundos = src.nextInt();
        segundos = segundos + 1;

        if (segundos >= 60) 
        {
            segundos = 0;
            minutos = minutos +1;
        }
        if (minutos >= 60) 
        {
            minutos = 0;
            hora = hora +1;    
        }
        if (hora >= 24) 
        {
            hora = 0;    
        }

        System.out.println(" La hora es " + hora + ":" + minutos + ":" + segundos);
    }
}
