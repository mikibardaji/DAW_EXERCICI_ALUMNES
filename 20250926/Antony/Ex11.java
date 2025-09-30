import java.util.Scanner;

public class CalculoPago {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Precio en €: ");
        double precio = scanner.nextDouble();
        
        System.out.print("Cantidad pagada en €: ");
        double pago = scanner.nextDouble();
        
        if (pago > precio) {
            System.out.println("Sobran " + (pago - precio) + "€");
        } else if (pago < precio) {
            System.out.println("Faltan " + (precio - pago) + "€");
        } else {
            System.out.println("Pago exacto");
        }
        
        scanner.close();
    }
}
