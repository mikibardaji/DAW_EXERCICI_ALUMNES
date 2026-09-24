/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex8conversortemperatura;

import java.util.Scanner;

/**
 *Programa que llegeixi un valor corresponent a una temperatura en graus Fahrenheit i escriviu la temperatura en graus Celsius. En aquest exercici definir una constant per el valor que s'ha de sumar, com vam fer amb PI.
 * @author saihb
 */
public class Ex8ConversorTemperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       double fahrenheit, celsius;
        
        //Mostrar Temperatura 
        System.out.println("introduce la temperaturaen Fahrenheit");
        
        //Esperar Temperatura
        fahrenheit = teclado.nextDouble();
                
        //Calcular Temperatura
        celsius = (fahrenheit - 32) * 5 / 9 ;
         
        //Mostrar Resultado 
         System.out.println("La temperatura en Celsius es: " + celsius);
        
    }
    
}
