import java.util.Scanner;
public class tellezmarkEx9 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("intruduce la hora");
    int hora = sc.nextInt();
    System.out.println("introduce los minutos");
    int minutos = sc.nextInt();
    System.out.println("introduce los segundos");
    int segundos = sc.nextInt();
    System.out.println("tiempo extra");
    int extra = sc.nextInt();
    int totalsegundos = (hora * 3600) + (minutos * 60) + segundos;
    int totalSegundos = totalsegundos + extra;
     int nuevahora= (totalSegundos / 3600) % 24;
        int nuevominutos= (totalSegundos % 3600) / 60;
        int nuevosegundos= (totalSegundos % 3600) % 60;
        System.out.println("La nueva hora es: " + nuevahora + ":" + nuevominutos + ":" + nuevosegundos);
    }     
}   