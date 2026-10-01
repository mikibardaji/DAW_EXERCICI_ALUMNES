/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3administrador;

import java.util.Scanner;

/**
 *
 * @author adamg
 */
public class Ex3Administrador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String rolUsuari;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("El teu rol (estudiant o administrador):");
        rolUsuari = sc.nextLine();
        if (rolUsuari.equalsIgnoreCase("administrador")) {
            System.out.println("Accés permès. Pots gestionar els usuaris.");
        } else {
            System.out.println("Accés denegat. Només els administradors tenen aquest permís.");
        }
    }
    
}
