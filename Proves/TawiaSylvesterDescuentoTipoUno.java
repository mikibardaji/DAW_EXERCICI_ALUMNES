public class DescuentoTipoUno {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el precio original del producto:");
        double precioOriginal = sc.nextDouble();

        System.out.println("Introduce el porcentaje de descuento:");
        double descuento = sc.nextDouble();
        
        double precioConDescuento = precioOriginal - (precioOriginal * (descuento / 100));
       
        System.out.println("El precio original es: " + precioOriginal);
        System.out.println("El descuento es: " + descuento + "%");
        System.out.println("El precio con descuento aplicado es: " + precioConDescuento);

        sc.close();
    }

}


