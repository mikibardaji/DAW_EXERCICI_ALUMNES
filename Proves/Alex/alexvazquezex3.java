import java.util.Scanner;

public class numerogrande {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print(" Imprime numero 1: ");
        int numero1 = sc.nextInt();

        System.out.print(" Imprime numero 2: ");
        int numero2 = sc.nextInt();

        if (numero1 > numero2) {
            System.out.println(numero1+ " es mas grande");
            
        } else if (numero2> numero1) {
            System.out.println(numero2 + " es mas grande");
            
        } else {
            System.out.println("Los dos numeros son iguales");

        }
        sc.close();
    }    
            



}
