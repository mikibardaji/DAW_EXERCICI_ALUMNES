import java.util.Random;
import java.util.Scanner;

/**
 * Programa per practicar sumes de nombres enters.
 * 
 * Funciona de la següent manera:
 * 1. L'usuari indica un límit absolut (LIMIT) dels nombres.
 * 2. Es generen dos nombres aleatoris entre -LIMIT i +LIMIT.
 * 3. L'usuari ha d'introduir el resultat de la suma.
 * 4. El programa comprova la resposta i informa si és correcta.
 * 5. Es controla el nombre d'errors (màxim 3) i el programa pot acabar.
 * 6. L'usuari pot decidir si continuar després de cada càlcul.
 * 
 * Estructures escollides:
 * - Bucle do-while: permet executar el bloc almenys una vegada i continuar segons condicions.
 * - Random: per generar nombres aleatoris dins del rang indicat.
 * - if-else: per comprovar respostes i actualitzar comptadors.
 */
public class PracticaSumes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Introdueix el valor absolut màxim dels nombres (LIMIT): ");
        int limit = sc.nextInt();
        sc.nextLine(); // neteja buffer

        int encerts = 0;
        int errors = 0;
        int maxErrors = 3; // Versió 2.0
        String continuar;

        do {
            // Generar dos nombres aleatoris entre -LIMIT i +LIMIT
            int a = rand.nextInt(2 * limit + 1) - limit;
            int b = rand.nextInt(2 * limit + 1) - limit;

            System.out.println("Calcula: " + a + " + " + b + " = ?");
            int resposta = sc.nextInt();
            sc.nextLine(); // neteja buffer

            if (resposta == (a + b)) {
                System.out.println("Correcte!");
                encerts++;
            } else {
                System.out.println("Incorrecte! La resposta correcta era: " + (a + b));
                errors++;
            }

            // Comprovar si s'ha arribat al màxim d'errors
            if (errors >= maxErrors) {
                System.out.println("Has arribat al nombre màxim d'errors (" + maxErrors + ").");
                break;
            }

            // Preguntar si vol continuar
            System.out.print("Vols continuar? (s/n): ");
            continuar = sc.nextLine();

        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("\nFi del programa.");
        System.out.println("Encerts: " + encerts);
        System.out.println("Errors: " + errors);

        sc.close();
    }
}
