import java.util.Scanner;

public class Funcion8 {

    public static int puntosPartida() {
        Scanner sc = new Scanner(System.in);
        int puntos = -1;

        do {
            System.out.print("¿A cuántos puntos quieres jugar? (1-20): ");
            if (sc.hasNextInt()) {
                puntos = sc.nextInt();
                if (puntos < 1 || puntos > 20) {
                    System.out.println(" Valor no válido. Debe ser entre 1 y 20.");
                }
            } else {
                System.out.println(" Debes introducir un número entero.");
            }
        } while (puntos < 1 || puntos > 20);

        return puntos;
    }

    public static void main(String[] args) {
        int maxPuntos = puntosPartida();
        System.out.println("La partida será a " + maxPuntos + " puntos.");
    }
}
