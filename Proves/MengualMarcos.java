import java.util.Scanner;

public class Porcentaje {

    public static void main(String[] args) {
        //Preguntar el precio al al cliente
        //Guardarlo en ua variable
        //Preguntarle de cuanto es el descuento
        //Guardalo en una variable
        //Hacer el calculo del precio final multiplicando el precio por el descuento y luego dividirlo entre 100
        //Mostrar al usuario

        Scanner src = new Scanner(System.in);
        double preciooriginal;
        System.out.println(" Cual es el precio del producto? ");
        preciooriginal = src.nextDouble();
        double descuento;
        System.out.println(" Dime el porcentaje del descuento ");
        descuento = src.nextDouble();
        double preciodescuento = preciooriginal * descuento /100;
        double preciofinal = preciooriginal - preciodescuento;
        System.out.println(" Tu precio final es" + preciofinal + " euros ");




    }
}
