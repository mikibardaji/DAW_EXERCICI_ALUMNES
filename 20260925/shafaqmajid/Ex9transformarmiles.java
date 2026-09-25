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
        double MilesaMetros = 1852;
        double miles, metros;
        
    // Mostrar cuantos miles 
    System.out.println("Cuantos miles hay");
    // Erspera milla
    miles = teclado.nextDouble();
    // Calcular metros = milles * miles a metro
    metros = miles * MilesaMetros;
    //Mostrar milles en metros son .. metros
    System.out.println("milles en metros son " + metros);



        
    

    }
    
}
