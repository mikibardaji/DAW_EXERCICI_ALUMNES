import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el precio del producto: ");
        int precio = sc.nextInt();

        System.out.print("Introduce el precio que pagaste: ");
        int pago = sc.nextInt();

        int result = pago - precio;

        if (result > 0) {
            System.out.println("Sobren: " + result + "€");
        } else {

            result = -result;
            System.out.println("Falten: " + result + "€");

        }

        sc.close();

    }
}
