import java.util.Scanner;

public class CondicionalSiete {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1;
        int n2;
        int n3;

        System.out.println(" tell me the value of your first number");
        n1 = sc.nextInt();

        System.out.println(" tell me the value of your second number");
        n2 = sc.nextInt();

        System.out.println(" tell me the value of your third number");
        n3 = sc.nextInt();

        if (n1 >= n2 && n1 >= n3) {
            System.out.println("Number "+n1+ " is thE biggest");

        } else if (n2 >= n1 && n1 >= n3) {
            System.out.println("Number "+n2+ " is thE biggest");
        }

        else if (n3 >= n1 && n3 >= n2) {
            System.out.println("Number "+n3+ " is thE biggest");
        }

        sc.close();

    }
}
