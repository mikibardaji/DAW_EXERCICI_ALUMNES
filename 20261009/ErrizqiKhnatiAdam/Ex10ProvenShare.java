/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex10provenshare;

import java.util.Scanner;

/**
 *
 * @author adamg
 */
public class Ex10ProvenShare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String correu, llocEstudis, missatge;
        
        Scanner txt = new Scanner(System.in);
        
        System.out.println("Introdueix el teu correu");
        correu = txt.nextLine();
        
        System.out.println("Quin es el teu lloc d'estudis (Universitat o Institut)?");
        llocEstudis = txt.nextLine();
        
        missatge = "";
        if (llocEstudis.equalsIgnoreCase("Universitat")) {
            if (correu.endsWith(".edu") || correu.endsWith(".cat")) {
               missatge = "Correu oficial validat."; 
            } else {
               missatge = "Error: L'extensió no correspon al teu centre d'estudis.";

            }
            
        }
        if (llocEstudis.equalsIgnoreCase("Institut")) {
            if (correu.endsWith(".es") || correu.endsWith(".cat")) {
               missatge = "Correu oficial validat."; 
            } else {
               missatge = "Error: L'extensió no correspon al teu centre d'estudis.";

            }
        }
        System.out.println(missatge);
    }
    
}
