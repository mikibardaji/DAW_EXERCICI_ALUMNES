import java.time.LocalDateTime;
import java.util.Scanner;

public class ExerciciReforc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        LocalDateTime hoy = LocalDateTime.now();
        int any_actual = hoy.getYear();

        
        System.out.print("Introdueix la teva edat actual: ");
        int edat = sc.nextInt();

        
        int any_naixement = any_actual - edat;

        System.out.println("\nHas nascut l'any " + any_naixement + ".");
        System.out.println("A continuació es mostra l'edat que tenies cada any:\n");

        // Bucle per mostrar cada any i l’edat corresponent
        for (int any = any_naixement; any <= any_actual; any++) {
            int edat_en_aquell_any = any - any_naixement;
            System.out.println("L'any " + any + " tenies " + edat_en_aquell_any + " anys.");
        }

        sc.close();
    }
}