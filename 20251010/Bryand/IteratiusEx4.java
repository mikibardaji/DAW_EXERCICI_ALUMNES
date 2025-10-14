import java.util.Scanner;

    public class IteratiusEx4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número N: ");

        int n = sc.nextInt();
        int contador = 1;
        
        while (contador <= n) {
            System.out.println(contador);
            contador++; 
        }

    }

}