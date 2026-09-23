/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex6descompte;

import java.util.Scanner;

/**
 *
 * @author adamg
 */
public class Ex6Descompte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double preu, descompte, costProducte;
        
        Scanner texto = new Scanner(System.in);
        System.out.println("Quin es el preu del producte?");
        preu = texto.nextDouble();
        
        System.out.println("Quin descompte te el producte?");
        descompte = texto.nextDouble();
        
        costProducte = preu * (1-descompte/100);
        System.out.println("El cost del producte es " + (int) costProducte + "€");
    }
    
}
