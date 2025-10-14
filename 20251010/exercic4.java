import java.util.Scanner;
public class exercic4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numero;
        int num_inicio = 1;
        System.out.println("pone un numero");
        numero = sc.nextInt();
        while (num_inicio<=numero) {
            System.out.println(num_inicio);
            num_inicio++;
        }
    }
}
