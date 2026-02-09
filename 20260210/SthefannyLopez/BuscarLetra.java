import java.util.Scanner;

public class BuscarLetra {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe una frase: ");
        String frase = sc.nextLine();

        System.out.print("Dime una letra: ");
        char letra = sc.next().charAt(0);

        boolean hay = false;

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            if (Character.toLowerCase(c) == Character.toLowerCase(letra)) {
                System.out.println("La letra aparece en la posición:" + i);
                hay = true;
            }
        }

        if (!hay) System.out.println("No aparece la letra '" + letra + "' en la frase.");

        sc.close();
    }
}
