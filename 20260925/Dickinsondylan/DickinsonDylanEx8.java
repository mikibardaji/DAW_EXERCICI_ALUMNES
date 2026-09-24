/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici8;
import java.util.Scanner;
/**
 *
 * @author myths
 */
public class Exercici8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Inicio
//Declaración variables y Scanner
    double Fahren , Celsius;
    Scanner sc = new Scanner(System.in);
//Mostrar: “Escriba la temperatura en grados Fahrenheit”
    System.out.println("Escriba la temperatura en grados Fahrenheit");
//Esperar Fahren
    Fahren = sc.nextDouble ();
//Calcular (32 Fahren − 32) * 5 / 9 = 0 Celsius
    Celsius = (Fahren - 32) * 5 / 9; 
//Mostrar: “La temperatura es  ” + Celsius
System.out.println("La temperatura en Celsius es " + Celsius);
//Fin

    }
    
}
