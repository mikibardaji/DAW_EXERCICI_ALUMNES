import java.util.Scanner;

public class condicionals5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1, num2;

        System.out.print("Agrega el primer valor ");
        num1 = sc.nextDouble();
        System.out.print("Agrega el segundo valor ");
        num2 = sc.nextDouble();

        if (num1 > num2) {
            System.out.println(num2 + "- " + num1);
    

        }

        else if (num2 > num1) {
            System.out.println(num1 + "- " + num2);

        }

        else {
            System.out.println(num1 + "- " + num1);
        }


    }

}
