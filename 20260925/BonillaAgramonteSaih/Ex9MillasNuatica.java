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
        final double MillasAMetros = 1852;
        double millas, metros;       
        
        //mostrar cuantas millas 
        System.out.println("¿Cuantas millas nauticas?");
        
        // esperar millas 
        millas = teclado.nextDouble();
        
        //calcular metros = millas 
       metros = millas * MillasAMetros;
       
        System.out.println("Mostrar metros " + metros);
        
        
    }
    
}
