import java.util.Scanner;

public class ex5Funciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una cantidad en millas: ");
        int millas = sc.nextInt();

        double kilometros = millas_a_kilometros(millas);

        System.out.println(millas + " millas equivalen a " + kilometros + " kilómetros.");

        sc.close();
    }

    public static double millas_a_kilometros(int millas) {
        double kilometros = millas * 1.60934;
        return kilometros;
    }
}
