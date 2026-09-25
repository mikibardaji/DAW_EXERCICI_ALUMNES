/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversiomoneda;

import java.util.Scanner;

/**
 *
 * @author José Antonio
 */
public class ConversioMoneda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double euro, creditos;
        final int equival=8;
        Scanner scan=new Scanner (System.in);
        System.out.println("Intrroduce cuantos euros quieres canviar: ");
        euro=scan.nextDouble();
        creditos=(double)euro*equival;
        System.out.println("Eso equivale a "+creditos+" creditos");
    }
    
}
