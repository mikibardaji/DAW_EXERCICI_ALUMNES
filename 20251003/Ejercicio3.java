import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

                /*Algoritme:
        final int precioentrada = 20;
        final double descuento 10 = 0.9;
        final double descuento 5 = 0.95;
        final double iva = 1.21;

        preguntar nº de entradas
        si 1 entrada
            entrada * iva
        si 2 entradas
            entrada * descuento 10
            entrada + entrada con descuento 10
            precio total * iva
        si más de 2 entradas
            entrada * descuento 5
            precio total * iva
            entrada * preciototal+iva
*/

        final int precioentrada = 20;
        final double descuento10 = 0.9;
        final double descuento5 = 0.95;
        final double iva21 = 1.21;
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuántas entradas vas a comprar?");
        int entrada = sc.nextInt();
        
        
        if (entrada == 1) 
        {   
            double precioentrada1iva = precioentrada * iva21;
            System.out.println("Por la compra de " + entrada + " entrada no se aplica descuento. El precio de la entrada más IVA es " + precioentrada1iva + " EUR.");
        }
         else if (entrada == 2) 
        {
            double precioentrada1iva = precioentrada * iva21;
            double entrada10dto = precioentrada * descuento10;
            double precioentrada2iva = entrada10dto * iva21;
            double preciototal = precioentrada1iva + precioentrada2iva;
            System.out.println("El descuento por la compra de " + entrada + " entradas, es del 10% en la segunda entrada. El precio de la segunda entrada es de " + entrada10dto + "EUR. El precio total de las entradas con IVA es de " + preciototal + " EUR.");
        }
        else if (entrada > 2) 
        {
            double entrada5dto = precioentrada * descuento5;
            double precioentrada3iva = entrada5dto * iva21;
            double preciototal2 = entrada * precioentrada3iva;
            System.out.println("Por la compra de " + entrada + " entradas, el precio final más IVA es de " + preciototal2 + " EUR");
        }
        }

}






