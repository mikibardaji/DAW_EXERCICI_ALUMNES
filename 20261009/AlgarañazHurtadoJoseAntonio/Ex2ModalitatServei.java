/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2modalitatservei;

import java.util.Scanner;

/**
 *
 * @author José Antonio
 */
public class Ex2ModalitatServei {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String modalitat, texto=null, enlace, lugar;
        Scanner scan=new Scanner (System.in);
        System.out.println("Prefieres clases Online o Presencial?: ");
        modalitat=scan.nextLine();
        if (modalitat.equalsIgnoreCase("Online")) {
            System.out.println("Introduce el enlace de Meet/Discord: ");
            enlace=scan.nextLine();
            texto="Servicio configurado. Enlace guardado";          
            
        }else if (modalitat.equalsIgnoreCase("Presencial")) {
            System.out.println("Introduce el lugar de encuentro: ");
            lugar=scan.nextLine();
            texto="Servicio configurado. Punto de encuentro guardado";
            
            
        }

        System.out.println(""+texto);
    }
    
}
