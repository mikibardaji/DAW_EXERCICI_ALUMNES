/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicisequencial8;

import java.util.Scanner;

/**
 *
 * @author andca
 */
public class ExerciciSequencial8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double gradosFahrenheit, gradosCelsius;
        Scanner teclado = new Scanner(System.in);
//Inicio
//Mostrar: “¿Cuál es la temperatura en grados Fahrenheit?”
System.out.println("¿Cual es la temperatura en grados Fahrenheit?");
//Esperar: gradosFahrenheit
gradosFahrenheit = teclado.nextDouble();
//Calcular: gradosCelsius = (gradosFahrenheit - 32) * 5 / 9
gradosCelsius = (gradosFahrenheit - 32) * 5/9;
//Mostrar: “La temperatura en grados Celsius es de “ + gradosCelsius + “ oC”
System.out.println("La temperatura en grados Celsius es de " + gradosCelsius + " oC");
//Fin

    }
    
}
