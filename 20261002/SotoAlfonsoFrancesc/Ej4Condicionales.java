/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej4condicionales;

import java.util.Scanner;

/**
 *
 * @author cescs
 */
public class Ej4Condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String serveis;
        double credits = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Diguem cuants serveis ofereiras");
        serveis = teclado.nextLine();
        if (serveis.equalsIgnoreCase("0")) {
            System.out.println("Rebras 10 credits");
            credits += 10;
        }else if (serveis.equalsIgnoreCase("1")) {
            System.out.println("Rebras 50 credits");
            credits += 50;
        }else if (serveis.equalsIgnoreCase("2")) {
            System.out.println("Rebras 50 credits");
            credits += 50;
        }else if (serveis.equalsIgnoreCase("3")) {
            System.out.println("Rebras 100 credits");
            credits += 100;
        }else {
            System.out.println("Rebras 100 credits");
            credits += 100;
        }
        System.out.println("Tens "+credits+" credits");
    }
    
}
