/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exertemperatura;

import java.util.Scanner;

/**
 *
 * @author José Antonio
 */
public class ExerTemperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double Fahrenheit, Celsius;
        Scanner scan=new Scanner (System.in);
        System.out.println("Introduce la temperaturra en grados Fahrenheit: ");
        Fahrenheit=scan.nextDouble();
        Celsius=(Fahrenheit-32)*5/9;
        System.out.println("La temperatura en Celsius es de: "+ Celsius+" Cº");
    }
    
}
