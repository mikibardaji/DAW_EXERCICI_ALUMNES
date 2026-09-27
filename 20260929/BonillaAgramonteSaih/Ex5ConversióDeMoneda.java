/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex5conversiódemoneda;

import java.util.Scanner;

/**
 *
 * @author saihb
 */
public class Ex5ConversióDeMoneda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double euros, creditos;
       final int provenShare = 8;
       
       //Mostrar Introdocir euros
        System.out.println("¿Cuantos euros tienes?");
       //Esperar euros
       euros = sc.nextDouble();
       //Calcular 
       creditos = euros * provenShare;
       //Mostrar resultado 
        System.out.println("tienes " + creditos + " creditos ProvenShare");
       
    }
    
}
