//Preguntar el precio real al Usuario
//Preguntar el Precio de descuento
//calculrar el descuento
//calcular el porcentaje
//mostrar el precio del articulo
import java.util.Scanner;

public class Actividad6 {


    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double preciooriginal;
    double preciodescuento;

     System.out.println(" Precio original del articulo  ?  ");
    preciooriginal = sc.nextDouble();


    System.out.println("Que descuento tiene este producto?  ");
    preciodescuento = sc.nextDouble();
    
     double descuento = preciooriginal * preciodescuento / 100;
     double preciofinal = preciooriginal - descuento;

     System.out.println("El precio del articulo con el descuento es de: "  + preciofinal);



    }
}
 

