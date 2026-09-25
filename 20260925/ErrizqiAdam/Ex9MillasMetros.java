/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex9millasmetros;

import java.util.Scanner;

/**
 *
 * @author aer5219
 */
public class Ex9MillasMetros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int MILLASAMETROS = 1852;
        double millas, metros;
        
        Scanner texto = new Scanner(System.in);
        
        //Mostrar "Cuantas millas nauticas quieres convertir?"
        System.out.println("Cuantas millas nauticas quieres convertir?");
        //Esperar millas
        millas=texto.nextDouble();
        
        //Calcular metros
        metros = millas * MILLASAMETROS;
        
        //Mostrar "Son " + metros + "m"
        System.out.println("Tus millas nauticas son " + metros + "m");
    }
    
}
