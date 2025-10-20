import java.time.LocalDateTime;
import java.util.Scanner;

public class Exercici_de_reforç_Marcelo_Quintana {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

        LocalDateTime hoy = LocalDateTime.now();
        int any_actual = hoy.getYear();
        System.out.print("Introdueix la teva edat actual: ");
        int edat = sc.nextInt();

     
        int any_naixement = any_actual - edat;

        System.out.println(" Tens " + edat + " anys, i vas néixer l'any " + any_naixement + ".");
        System.out.println(" Aquí tens la teva edat any per any:");
        int any = any_naixement;
        while (any <= any_actual) {
            int edat_en_aquell_any = any - any_naixement;
            System.out.println("Any " + any + " -> " + edat_en_aquell_any + " anys");
            any++; 
        }
    }
}
