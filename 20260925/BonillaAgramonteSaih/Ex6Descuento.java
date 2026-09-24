/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex6descuento;

import java.util.Scanner;

/**
 * Programa que donat el preu total, i el descompte (%), et digui el cost del producte.
 * @author saihb
 */
public class Ex6Descuento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        //Mostrar Precio 
        System.out.println("Introduce el precio del producto");
        
        //Esperar Precio
        double precio = teclado.nextDouble();
        
        //Mostrar Descuento
        System.out.println("Introduce el descuento");
        
        //Esperar descuento
        double descuento = teclado.nextDouble();
        
        //Calcular Importe del descuento 
        double importeDescuento = precio * descuento / 100;
        
        //Calcular Precio Final
        double precioFinal = precio - importeDescuento;
        
        //Mostrar Precio final
        System.out.println("El precio final es: " + precioFinal);
        
        
        
    }
    
}
