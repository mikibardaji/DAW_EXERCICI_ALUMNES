/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3condicionales;

import java.util.Scanner;

/**
 *
 * @author cescs
 */
public class Ej3Condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nom,compta;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Diguem el teu nom");
        nom = teclado.nextLine();
        System.out.println("Ara diguem el teu rol");
        compta = teclado.nextLine();
        if (compta.equalsIgnoreCase("Administrador")) {
            System.out.println("Accés permès. Pots gestionar els usuaris.");
        }else if (compta.equalsIgnoreCase("estudiant")) {
            System.out.println("Accés denegat. Només els administradors tenen aquest permís.");
        }
    }
    
}
