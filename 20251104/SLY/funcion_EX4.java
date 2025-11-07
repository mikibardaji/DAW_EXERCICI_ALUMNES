
import java.util.Scanner;

public class funcion_EX4 {

    public static void main(String[] args) {

        int numero_usuario = pedirNumeros();
        int signo = Signo(numero_usuario);
        System.out.print("|| " + signo + " ||" );


    }

    public static int pedirNumeros() {
        Scanner sc = new Scanner(System.in);
        System.out.print("tell me a number: ");
        int number = sc.nextInt();
        return number;
        
    }

    public static int Signo(int a) {
        if (a > 0) {
            System.out.print("your number is positive --> ");
            return 1;
        } else if (a == 0) {
            System.out.print("your number is zero -->  ");
            return 0;
        } else {
            System.out.print("your number is negative --> ");
            return -1;
        }
    }

}
