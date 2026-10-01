/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex4creditosderegalo;

import java.util.Scanner;

/**
 *
 * @author saihb
 */
public class Ex4CreditosDeRegalo {

    /**Exercici 4: Càlcul de crèdits inicials de regal
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int servicios, creditos;
        
        //Mostrar Cuanto servicios ofreceras?
        System.out.println("Cuantos servicios ofreceras?");
        
        //Esperar cantidad de cantidad de servicios
        servicios = sc.nextInt();
        
        if (servicios == 0)
        {
           creditos = 10;
        }
        else if (servicios == 1 || servicios == 2)
        {
            creditos =50;
        }
        else 
        {
            creditos = 100;
        }
        System.out.println("Creditos asignados: " + creditos);
    }
    
}
