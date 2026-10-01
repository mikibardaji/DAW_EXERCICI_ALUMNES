/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modalitatdeservei;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ProjectoProvenShareModalitatdeservei {

    /**
     * Quan un estudiant publica un servei,
     * el programa demanarà si és "Online" o "Presencial". 
     * Segons la modalitat seleccionada, 
     * mostrarà el tipus de servei. 
     */
    public static void main(String[] args) {
        String modalitat;
        Scanner teclado = new Scanner(System.in);
        // Mostrar
         System.out.println("Quina es la modalitat del servei? ");

        // Esperar
         modalitat = teclado.nextLine();

        // Condició
        if (modalitat.equalsIgnoreCase("Online"))
         {
          System.out.println("El servei es Online.");
         }
      else if (modalitat.equalsIgnoreCase("Presencial"))
         {
           System.out.println("El servei es Presencial.");
         }
      else
         {
           System.out.println("Modalitat no valida.");
         }

         System.out.println("Fin  de l'aplicacio");
        
    }
    
}
