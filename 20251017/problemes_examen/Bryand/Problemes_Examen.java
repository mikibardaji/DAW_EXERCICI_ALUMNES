import java.util.Scanner;

public class Problemes_Examen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pares = 0;
        int nones = 0;
        int resta = 0;

        System.out.print("Contador de numeros ");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Introduce el numero " + i + ": ");
            int num = sc.nextInt();

            resta -= num;

            if (num % 2 == 0) {
                pares++;
            } else {
                nones++;
            }
        }

        System.out.println("Resultats:");
        System.out.println("Números parells: " + pares);
        System.out.println("Números senars: " + nones);
        System.out.println("Suma total: " + resta);

    }
}