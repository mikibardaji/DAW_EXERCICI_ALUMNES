/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1.pkg8;

import java.util.Scanner;

/**
 *
 * @author dgrao
 */
public class Ex18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);
        int fahrenheit;
        double celsius;
        
        System.out.println("¿Que temperatura es en grado Fahrenheit?");
        fahrenheit = texto.nextInt();
        celsius = (fahrenheit -32)* 5 / 9;
        System.out.println("Esa temperatura a grados celsius son " + celsius);
                
    }
    
}
