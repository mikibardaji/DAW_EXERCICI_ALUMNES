import java.util.Scanner;

public class tipusAposta {
    public static void main(String[] args) {
    tipusAposta();
    }

    public static int tipusAposta() {
        Scanner sc = new Scanner(System.in);
        int valor;

        System.out.println("Quin tipus d'aposta vols fer?");
        System.out.println("Introdueix un número del 1 al 36, o escriu -1 per SENAR o -2 per PARELL:");
        valor = sc.nextInt();

        if (valor >= 1 && valor <= 36) {
            return valor;
        } else if (valor % -1 == 0) {
            return -1;
        } else if (valor % -2 == 0) {
            return -2;
        } else {
            System.out.println("Opció no vàlida.");
            return 0;
        }
    }
}
