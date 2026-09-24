/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex6cost.del.producte;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ex6CostDelProducte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double preuTotal,  descomptePercentatge, preuFinal;
        Scanner teclado = new Scanner(System.in);
        // Mostrar “Cuál es el precio total del producto?”
        System.out.println("Cual es el precio total del producto?");
        // Esperar precioTotal 
        preuTotal = teclado.nextDouble();
        // Mostrar “¿Qué porcentaje de descuento tiene (%)?”
        System.out.println("Que porcentaje de descuento tiene (%)?");
        // Esperar descuentoPorcentaje
        descomptePercentatge = teclado.nextDouble();
        // Calcular descuento y precio final
        double dineroDescontado = preuTotal * (descomptePercentatge / 100.0);
        preuFinal = preuTotal - dineroDescontado;
        // Mostrar precio final
        System.out.println("El coste final del producto es " + preuFinal);
         
        
        
        // TODO code application logic here
    }
    
}
