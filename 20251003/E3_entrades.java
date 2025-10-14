import java.util.Scanner;

public class E3_entrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introdueix el preu d'una entrada (€): ");
        double preuEntrada = sc.nextDouble();

        System.out.print("Quantes entrades vols comprar? ");
        int quantitat = sc.nextInt();

        double preuBase;
        double preuFinal;

        if (quantitat == 1) {
            preuBase = preuEntrada;
        } else if (quantitat == 2) {
            preuBase = preuEntrada + (preuEntrada * 0.9); // 10% descompte a la segona
        } else {
            preuBase = quantitat * preuEntrada * 0.95; // 5% descompte a totes
        }
        final double IVA = 21.0;
        preuFinal = preuBase * IVA/100; // Afegim 21% d’IVA

        System.out.println("\n--- RESUM DE LA COMPRA ---");
        System.out.println("Entrades comprades: " + quantitat+ "entrades");
        System.out.println("Preu base: " + preuBase + " euros");
        System.out.println("Preu total amb IVA (21%): "+ preuFinal + " euros");

    }
}