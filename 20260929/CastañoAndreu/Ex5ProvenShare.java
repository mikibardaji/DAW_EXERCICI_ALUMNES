/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex5conversiomoneda;

import java.util.Scanner;

/**
 *
 * @author andca
 */
public class Ex5ConversioMoneda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double euros, creditos;
        final int conversion = 8;
        Scanner teclado = new Scanner(System.in);
//Inicio
//Mostrar: “Cuántos euros tienes?”
System.out.println("Cuantos euros tienes?");
//Esperar. euros
euros = teclado.nextDouble();
//Calcular: creditos = euros * 8
creditos = euros * conversion;
//Mostrar: “Tienes ” + creditos + “ creditos”
System.out.println("Tienes " + creditos + " creditos");
//Final


    }
    
}
