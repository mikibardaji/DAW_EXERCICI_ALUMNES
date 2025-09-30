import java.util.Scanner;

public class Ex13 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   System.out.print("¿Cuántos euros tienes? ");
        int euros = sc.nextInt();
        System.out.print("¿A qué moneda lo quieres cambiar? (D: Dólares, Y: Yenes, H: Dirhams): ");
        char opcion = sc.nextLine().charAt(0); 

        double cambio;

        switch (opcion) {
            case 'D':
                cambio = euros * 1.17;
                System.out.println("Tienes " + cambio + " dólares.");
                break;

            case 'Y':
                cambio = euros * 173.89;
                System.out.println("Tienes " + cambio + " yenes.");
                break;

            case 'H':
                cambio = euros * 10.64;
                System.out.println("Tienes " + cambio + " dirhams.");
                break;

            default:
                System.out.println("Esta moneda no está disponible.");
                break;
        }

}
}
