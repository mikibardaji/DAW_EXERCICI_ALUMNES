/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1estatmaterial;

import java.util.Scanner;

/**
 *
 * @author adamg
 */
public class Ex1EstatMaterial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String estatProducte;        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quin és l'estat del teu producte? ('Nou', 'Com nou', 'Bo' o 'Acceptable')");
        estatProducte = sc.nextLine();
        if (estatProducte.equalsIgnoreCase("Nou") || estatProducte.equalsIgnoreCase("Com nou")) {
            System.out.println("Producte excel·lent. Es publicarà ràpidament.");
            
        } else {
            System.out.println("Producte acceptat per al catàleg.");
        }
    }
    
}
