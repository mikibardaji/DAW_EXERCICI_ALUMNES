import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Estado del producto (Nuevo, Como nuevo, Bueno, Aceptable):");
        String estado = sc.nextLine();

        if (estado.equalsIgnoreCase("nuevo") || estado.equalsIgnoreCase("como nuevo")) {
            System.out.println("Producto excelente. Se publicará rápidamente.");
        } else {
            System.out.println("Producto aceptado para el catálogo.");
        }
    }
}
