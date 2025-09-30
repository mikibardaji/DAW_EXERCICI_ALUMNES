import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        int hora, minuto, segundo;
        System.out.println("Dime la hora: ");
        hora = dato.nextInt();

        System.out.println("Dime el minuto ");
        minuto = dato.nextInt();

        System.out.println("Dime el segundo");
        segundo = dato.nextInt();

        segundo += 1;

         if (segundo >= 60) {
            segundo = 0;
            minuto += 1;
            if (minuto >= 60) {
                minuto = 0;
                hora += 1;
                if (hora >= 24) {
                    segundo = 0;
                    minuto = 0;
                    hora = 0;
                }
            }
         }

         System.out.println(hora + ":" + minuto + ":" + segundo);
    }
}
