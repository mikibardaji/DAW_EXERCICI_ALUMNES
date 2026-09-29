import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double CREDITOS_POR_EURO = 8.0;

        double euros, totalCreditos;

        System.out.print("Introduce la cantidad de euros a recargar: ");
        euros = sc.nextDouble();

        totalCreditos = euros * CREDITOS_POR_EURO;

        System.out.println("Equivale a un total de: " + totalCreditos + " creditos ProvenShare");

    }
}
