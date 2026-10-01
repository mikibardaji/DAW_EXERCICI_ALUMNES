/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provensharecondicionales;

import java.util.Scanner;

/**
 *
 * @author sthef
 */
public class FiltroAdmin {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String usuario;
        String rol;
        
        System.out.print("Ingrese su nombre de usuario: ");
        usuario = sc.nextLine();
        System.out.print("Eres estudiante o administrador: ");
        rol = sc.nextLine();
        
        if(rol.equalsIgnoreCase("administrador")){
            System.out.println("Acceso permitido. Puedes gestionar los usuarios.");
       
        } else {
            System.out.println("Acceso denegado. Solo los administradores tienen permiso.");
        }  
  }
}
