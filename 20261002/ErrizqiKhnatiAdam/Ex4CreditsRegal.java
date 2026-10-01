/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex4creditsregal;

import java.util.Scanner;

/**
 *
 * @author adamg
 */
public class Ex4CreditsRegal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int quantitatServeis, credits;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Quants serveis ofereixes?");
        quantitatServeis = sc.nextInt();

        credits = 0;
        if (quantitatServeis == 0) {
            credits += 10;
        } else if (quantitatServeis == 1 || quantitatServeis == 2) {
            credits += 50;
        } else if (quantitatServeis >= 3) {
            credits += 100;
        }
        
        System.out.println("Tens " + credits + " credits");
    }
    
}
