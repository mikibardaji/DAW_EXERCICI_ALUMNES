import java.util.Scanner;

public class Descompte {

public static void main(String[] args) throws Exception {

     Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el precio nominal del artículo: ");
        double precioNominal = sc.nextDouble();

        System.out.print("Introduce el precio de venta real: ");
        double precioVenta = sc.nextDouble();

        double descuento = precioNominal - precioVenta;
        double porcentaje = (descuento / precioNominal) * 100;

        System.out.println("El descuento aplicado es del " + porcentaje + " %");
}

}
