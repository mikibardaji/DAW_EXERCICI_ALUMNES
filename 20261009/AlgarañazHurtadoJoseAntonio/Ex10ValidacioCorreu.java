/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex10validaciocorreu;

import java.util.Scanner;

/**
 *
 * @author José Antonio
 */
public class Ex10ValidacioCorreu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String correu, llocEstudis, texto=null;
        Scanner scan=new Scanner (System.in);
        System.out.println("Introduce tu correo electronico: ");
        correu=scan.nextLine();
        System.out.println("Estas en la Universidad o en un Instituto?: ");
        llocEstudis=scan.nextLine();
        if (llocEstudis.equalsIgnoreCase("Universidad") && correu.endsWith(".edu")|| correu.endsWith(".cat")) {
            
            texto="Correu oficial validat.";
            
        }else if (llocEstudis.equalsIgnoreCase("Instituto") && correu.endsWith(".es")|| correu.endsWith(".cat")) {
            texto="Correu oficial validat.";
            
        }else{
            texto="Error: L'extensió no correspon al teu centre d'estudis.";
        
        }
        System.out.println(""+texto);
    }
    
}
