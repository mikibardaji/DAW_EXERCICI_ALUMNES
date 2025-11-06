import java.util.Scanner;

public class FuncionsEx5 {
    public static double millas_km(int millas) {
        return millas * 1.60934;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la distancia en millas: ");
        int millas = sc.nextInt();

        double kilometros = millas_km(millas);

        System.out.println(millas + " millas en kilometros son: " + kilometros + " km.");
    }
}
