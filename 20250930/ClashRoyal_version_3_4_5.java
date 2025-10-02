import java.util.Scanner;

public class ClashRoyal_version_3_4_5{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.println("cuantas copas has conseguido?");
int copas = sc.nextInt(); 

   if (copas <2000){
    System.out.println("elige uno de las cartas siguientes,Mago Electrico(m), o esbirro mega(e) ");

    char carta = sc.next().charAt(0); 

        switch (carta) {
            case 'm':
            case 'M':
                System.out.println("Has elegido el Mago Electrico");
                break;
            case 'e':
            case 'E':
                System.out.println("Has elegido el esbirro mega");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }else if (copas >= 2000 && copas < 3000) {
        System.out.println("elige uno de las cartas siguientes, Cavallero(c), o Bandida (b) ");
        char carta = sc.next().charAt(0);
         switch (carta){

            case 'c':
            case 'C':
            System.out.println("Has elegido el Cavallero");
            break;
            case 'b':
             case 'B':
            System.out.println("Has elegido la Bandida");
                break;
            default:
            System.out.println("Opcion no valida"); 
         }
    }else if (copas >= 3000){
        System.out.println("elige uno de las cartas siguientes,  Ejercito de esqueletos(E), o Gigante(G) ");
        char carta = sc.next().charAt(0);
         switch (carta){
            case 'e':
            case 'E':
            System.out.println("Has elegido el Ejercito de esqueletos");
            break;
            case 'g':
             case 'G':
            System.out.println("Has elegido el Gigante");
                break;
            default:
            System.out.println("Opcion no valida");
         }
    }
}
}
