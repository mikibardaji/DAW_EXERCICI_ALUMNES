/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2provenshare;

import java.util.Scanner;

/**
 *
 * @author adamg
 */
public class Ex2ProvenShare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String eleccio, missatge;
        Scanner txt = new Scanner(System.in);
        
        System.out.println("Quin servei vols contractar (Online o Presencial)?");
        eleccio = txt.nextLine();
        
        if (eleccio.equalsIgnoreCase("Online")) {
            missatge = "Servei configurat. Enllaç desat.";
        } else if (eleccio.equalsIgnoreCase("Presencial")) {
            missatge = "Servei configurat. Punt de trobada desat.";
        } else {
            missatge = "Error";
        }
        
        System.out.println(missatge);
    }
    
}
