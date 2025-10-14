import java.util.Scanner;

public class NumerosN_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.print("Introduce un número N: ");
        int N = sc.nextInt(); 

       
        for (int contador = 1; contador <= N; contador++) {
            if (contador % 2 == 0) {
                System.out.println(contador);
            }
        }

        sc.close(); 
    }
}
