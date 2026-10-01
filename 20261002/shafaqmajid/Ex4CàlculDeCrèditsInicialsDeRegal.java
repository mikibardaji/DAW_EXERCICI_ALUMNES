/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex4càlcul.de.crèdits.inicials.de.regal;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ex4CàlculDeCrèditsInicialsDeRegal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int serveis, credits;

        // Mostrar
        System.out.println("Quants serveis oferiras?");

        // Esperar
        serveis = teclado.nextInt();

       // Calcular
       if (serveis == 0)
        {
         credits = 10;
        }
       else if (serveis == 1 || serveis == 2)
        {
         credits = 50;
        }
       else
        {
         credits = 100;
        }

       // Mostrar resultado
       System.out.println("Els credits assignats son: " + credits);   
    }
    
       }
