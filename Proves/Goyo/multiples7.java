import java.util.Scanner;

public class multiples7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Porque numero empiezo? ");
        int num = sc.nextInt();
        int contador = 0;

        do {
            if (num % 7 == 0) {
                System.out.println(num);
                contador++;
            }
            num++;
        } while (contador < 10);
    }

}