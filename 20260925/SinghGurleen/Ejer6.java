/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package classe.ejer6;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Ejer6 {

   public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double precio_total ,descuento,coste;
       
        //Mostrar "Precio total"
        System.out.println("Cual es precio total?");
        //Esperar precio_total
        precio_total = teclado.nextDouble();
        //Mostrar "Descuento"
        System.out.println("Cuanto es descuento?");
        //Esperar descuento
        descuento  = teclado.nextDouble();
        //Calcular
        coste = precio_total  - (precio_total  * descuento / 100);
        //Mostrar "El precio total" coste
        System.out.println("precio_total " + coste + "€");

               

    }
}
