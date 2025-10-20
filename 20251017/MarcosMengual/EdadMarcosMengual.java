import java.util.Scanner;
import java.time.Year;

public class Edad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int añoActual = Year.now().getValue();
        int edad;
        int añoNacimiento;

        System.out.print("Introduce tu edad actual: ");
        edad = sc.nextInt();

        añoNacimiento = añoActual - edad;

        System.out.println("Tienes " + edad + " años en el año " + añoActual);
        System.out.println("Has nacido en el año " + añoNacimiento + "");

        for (int año = añoActual; año >= añoNacimiento; año--) {
            int edadEnEseAnio = año - añoNacimiento;
            System.out.println("En el año " + año + " tenías " + edadEnEseAnio + " años");
        }

    }
}