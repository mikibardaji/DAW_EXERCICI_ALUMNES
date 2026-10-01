/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1validacionestadomaterial;

import java.util.Scanner;

/**
 *
 * @author saihb
 */
public class Ex1ValidacionEstadoMaterial {

    /**Exercici 1: Validació de l'estat del material
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String estado;
        
        //Mostrar Estado del producto
        System.out.println("Cual es el estado del producto?");
        
        //Esperar Estado del producto
        estado = sc.nextLine();
        
        //entrara aqui si escribimos Nuevo o Como nuevo
        if (estado.equalsIgnoreCase("Nuevo") || estado.equalsIgnoreCase("Como nuevo"))
        {
            System.out.println("Producto excelente. Se publicara rapidamente.");
        }
        //entrara aqui si escribimos otra cosa
        else
        {
            System.out.println("Producto aceptado para el catalogo"); 
        }
    }
    
}
