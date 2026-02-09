import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime una frase:");
        String frase = sc.nextLine();

        System.out.println("¿Qué letra quieres buscar?");
        char letra = sc.next().charAt(0);

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) {
                System.out.println("La letra ocupa la siguiente posición: " + (i +1));
            }
        }

    }
}
