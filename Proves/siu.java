import java.util.Scanner;

public class descompte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introdueix el Cost del producte: ");
        double preutotal = sc.nextDouble();

        System.out.println("Introdueix el descompte: ");
        double descompte = sc.nextDouble();

        double preufinal = preutotal - (preutotal * descompte/100);
        System.out.println("El cost final del producte és: " + preufinal);
        sc.close();


    }
}


