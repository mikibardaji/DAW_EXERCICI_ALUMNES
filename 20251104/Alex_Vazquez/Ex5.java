import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad en millas: ");
        double millas = sc.nextDouble();
        double kilometros = millaskilometro(millas);
        System.out.println(millas + " millas son " + kilometros + " kilómetros.");
        sc.close();
        
    }
    public static double millaskilometro(double millas) {
        double kilometros = millas * 1.60934;
        return kilometros;
    }

}
