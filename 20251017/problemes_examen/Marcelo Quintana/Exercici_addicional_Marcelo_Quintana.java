import java.util.Scanner;

public class Exercici_addicional_Marcelo_Quintana {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        int numero;

        System.out.println("Introdueix números positius. Un número negatiu acabarà el programa.");

        while (true) {
            System.out.print("Número: ");
            numero = sc.nextInt();

            if (numero < 0) {
                break; // sortim del bucle si és negatiu
            }

            total += numero;
        }

        System.out.println("La suma total dels números positius és: " + total);

    


    }
}

