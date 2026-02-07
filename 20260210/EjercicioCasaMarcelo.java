import java.util.Scanner;

public class EjercicioCasaMarcelo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
         String texto;
         char letra;
        System.out.println(" Escribe una frase: ");
        texto = sc.nextLine();

        System.out.println(" Escribe una letra: ");
        letra = sc.next().charAt(0);

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == letra) {
                System.out.println(" La letra " + letra + " está en la posición:  " + i);
            }
        }
    }
}
