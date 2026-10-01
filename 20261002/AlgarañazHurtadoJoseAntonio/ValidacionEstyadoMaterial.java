/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package validacionestyadomaterial;

import java.util.Scanner;

/**
 *
 * @author José Antonio
 */
public class ValidacionEstyadoMaterial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String estat;
        Scanner scan=new Scanner (System.in);
        System.out.println("Introduce el nombre del producto que quieres publicar: ");
        estat=scan.nextLine();
        
        if (estat.equalsIgnoreCase("Nou")|| estat.equalsIgnoreCase("Com nou")) {
            System.out.println("Producte excel'lent. Es publicarrà ràpidament");            
        }else{
            System.out.println("Producte acceptat per al catàleg");
               
        }
        
        
        
       
        
    }
    
}
