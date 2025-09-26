import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el primer numero: ");
        double numero1 = sc.nextDouble();

        System.out.println("introduce el segundo numero: ");
        double numero2 = sc.nextDouble();

        if (numero1 > numero2) {
            System.out.println("el mayor es:" + numero1);
         } else if (numero2 > numero1) {
            System.out.println("el mayor es:" + numero1);
         } 

}
}
