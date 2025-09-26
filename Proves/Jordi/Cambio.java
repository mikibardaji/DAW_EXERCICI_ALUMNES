import java.util.Scanner;

public class Cambio {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*Un programa para saber cuanto dinero me va a sobrar si compro un artículo*/ 
        // Variable para dinero y precio
        double dinero, precio;
        //Preguntar al usuario el dinero que tengo
        System.out.println("Pon el dinero que tienes: ");
        dinero = sc.nextDouble();
        //Preguntar al usuario el precio
        System.out.println("Pon el precio del artículo: ");
        precio = sc.nextDouble();
        //Restar dinero que tengo del precio (cambio)
        double cambio = dinero - precio;
        //Mostar al usuario el cambio
         System.out.println("Te quedará: " + cambio + " euros");




    }

}
