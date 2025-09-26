import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) throws Exception {
        int hora, minuto, segundo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime la hora: ");
        hora = sc.nextInt();

        System.out.println("Dime los minutos: ");
        minuto = sc.nextInt();

        System.out.println("Dime los segundos: ");
        segundo = sc.nextInt();

        if(segundo<60){
            segundo++;
        }

        if(segundo>=60){
            segundo = 00;
            minuto++;
        }

        if(minuto>=60){
            minuto = 00;
            hora++;
        }

        if(hora>=24){
            hora = 00;
            minuto = 00;
            segundo = 00;

        }
        System.out.println(hora + ":" + minuto + ":" + segundo);
    }
}

