import java.util.Scanner;

public class Ex9 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int horas;
    int mins;
    int segs;
    System.out.println("Dime que hora es: ");
    horas = sc.nextInt();
    System.out.println("Dime que minuto es: ");
    mins = sc.nextInt();
    System.out.println("Dime que segundo es: ");
    segs = sc.nextInt();

    if(segs+1>=60){

            mins=mins+1;
            segs=0;
             if(mins>=60){
                horas=horas+1;
                mins=0;
                if(horas>=24){

                    horas=0;
                }
            }
    }
    System.out.println("El tiempo actual es de "+horas+" horas "+mins+" minutos "+segs+" segundos");
}
}
