/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici1projecteprovenshare;

import java.util.Scanner;

/**
 *
 * @author andca
 */
public class Exercici1ProjecteProvenShare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        String estadoProducto;

    // Mostrar "Cuál es el estado del producto?"
    System.out.println("Cual es el estado del producto? ");

    // Esperar estado
    estadoProducto = teclado.nextLine();

    // Si estado es "Nuevo" o "Como nuevo"
    if (estadoProducto.equalsIgnoreCase("Nuevo") || estadoProducto.equalsIgnoreCase("Como nuevo"))
        {

        // Mostrar "Producto excelente. Se publicará rápidamente."
        System.out.println("Producto excelente. Se publicara rapidamente.");

    // Si no
        } 
    else
        {

          // Mostrar "Producto aceptado para el catálogo."
          System.out.println("Producto aceptado para el catalogo.");
        }
    }
    
}
