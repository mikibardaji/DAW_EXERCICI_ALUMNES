/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3provenshare;

import java.util.Scanner;

/**
 *
 * @author aer5219
 */
public class Ex3ProvenShare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double creditsAnuals, preuServei, horesServei, costServei;
        boolean comprovacio;
        int horas;
        
        Scanner teclado = new Scanner(System.in);
        // Mostrar "Quants crèdits actuals tens?"
        System.out.println("Quants credits tens?");
        // Esperar creditsActuals
        creditsAnuals = teclado.nextDouble();
        // Mostrar "Quin es el preu en crèdits per hora del servei contractat?"
        System.out.println("Quin es el preu en credits per hora del servei contractat?");
        // Esperar preuServei
        preuServei = teclado.nextDouble();
        // Mostrar "De quantes hores es el servei?"·
        System.out.println("De quantes hores es el servei?");
        // Esperar horesServei
        horesServei = teclado.nextDouble();
        // Calcular costServei = preuServei * horesServei
        costServei = preuServei * horesServei;
        // Comprovar comprovacio = creditsActuals >= costServei
        comprovacio = creditsAnuals > costServei;
        // Mostrar "Pots comprar-ho?: " + comprovacio
        System.out.println("Pots comprar-ho?: " + comprovacio);
    }
    
}
