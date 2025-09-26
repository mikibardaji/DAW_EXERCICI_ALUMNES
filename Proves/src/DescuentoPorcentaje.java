import java.util.Scanner;

public class DescuentoPorcentaje {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    double precio, precio_descontado, precio_100, rebaja;
    System.out.print("Que precio tiene el articulo?");
    precio = sc.nextDouble();
    System.out.print("Que precio has pagado?");
    precio_descontado = sc.nextDouble();
    
    precio_100 = 100 * precio_descontado / precio;
    System.out.println("=> " + precio_100);

    rebaja = 100 - precio_100;

    System.out.println("Has obtenido un descuento de " + rebaja + "%");

    }
}