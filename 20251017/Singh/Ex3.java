import java.time.LocalDateTime;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        /**
         * Exercici de reforç
         * Escriu un programa que demani l'edat de l'usuari i, a 
         * partir de l'any actual, mostri l'edat que tenia l'usuari 
         * en cada any fins al seu naixement.
         * Per obtenir l'any actual, utilitza aquestes dues línies de codi:
         * LocalDateTime hoy = LocalDateTime.now();  
         * int anyo_actual = hoy.getYear();
         */
        // Obtenim l'any actual
        LocalDateTime hoy = LocalDateTime.now();
        int any_actual = hoy.getYear();

        // Demanem l'edat de l'usuari
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix la teva edat actual: ");
        int edat = sc.nextInt();

        // Calculem l'any de naixement
        int any_naixement = any_actual - edat;

        // Mostrem l'edat que tenia cada any des del naixement fins ara
        System.out.println("Has tingut aquestes edats:");
        for (int any = any_naixement; any <= any_actual; any++) {
            int edat_any = any - any_naixement;
            System.out.println("Any " + any + ": " + edat_any + " anys");
        }

        sc.close();
    }
}
