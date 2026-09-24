/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex8convertirtemperatura;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ex8ConvertirTemperatura {

    /**
     * Programa que llegeixi un valor corresponent a una temperatura en graus Fahrenheit
     * i escriviu la temperatura en graus Celsius.
     */
    public static void main(String[] args) {
        double fahrenheit,  celsius;
        final double FACTOR_CONVERSION = 0.5555555555555556; 
        Scanner teclado = new Scanner(System.in);
        // Mostrar “Introduce la temperatura en grados Fahrenheit:”
        System.out.println("Introduce la temperatura en grados Fahrenheit");
        // Esperar fahrenheit
        fahrenheit = teclado.nextDouble();
        // Calcular celsius utilizando la constante
        celsius = (fahrenheit - 32) * FACTOR_CONVERSION;
        // Mostrar celsius
        System.out.println("La temperatura en grados Celsius es " + celsius + "C");

        
       
    }
    
}
