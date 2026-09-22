/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerdescuento;

import java.util.Scanner;

/**
 *
 * @author José Antonio
 */
public class ExerDescuento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double precio_SinDescuento, porcentaje_descuento, precio_conDescuento, descuento;
       Scanner scan=new Scanner (System.in);
        System.out.println("Cual es el precio sin descuento?: ");
        precio_SinDescuento=scan.nextDouble();
        System.out.println("Cual es el porrcentaje de descuento?: ");
        porcentaje_descuento=scan.nextDouble();
        
        descuento=precio_SinDescuento*porcentaje_descuento/100;
        precio_conDescuento=precio_SinDescuento-descuento;
        
        System.out.println("El precio con descuento es de: "+precio_conDescuento);
                
        
        
        
    }
    
}
