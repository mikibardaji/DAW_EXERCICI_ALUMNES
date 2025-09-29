// Pedir precio
// Pedir dinero
// diferencia = dinero - precio

// Si diferencia == 0 → Mostrar "Pago exacto"
// Si diferencia > 0 → Mostrar "Sobran X euros"
// Si diferencia < 0 → Mostrar "Faltan X euros"

import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) throws Exception {
         Scanner sc = new Scanner(System.in); 
         double precio , dinero; 
          System.out.println("Introduce el precio del producto  ");
         precio = sc.nextDouble();

         System.out.println("Introduce el dinero que tienes  ");
         dinero = sc.nextDouble();
         
      if (dinero > precio ){

            double canvio = precio - dinero ;
            System.out.println(" Sobran " + canvio );

        }
        else if (dinero < precio ){

            double faltadinero = precio - dinero;
            System.out.println(" Faltan  "  + faltadinero);
        }
        else {

            System.out.println(" El pago es exacto ");
        }


    }
}
    


