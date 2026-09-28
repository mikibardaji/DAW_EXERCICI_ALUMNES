/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex5conversiodemoneda;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ex5ConversiodeMoneda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     double euros = 0.0;
     double creditos = 0.0;
     // Mostrar cantidad de euros
     System.out.println("Introduce la cantidad de euros");
     // Esperar cantidad de euros
     euros = scanner.nextDouble();
     // Calcular los créditos
     creditos = euros * 8;
     // Mostrar resultado
     System.out.println("Los creditos ProvenShare son: " + creditos);
    }
    
}
