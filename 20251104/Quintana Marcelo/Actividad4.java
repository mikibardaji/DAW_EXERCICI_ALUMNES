import java.util.Scanner;

public class Actividad4 {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

     System.out.print("Introduce un número entero: ");
        int num = sc.nextInt();

        int signo = dimeSigno(num);

        if (signo == -1) {
            System.out.println("El número es negativo.");
        } else if (signo == 0) {
            System.out.println("El número es cero.");
        } else {
            System.out.println("El número es positivo.");
        }
    }
  
       public static int dimeSigno(int a) {
           if (a < 0) {
            return -1;
        } else if (a == 0) {
            return 0;
        } else {
            return 1;
        }
    }
}