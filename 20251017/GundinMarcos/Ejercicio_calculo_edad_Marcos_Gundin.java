import java.time.LocalDateTime;
import java.util.Scanner;

public class Ejercicio_calculo_edad_Marcos_Gundin {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int edad;
        LocalDateTime hoy = LocalDateTime.now();
        int año = hoy.getYear();

        System.out.println("Escribe tu edad en el dia de hoy: ");
        edad = sc.nextInt();
        int diferencia;
        do {
            System.out.println("año -> " + año + " edad -> " + edad);
            edad = edad - 1;
            año = año - 1;
            diferencia = año - edad;
        } while (diferencia != año);
        System.out.println("naciste en el año: " + año);
    }
}
