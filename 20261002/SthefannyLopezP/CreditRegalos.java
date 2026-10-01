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
public class CreditRegalos {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int numeroServicios;
        
        System.out.print("Ingrese el numero de servicios que ofrecera: ");
        numeroServicios = sc.nextInt();
        
           if(numeroServicios >=3 ){
              System.out.println("Los creditos asignados son: 100");
              
           } else if(numeroServicios>=1 && numeroServicios<= 2){
               System.out.println("Los creditos asignados son: 50");
               
           }else {
               System.out.println("Los creditos asignados son: 10");
           }
              
              
            
    }
}
