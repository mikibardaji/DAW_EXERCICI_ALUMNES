import java.util.Scanner;

public class Actividad2_Marcelo_Quintana{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int edad;

        System.out.print("Dime tu edad: ");
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


