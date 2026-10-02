/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercisis102;

import java.util.Scanner;

/**
 *
 * @author myths
 */ 
public class Exercisis102 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
        String user, rol;
        Scanner scan=new Scanner (System.in);
        System.out.println("Introduce tu usuario ");
        user=scan.nextLine();
        System.out.println("Introduce tu rol (estudiant o administrador): ");
        rol=scan.nextLine();
        if (rol.equalsIgnoreCase("administrador")) {
            System.out.println("Acces permes.");            
        }else{
            System.out.println("Access denegat.");
    }
    
}
}   
