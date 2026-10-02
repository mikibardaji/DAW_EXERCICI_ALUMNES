/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici4projecteprovenshare;

import java.util.Scanner;

/**
 *
 * @author andca
 */
public class Exercici4ProjecteProvenShare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner teclado = new Scanner(System.in);
         int servicios, creditos;

    // Mostrar "Cuantos servicios ofreceras?"
    System.out.println("Cuantos servicios ofreceras? ");

    // Esperar servicios
    servicios = teclado.nextInt();

    // Si servicios = 0
    if (servicios == 0)
        {
        // Calcular creditos = 10
        creditos = 10;

        }
    // Si no, si servicios es menor o igual a 2
    else if (servicios <= 2)
        {

        // Calcular creditos = 50
        creditos = 50;
        }
    // Si no
    else 
        {

        // Calcular creditos = 100
        creditos = 100;
        }

    // Mostrar creditos
    System.out.println("Los creditos asignados son " + creditos);
    }
    
}
