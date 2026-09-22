/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exarearectangle;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ExAreaRectangle {

    /**
     * Mostrar “Quina és la base del rectangle?”
     * Esperar base_rectangle
     * Mostrar “Quina és l’altura del rectangle?”
     * Esperar altura_rectangle
     * Calcular area_rectangle = base_rectangle x altura_rectangle
     * Mostrar “L’area del quadrat es ” + area_rectangle + “ cm² “

     */
    public static void main(String[] args) {
        double base_rectangle, altura_rectangle, area_rectangle;
       
        Scanner texto = new Scanner(System.in);
       
        System.out.println("Introdueix la base del rectangle");
        base_rectangle=texto.nextDouble();
        System.out.println("Introdueix l'altura del rectangle");
        altura_rectangle=texto.nextDouble();
        area_rectangle = base_rectangle * altura_rectangle;
        System.out.println("L’area del rectangle es " + area_rectangle + "cm²");
    }
   
}
