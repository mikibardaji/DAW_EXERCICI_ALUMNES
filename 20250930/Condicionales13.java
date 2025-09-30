import java.util.Scanner;

public class Condicionales13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // pedir euros
        double euro;
        System.out.println("how many euros do you want to change ?");
        euro = sc.nextDouble();
        sc.nextLine();

        // preguntar elegir en que cambiar
        char change;
        System.out.println("D - Dolars");
        System.out.println("Y - Yen ");
        System.out.println("H - Dirham");
        System.out.println("In which of the following currency do you want to change your euros into? ");

        change = sc.nextLine().charAt(0);

        switch (change) {
            case 'd':
            case 'D':
                double changeDolar = euro * 1.17;
                System.out.println(changeDolar);
                break;

            case 'y':
            case 'Y':
                double changeYen = euro * 1.17;
                System.out.println(changeDolar);
                break;
        }

        sc.close();

    }

}
