/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3filtroadmin;

import java.util.Scanner;

/**
 *
 * @author José Antonio
 */
public class Ex3FiltroAdmin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nomUsuari, rol;
        Scanner scan=new Scanner (System.in);
        System.out.println("Introduce tu nombre de usuario ");
        nomUsuari=scan.nextLine();
        System.out.println("Introduce tu rol estudiante/Administrador: ");
        rol=scan.nextLine();
        if (rol.equalsIgnoreCase("administrador")) {
            System.out.println("Acceso permitido, puedes gestionar los usuarios.");            
        }else{
            System.out.println("Acceso denegado. Solo los administrradores tienes este permiso.");
        
        }
    }
    
}
