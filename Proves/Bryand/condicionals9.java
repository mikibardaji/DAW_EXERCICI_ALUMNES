import java.util.Scanner;

public class condicionals9 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int hora, minuto,segundo;
    System.out.print("Que hora es? ");
    hora = sc.nextInt();

    System.out.print("Que minuto es? ");
    minuto = sc.nextInt();

    System.out.print("Que segundo es? ");
    segundo = sc.nextInt();


    if(segundo<60){
            segundo++;
        }


    if (segundo >= 60){
        
        segundo = 00;
        minuto ++;


    if (minuto >= 60){
        minuto = 00;  
        hora ++;
            

    if (hora >=24){
            hora = 00;
            minuto = 00;
            segundo = 00;


            }
        }
    }

    System.out.println("el siguiente segundo es " + hora + ":" + minuto + ":" + segundo);
 }
}
