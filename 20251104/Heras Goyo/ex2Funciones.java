import java.util.Scanner;

public class ex2Funciones {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();

        if (esMayorEdad(edad)) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("No eres mayor de edad.");
        }

        sc.close();
    }

    public static boolean esMayorEdad(int e) {
        if (e >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
