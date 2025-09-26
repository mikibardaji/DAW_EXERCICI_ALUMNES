import java.util.Scanner;

public class alexvazquezex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe un numero: ");
        int numero1 = sc.nextInt();

        System.out.print("Escribe otro numero: ");
        int numero2 = sc.nextInt();

        System.out.print("Escribe otro numero: ");
        int numero3 = sc.nextInt();

        if (numero1>numero2 && numero1> numero3) {
            System.out.println("El numero mes gran es el " + numero1);

            
        }else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("El numero mas gran es el " + numero2);

            
        } else if (numero3 > numero1 && numero3> numero2) {
            System.out.println("El numero mas gran es el " + numero3);

            
        }



        sc.close();
    }    

}
