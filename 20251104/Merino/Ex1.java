import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;
        edad = sc.nextInt();

        if (esMayorEdad(edad)) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }
    }

    public static boolean esMayorEdad(int a) {
        if (a >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
