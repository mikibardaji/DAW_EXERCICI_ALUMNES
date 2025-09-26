import java.util.Scanner;

public class condicionals4 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double num1;
        System.out.print("Escribe el numero ");
        num1 = sc.nextDouble();

        if (num1 > 0){

            System.out.println("Aquest numero és positiu");
        }

        else if (num1 < 0){

            System.out.println("Aquest numero és negatiu");
        }

        else {
            System.out.println("Aquest numero és cero");

        }

    }
}