
import java.util.Scanner;

public class Cambio {
public static void main(String[] args) {
    //Un programa para saber cuanto dinero me va a sobrar si compro un articulo
    Scanner sc = new Scanner(System.in);

    //Variable para dinero que tengo, variable para el precio
    double dinero, precio;

    //Preguntar al usuario cuanto tiene
    System.out.println("Pon el dinero que tienes: ");
    dinero = sc.nextDouble();

    //Preguntar al usuario el precio
    System.out.println("Pon el precio del producto: ");
    precio = sc.nextDouble();

    //Restar dinero que tengo del precio (cambio)
    double cambio= dinero - precio;
    
    //Mostrar el cambio    
    System.out.println("El cambio es = " + cambio + "euros.");
}
}
