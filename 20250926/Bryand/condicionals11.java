import java.util.Scanner;

public class condicionals11 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double precio, dinero;
    System.out.print("Precio del producto: ");
    precio = sc.nextDouble();

    System.out.print("Cuanto has pagado? ");
    dinero = sc.nextDouble();

    if (  precio > dinero) {

        double debe = precio - dinero;
        System.out.println("Te queda pagar " + debe);
    }

    else if (dinero > precio  ) {

        double cambio = dinero - precio;
        System.out.print("El cambio es de " + cambio); 
    }

}


}