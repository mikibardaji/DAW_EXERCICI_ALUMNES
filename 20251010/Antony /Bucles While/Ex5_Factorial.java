import java.util.Scanner;

public class Ex5_Factorial {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Que factorial quieres saber?");
    int numero = sc.nextInt();
    int factorial_acum=1;

    for ( int i = 1; i <= numero; i++)
    {//asi obtendre el 1,2,3,4,5
        System.out.print(i + "X" + factorial_acum);
        factorial_acum = factorial_acum * i;
        System.out.println( "=" + factorial_acum);
    }
    System.out.println("Factorial -> " + factorial_acum);
    sc.close();
}
}
