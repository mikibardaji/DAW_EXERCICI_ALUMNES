import java.util.Scanner;

public class Ejercicio_9_teorias_condicionales {
    public static void main(String[] args) throws Exception {
        
        //Pedir hora

        //Pedir minuto

        //Pedir segundo

        //Sumar 1 al segundo

            //Si segundos >=60

	        //Sumar 1 al minuto

	        //Inicializar a 0 los segundo

	        //Si minutos >= 60

		        //Sumar 1 a la hora

		        //Inicializar a 0 el minuto

		        //Si hora >= 24

		        //Inicializar 0 a la hora

//fin, fin, fin, fin

//Mostrar la hora, minuto, segundo.

        Scanner sc = new Scanner(System.in);
           int segundos, minutos, hora;
        int valorsuma = 1;

        System.out.println("Escribe las horas: ");
                hora = sc.nextInt();
           System.out.println("Escribe los minutos: ");
                minutos = sc.nextInt();
           System.out.println("Escribe los segundos: ");
                segundos = sc.nextInt();

        
        segundos = segundos + valorsuma;
       

        if (segundos >= 60) {
            minutos = minutos + valorsuma; 
            segundos = 00;
            if (minutos >= 60) {
                hora = hora + valorsuma;
                minutos = 00;
                if (hora >= 24) {
                    hora = 00;
                }
            }
        }

        System.out.println("Este es la hora con la suma: " + hora + ":" + minutos + ":" + segundos);
    }
}
