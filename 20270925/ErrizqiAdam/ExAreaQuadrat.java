/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exareaquadrat;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ExAreaQuadrat {

    /**
     * Mostrar “Quina es la base del quadrat?”
     * Esperar base_quadrat
     * Mostrar “Quina es l’altura del quadrat?”
     * Esperar altura_quadrat
     * Calcular base_quadrat x altura_quadrat
     * Mostrar “L’area del quadrat es ” + area_quadrat + “ cm² “

     */
    public static void main(String[] args) {
        double costat_quadrat1, costat_quadrat2, area_quadrat;
       
        Scanner texto = new Scanner(System.in);
       
        System.out.println("Introdueix el costat del quadrat");
        costat_quadrat1=texto.nextDouble();
        System.out.println("Introdueix l'altre costat del quadrat");
        costat_quadrat2=texto.nextDouble();
        area_quadrat = costat_quadrat1 * costat_quadrat2;
        System.out.println("L’area del quadrat es " + area_quadrat + "cm²");
    }
   
}

