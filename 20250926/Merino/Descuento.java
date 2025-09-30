import java.util.Scanner;

public class Descuento {
   public static void main(String[] args) {
    
    Scanner sc =new Scanner (System.in);

    //Preguntar el precio
    System.out.println("¿Cuánto cuesta el producto?");
    double Precio1;
    Precio1 =sc.nextDouble();

    //Preguntar el %
    System.out.println("¿Cuánto % de descuento quieres aplicar?");
    double Porcentaje;
    Porcentaje =sc.nextDouble();

    //*Precio1 * Porcentaje = Precio2
    
    double Precio2 = Precio1 * Porcentaje;
    //Precio2 / 100 = Resultado con el descuento
    int PORCENTAJE2 = 100;
    
    double Precio3 = Precio2 / PORCENTAJE2;

    //Restar al precio original el %
    
    double PrecioFinal = Precio1 - Precio3;

    //Mostrar el resultado
    System.out.println("El precio con el % es: " + PrecioFinal);

   } 
}


