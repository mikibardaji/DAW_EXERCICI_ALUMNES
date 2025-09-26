import java.util.Scanner;

public class CondicionalCinco {
    public static void main(String[] args) {
        // 5. Programa que llegeix dos números i els visualitza en ordre ascendent.

        Scanner sc = new Scanner(System.in);

        int NumUno;
        int NumDos;

        System.out.println(" tell me the value of your first number");
        NumUno = sc.nextInt();

        System.out.println(" tell me the value of your second number");
        NumDos = sc.nextInt();

        if (NumUno > NumDos) {
            System.out.println("the number in order is " + NumDos + "," + NumUno);

        } else {
            System.out.println("the number in order is " + NumUno + "," + NumDos);
        }

        sc.close();

    }

}
