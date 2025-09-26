import java.util.Scanner;

public class ej5Condi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime la hora ");
        int hora = sc.nextInt();
        System.out.println("Dime los minutos ");
        int minuto = sc.nextInt();
        System.out.println("Dime los segundos ");
        int segundos = sc.nextInt();

        segundos = segundos + 1;

        if (segundos >= 60) 
            {
             minuto = minuto + 1;
             segundos = 0;
             if (minuto>=60) 
                {
                 hora = hora + 1;
                 minuto = 0;
                 if (hora>=24) 
                    {
                     hora = 0;
                    }
                }
            }


        System.out.println("el siguiente segundo es " + hora + ":" + minuto + ":" + segundos);
            
    }

}