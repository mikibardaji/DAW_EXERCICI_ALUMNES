import java.util.Scanner;

public class descompte2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix el preu nominal: ");
        double preunominal = sc.nextDouble();

        System.out.println("Introdueix el preu de venta real del producte: ");
        double preureal = sc.nextDouble();

        double descomptePercent = ( (preunominal - preureal) / preunominal ) * 100;
        System.out.println("El percentatge de descompte és: " + descomptePercent + "%");
    }
}
