/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exEstatprod2;

import java.util.Scanner;
  
/**
 *
 * @author myths
 */
public class Exercisi1 {
    public static void main(String[] args) {
    String estat;
        Scanner scan=new Scanner (System.in);
        System.out.print("Introduce el estado del producto que quieres publicar: ");
        estat=scan.nextLine();
        
        if (estat.equalsIgnoreCase("Nuevo")|| estat.equalsIgnoreCase("Como nuevo")) {
            System.out.println("Producto excelente.");            
        }else{
            System.out.println("Producto aceptado");
               
        }
    
}
}
