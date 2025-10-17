import java.time.LocalDateTime;
import java.util.Scanner;

public class edadUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDateTime hoy = LocalDateTime.now();
        int anyo_actual = hoy.getYear();
        int edad;

        do {
            System.out.println("Que edad tienes? ");
            edad = sc.nextInt();
            if (edad != 0) {
                System.out.println("Edad - 1: " + (edad - 1));
                System.out.println("Año actual - 1: " + (anyo_actual - 1));
            }
        } while (edad != 0);
    }
}