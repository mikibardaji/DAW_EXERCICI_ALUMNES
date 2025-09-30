import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Demanar el preu
        System.out.print("Introdueix el preu (€): ");
        double preu = sc.nextDouble();

        // Demanar la quantitat pagada
        System.out.print("Introdueix la quantitat que pagues (€): ");
        double pagat = sc.nextDouble();

        // Comparar les quantitats
        if (pagat > preu) {
            double sobra = pagat - preu;
            System.out.println("Sobren " + sobra + "€");
        } else if (pagat < preu) {
            double falta = preu - pagat;
            System.out.println("Falten " + falta + "€");
        } else {
            System.out.println("El pagament és exacte. No sobren ni falten diners.");
        }
    }
}
