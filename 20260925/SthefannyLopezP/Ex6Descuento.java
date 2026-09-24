/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex6descuento;

import java.util.Scanner;

/**
 *
 * @author sthef
 */
public class Ex6Descuento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO code application logic here
        //entrada -- precioTotal, descuento
        double precioTotal, descuento, costoProducto;
        
        //proceso--costoProducto = precioTotal - (precioTotal*descuento/100)
        //salida-- costoProducto
        //mostrar "Introduce el precio total"
        System.out.print("Introduce el precio total: ");
        //esperar precioTotal
        precioTotal = sc.nextDouble();
        //mostrar "Introduce el descuento"
        System.out.print("Introduce el descuento: ");
        //esperar descuento
        descuento = sc.nextDouble();
        
        //calcular costoProducto = precioTotal-(precioTotal*descuento/100)
        costoProducto = precioTotal - (precioTotal*descuento/100);
        
        //mostrar "El costo de producto es: " + costoProducto
        System.out.println("El costo del producto es: "+ costoProducto);
        
    }
    
}
