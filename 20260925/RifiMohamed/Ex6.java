import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex6;

/**
 *
 * @author mri7869
 */
public class Ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double preu_total, descompte_percentatge, descompte_euros, cost_final;

        System.out.println("Quin és el preu total del producte?");
        preu_total = entrada.nextDouble();

        System.out.println("Quin és el percentatge de descompte ?");
        descompte_percentatge = entrada.nextDouble();

        descompte_euros = preu_total * descompte_percentatge / 100;
        cost_final = preu_total - descompte_euros;

        System.out.println("El cost final del producte és: " + cost_final );
    }
    
}
