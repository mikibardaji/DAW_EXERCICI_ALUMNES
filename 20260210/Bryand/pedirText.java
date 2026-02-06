import java.util.Scanner;

public class pedirText {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una cadena de texto ");
        String cadena = sc.nextLine();

        if (cadena.length() > 0) {
            String[] palabras = cadena.split(" ");
            for (String palabra : palabras) {
                if (palabra.length() > 0) {
                    System.out.println(palabra);
                }
            }
        }
    }
}