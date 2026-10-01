/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3el.filtre.de.l.administrador;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ex3ElFiltreDeLAdministrador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

      String nombre, rol;

       // Mostrar nombre
       System.out.println("Quin es el teu nom d'usuari?");

       // Esperar nombre
       nombre = teclado.nextLine();

       // Mostrar rol
       System.out.println("Quin es el teu rol?");

       // Esperar rol
       rol = teclado.nextLine();

       // Condición
       if (rol.equalsIgnoreCase("administrador"))
        {
          System.out.println("Acces permes. Pots gestionar els usuaris.");
        }
       else
        {
          System.out.println("Acces denegat. Nomes els administradors tenen aquest permis.");
        }

          System.out.println("Fi de l'aplicacio"); 
        }
    
}
