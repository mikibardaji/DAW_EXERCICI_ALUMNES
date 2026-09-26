/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex5provenshare;

import java.util.Scanner;

/**
 *
 * @author adamg
 */
public class Ex5ProvenShare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double euros, credits;
        
        final int canviMoneda = 8;
        
        Scanner sc = new Scanner(System.in);  
        
        System.out.println("Quants euros tens?");
        euros = sc.nextDouble();
        
        credits = (double) euros * canviMoneda;
        System.out.println("Tens " + credits + " credits");
    }
    
}
