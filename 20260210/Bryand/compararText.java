import java.util.Scanner;

public class compararText {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la primera cadena de texto");
        String cadena1 = sc.nextLine();
        System.out.println("Introduce la segunda cadena de texto");
        String cadena2 = sc.nextLine();

        if (cadena1.equals(cadena2)) {
            System.out.println("Son exactamente iguales");
        } else {
            System.out.println("No son iguales");
        }

        if (cadena1.equalsIgnoreCase(cadena2)) {
            System.out.println("Son iguales sin diferenciar mayúsculas");
        } else {
            System.out.println("Siguen siendo diferentes");
        }
    }
}