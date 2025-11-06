import java.util.Scanner;

public class Ex5 {

    public static double millas_a_kilometros(int millas) {
        return millas * 1.60934;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int millas;

        System.out.println("Escribe un valor en millas: ");
        millas = sc.nextInt();

        System.out.println(millas + " millas son " + millas_a_kilometros(millas) + " kilómetros");
    }
}