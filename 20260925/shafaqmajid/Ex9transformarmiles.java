/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex9transformarmiles;

import java.util.Scanner;

/**
 *
 * @author smo9104
 */
public class Ex9transformarmiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
        final int MillasaMetros = 1852;
        double milasNauticas, metros;
        
    // Mostrar cuantos miles 
    System.out.println("Dime cuantas millas nauticas has recorrido? ");
    // Erspera milasNauticas
    milasNauticas = teclado.nextDouble();
    // Calcular metros = milasNauticas * millas a metro
    metros = milasNauticas * MillasaMetros;
    //Mostrar milles en metros son .. metros
    System.out.println("En metros serian " + metros);



        
    

    }
    
}
