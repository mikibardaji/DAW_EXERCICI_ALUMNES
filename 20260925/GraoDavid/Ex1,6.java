/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1.pkg6;

import java.util.Scanner;

/**
 *
 * @author dgrao
 */
public class Ex16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);
        double precio, perc_descuento, descuento, precio_final;
        
        System.out.println("¿Cual es el precio total del producto?");
        precio = texto.nextDouble();
        System.out.println("¿Y cual es el descuento del producto?");
        perc_descuento = texto.nextDouble();
        descuento = precio * perc_descuento / 100;
        precio_final = precio - descuento;
        System.out.println("El coste final del producto es de " + precio_final);
    }
    
}
