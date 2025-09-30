import java.util.Scanner;

public class Ex13 {
   public static void main(String[] args) {
    
    Scanner sc =new Scanner (System.in);

    /*Desenvolupeu un programa que entri un import en euros, mostri un menú amb diferents monedes,
llegeixi el nom de la moneda i mostri la conversió a la moneda escollida.

Pedir €
Mostrar menú de monedas
Preguntar moneda
Si moneda = 1
   Euros = cambio.dolares*/

   System.out.println("¿Cuántos euros quieres cambiar?");
   double euros1;
   euros1 = sc.nextDouble();

   System.out.println("Elige la moneda a la que quieres cambiar:");
   System.out.println("1. Dólares");
   System.out.println("2. Yenes");
   System.out.println("3. Libra");
   System.out.println("Elige un número:");
   int moneda;
   moneda= sc.nextInt();
   double conversión;

   switch (moneda) {
      case 1: 
         conversión= euros1 * 1.16;
         System.out.println(euros1 + " es igual a " + conversión + " Dólares");
         break;

      case 2: 
         conversión= euros1 * 173;
         System.out.println(euros1 + " es igual a " + conversión + " Yenes");
          break;

      case 3: 
         conversión= euros1 * 0.87;
         System.out.println(euros1 + " es igual a " + conversión + " Libras");
          break;
      default:
      System.out.println("Opción errónea, elige entre 1-3");
         break;
   }
   }

}
