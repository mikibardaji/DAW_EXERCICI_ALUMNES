import java.util.Scanner;

public class Ex4 {
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int numeros;
    int numeroNatural;
    System.out.println("Intriduce un numero Natural");
    numeroNatural=sc.nextInt();

    for (numeros=1; numeros<numeroNatural;numeros++)
    {
        System.out.println(numeros);
        sc.close();
    }
    sc.close();
}
}
