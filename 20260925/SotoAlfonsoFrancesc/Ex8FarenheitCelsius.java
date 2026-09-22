/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex8farenheitcelsius;

import java.util.Scanner;

/**
 *
 * @author cescs
 */
public class Ex8FarenheitCelsius {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double temperatura, celsius;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime que temperatura hace");
        temperatura = teclado.nextDouble();
        celsius = (temperatura - 32) / 1.8;
        System.out.println("La temperatura en celsius es "+celsius+"º");
    }
    
}
