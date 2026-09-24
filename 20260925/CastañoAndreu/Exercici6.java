/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicisequencial6;

import java.util.Scanner;

/**
 *
 * @author andca
 */
public class ExerciciSequencial6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double precioTotal, porcentajeDescuento, descuento, precioFinal;
        Scanner teclado = new Scanner(System.in);
//Inicio
//Mostrar: “¿Cuál es el precio total del producto?”
System.out.println("¿Cual es el precio total del producto?");
//Esperar: precioTotal
precioTotal = teclado.nextDouble();
//Mostrar: “¿De cuánto es el descuento?”
System.out.println("¿De cuanto es el descuento?");
//Esperar: porcentajeDescuento
porcentajeDescuento = teclado.nextDouble();
//Calcular: descuento = precioTotal * porcentajeDescuento/100
descuento = precioTotal * porcentajeDescuento/100;
//Calcular: precioFinal = precioTotal - descuento
precioFinal = precioTotal - descuento;
//Mostrar: “El precio final del producto es de “ + precioFinal
System.out.println("El precio final del producto es de " + precioFinal);
//Fin

    }
    
}
