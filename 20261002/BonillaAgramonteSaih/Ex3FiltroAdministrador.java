/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3filtroadministrador;

import java.util.Scanner;

/**
 *
 * @author saihb
 */
public class Ex3FiltroAdministrador {

    /**Exercici 3: El filtre de l'Administrador
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String usuario, rol;
        
        //Mostrar Introduce tu usuario
        System.out.println("Introduce tu usuario");
        
        //Esperar Usuario
        usuario = sc.nextLine();
        
        //Mostrar Introduce tu rol 
        System.out.println("Introduce tu rol");
        
        //Esperar Rol
        rol = sc.nextLine();
        
        if (rol.equalsIgnoreCase("Administrador"))
        {
            System.out.println("Acceso permitido. Puedes gestionar a los usuarios");
        }
        else 
        {
            System.out.println("Acceso denegado. Solo los administradores tienen este permiso");  
        }
        
    }
    
}
