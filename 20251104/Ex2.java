import java.util.Scanner;

public class Ex2 {

    // Función que devuelve true si la edad es mayor o igual a 18
    public static boolean esMayorEdad(int a) {
        return a >= 18;
    }

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
}
