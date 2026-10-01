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
public class EstatMaterial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String estadoProducto;
        
        //Entrada estadoProducto
           //proceso  decisiones 
         //Salida  Si el estado es "Nuevo" o "Como nuevo", "Producto excelente. Se publicará rápidamente."
             //Si no, muestra: "Producto aceptado para el catálogo."
        System.out.print("El estado de producto es Nou, Com nou, Bo o Acceptable : " );
        estadoProducto = sc.nextLine();
        
        if (estadoProducto.equalsIgnoreCase("Nou") || estadoProducto.equalsIgnoreCase("Com nou")){
                System.out.println("Producto excelente. Se publicará rapidamente");
                      
        } else{
            System.out.println("Producto aceptado por el catálogo");
        }
        
    } 
    
}
