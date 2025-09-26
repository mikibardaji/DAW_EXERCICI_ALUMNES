import java.util.Scanner;

    public class CalculadoraDescuento {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el precio original: ");
        double precio = scanner.nextDouble();

        System.out.print("Ingrese el porcentaje de descuento: ");

        double descuento = scanner.nextDouble();

        double precioFinal = precio (precio * (descuento / 100));

        System.out.println("El precio final con descuento es: " + precioFinal "euros");
scanner.close();
        }
    }