import java.util.Scanner;

public class primeraMayuscula {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu nombre");
        String nombre = sc.nextLine();

        if (nombre.length() > 0) {
            String nombreFormateado = nombre.substring(0, 1).toUpperCase() 
            + nombre.substring(1).toLowerCase();
            System.out.println("Tu nombre formateado es: " + nombreFormateado);
        }

    }
}