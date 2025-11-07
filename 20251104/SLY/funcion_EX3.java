
import java.util.Scanner;

public class funcion_EX3 {

    public static void main(String[] args) {

        int El_minimo_numero;
        int primer_numero = pedirNumeros("Dimero tu primer numero");
        int segundo_numero = pedirNumeros("Dime tu segundo numero");
        El_minimo_numero = elNumeroMinimo(primer_numero, segundo_numero);
        System.out.println("el numero mas pequeno es " + El_minimo_numero);
    }

    /**
     * public static boolean esMayorDeEdadç(int age) {
     * if (age >= 18) {
     * System.out.println("You are an adult");
     * return true;
     * } else {
     * System.out.println("You are a minor");
     * return false;
     * }
     * 
     * 
     * }
     */

    /**
     * public static int preguntarEdad() {
     * Scanner sc = new Scanner(System.in);
     * System.out.println("how old are you?");
     * int user_age = sc.nextInt();
     * sc.close();
     * return user_age;
     * }}
     */

    public static int pedirNumeros(String frase) {
        Scanner sc = new Scanner(System.in);
        System.out.println(frase);
        int number = sc.nextInt();
        return number;
    }

    public static int elNumeroMinimo(int a, int b) {
        int minimo;
        if (a < b) {
            minimo = a;
        } else {
            minimo = b;
        }
        return minimo;
    }

}
