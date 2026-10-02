/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercisis102;

import java.util.Scanner;

/**
 *
 * @author gba0006
 */
public class Exercisi1 {
    public static void main(String[] args) {
    String estat;
        Scanner scan=new Scanner (System.in);
        System.out.print("Introdueix l'estat del producte que vols publicar: ");
        estat=scan.nextLine();
        
        if (estat.equalsIgnoreCase("Nou")|| estat.equalsIgnoreCase("Com nou")) {
            System.out.println("Producte excel·lent.");            
        }else{
            System.out.println("Producte acceptat");
               
        }
    
}
}
