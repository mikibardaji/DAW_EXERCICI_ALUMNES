/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex9millasnautica;

import java.util.Scanner;

/**
 *
 * @author sbo9130
 */
public class Ex9MillasNautica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final int MillasAMetros = 1852;
        double millasNauticas, metros;       
        
        //mostrar cuantas millas 
        System.out.println("¿Dime cuantas millas nauticas haz recorrido?");
        
        // esperar millas 
        millasNauticas = teclado.nextDouble();
        
        //calcular metros = millas 
       metros = millasNauticas * MillasAMetros;
       
        System.out.println("Mostrar metros " + metros);
        
        
    }
    
}
