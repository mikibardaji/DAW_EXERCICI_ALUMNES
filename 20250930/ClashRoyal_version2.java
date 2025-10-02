import java.util.Scanner;

public class ClashRoyal_version2 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.println("cuantas copas has conseguido?");
int copas = sc.nextInt(); 

   if (copas <2000){
    System.out.println("elige uno de las cartas siguientes,Mago Electrico(0), o esbirro mega(1) ");

    int carta = sc.nextInt(); 

        switch (carta) {
            case 0:
                System.out.println("Has elegido el Mago Electrico");
                break;
            case 1:
                System.out.println("Has elegido el esbirro mega");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }else if (copas >= 2000) {
        System.out.println("elige uno de las cartas siguientes, Cavallero(0), o Bandida (1) ");
        int carta = sc.nextInt();
         switch (carta){

            case 0:
            System.out.println("Has elegido el Cavallero");
             break;
            case 1:
            System.out.println("Has elegido la Bandida");
                break;
            default:
            System.out.println("Opcion no valida"); 
         }
    }
}
}
