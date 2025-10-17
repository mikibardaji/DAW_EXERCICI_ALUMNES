import java.util.Scanner;

public class teoriaBucles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que factorial quieres saber");
        int numero = sc.nextInt();
        int factorial = 1;

        for (int i = 1; i <= numero; i++) {
            factorial = i;
            factorial = factorial * i;
        }

        System.out.println("Factorial " + factorial);
    }
}