/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici3projecteprovenshare;

import java.util.Scanner;

/**
 *
 * @author andca
 */
public class Exercici3ProjecteProvenShare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
    String nombre, rol;

    // Mostrar "Cuál es tu nombre?"
    System.out.print("Cual es tu nombre? ");

    // Esperar usuario
    nombre = teclado.nextLine();

    // Mostrar "Cuál es tu rol?"
    System.out.print("Cual es tu rol? ");

    // Esperar rol
    rol = teclado.nextLine();

    // Si rol es "administrador"
    if (rol.equalsIgnoreCase("administrador"))
        {

        // Mostrar "Acceso permitido. Puedes gestionar los usuarios."
        System.out.println("Acceso permitido. Puedes gestionar los usuarios.");

        } 
    // Si no
    else
        {

        // Mostrar "Acceso denegado. Solo los administradores tienen este permiso."
        System.out.println("Acceso denegado. Solo los administradores tienen este permiso.");
        }
    }
    
}
