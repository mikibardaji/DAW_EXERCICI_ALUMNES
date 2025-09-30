import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el color: ");
        String color = sc.nextLine().toUpperCase();

        if (color.equals("V")) {
            System.out.println("Passar");
        } else if (color.equals("T")) {
            System.out.println("Córrer");
        } else if (color.equals("R")) {
            System.out.println("Esperar");
        } else {
            System.out.println("No se reconoce el color: " + color);

        }

        sc.close();
    }
}
