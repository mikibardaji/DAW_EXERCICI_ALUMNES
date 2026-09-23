/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex8temperatura;

import java.util.Scanner;

/**
 *
 * @author adamg
 */
public class Ex8Temperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double farenheit;
        
        Scanner texto = new Scanner(System.in);
        System.out.println("Introdueix la temperatura en Farenheit");
        farenheit = texto.nextDouble();
        
        final double celsius = (farenheit - 32) * 5/9;
        System.out.println("La temperatura en celsius son " + celsius + "ºC");
    }
    
}
