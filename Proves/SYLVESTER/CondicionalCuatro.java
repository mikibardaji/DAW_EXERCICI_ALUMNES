import java.util.Scanner;

public class CondicionalCuatro {
    public static void main(String[] args) {
        // 4. Programa que llegeix un número i diu si és positiu, si és zero, o bé i és
        // negatiu.//

        Scanner sc = new Scanner(System.in);

        int Num;

        System.out.println(" tell me the value of your first number");
        Num = sc.nextInt();

        if (Num > 0) {
            System.out.println("the value entered is positive");

        } else if (Num == 0) {
            System.out.println("The value entered is 0");
        } else {
            System.out.println("the value entered is Negative");
        }

        sc.close();

    }

}
