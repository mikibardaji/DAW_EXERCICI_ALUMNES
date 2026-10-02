/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercisis102;

import java.util.Scanner;

/**
 *
 * @author gba0006
 */ 
public class Exercisis102 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
        String user, rol;
        Scanner scan=new Scanner (System.in);
        System.out.println("Introdueix el teu usuari ");
        user=scan.nextLine();
        System.out.println("Introdueix el teu rol (estudiant o administrador): ");
        rol=scan.nextLine();
        if (rol.equalsIgnoreCase("administrador")) {
            System.out.println("Acces permes.");            
        }else{
            System.out.println("Access denegat.");
    }
    
}
}   
