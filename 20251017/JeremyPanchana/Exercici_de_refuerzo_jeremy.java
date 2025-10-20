import java.time.LocalDateTime;
import java.util.Scanner;

public class Exercici_de_refuerzo_jeremy {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

   
        LocalDateTime hoy = LocalDateTime.now();
        int any_actual = hoy.getYear();

        System.out.print("Escriu  edad : ");
        int edat = sc.nextInt();

       
        int any_naixement = any_actual - edat;

        System.out.println("Has nascut a " + any_naixement );
      

      
        for (int any = any_actual; any >= any_naixement; any--) {
            int edat_any = any - any_naixement;
            System.out.println("L'any " + any + " tenies " + edat_any + " anys.");
        }

    
    }
}
