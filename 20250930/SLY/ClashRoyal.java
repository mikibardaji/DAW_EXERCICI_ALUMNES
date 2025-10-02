
import java.util.Scanner;

public class ClashRoyal {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

System.out.println("Que carta quieres, Mago Electrico(0), o esbirro mega(1) ?");
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
}


}

