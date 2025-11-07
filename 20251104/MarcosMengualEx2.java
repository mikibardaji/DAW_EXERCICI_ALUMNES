import java.util.Scanner;

public class MarcosMengualEx2 {
    public static void main(String[] args) throws Exception {
     Scanner sc = new Scanner(System.in);
        int edad;

        System.out.print("Escribe tu edad: ");
        edad = sc.nextInt();

        if (esMayorEdad(edad)) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("No eres mayor de edad");
        }
    }

  
    static boolean esMayorEdad(int a) {
        if (a >= 18) {
            return true;
        } else {
            return false;
        } 
    }
}
