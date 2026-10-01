import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el número de servicios ofrecidos:");
        int servicios = sc.nextInt();

        int creditos;

        if (servicios == 0) {
            creditos = 10;
        } else if (servicios == 1 || servicios == 2) {
            creditos = 50;
        } else {
            creditos = 100;
        }

        System.out.println("Has recibido " + creditos + " créditos.");
    }
}
