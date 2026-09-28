/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package py1.pkg5;

import java.util.Scanner;

/**
 *
 * @author dgrao
 */
public class Py15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner texto = new Scanner(System.in);
    final int cambio = 8;
    double euros, creditos;
    
        System.out.println("¿Cuantos euros quieres cambiar?");
        euros = texto.nextDouble();
        creditos = euros * cambio;
        System.out.println("Esos euros equivalen a " + creditos + " creditos.");
    }
    
}
