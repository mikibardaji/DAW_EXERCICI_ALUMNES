/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex9disponibilitathoraria;

import java.util.Scanner;

/**
 *
 * @author José Antonio
 */
public class Ex9DisponibilitatHoraria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String franja, modalitat, texto;
        Scanner scan=new Scanner (System.in);
        System.out.println("Que franja quieres? Mañana/Tarde ");
        franja=scan.nextLine();
        System.out.println("Que modalidad quieres? Online/Presencial ");
        modalitat=scan.nextLine();
        if (franja.equalsIgnoreCase("Mañana")&& modalitat.equalsIgnoreCase("Online")
                
                ||franja.equalsIgnoreCase("Tarde")&& modalitat.equalsIgnoreCase("Presencial")) {
            
            texto="Reserva confirmada amb l'expert.";           
            
        }else{
            texto="L'expert no està disponible en aquesta franja per a aquesta modalitat.";
        
        }
        System.out.println(""+texto);
    }
    
}
