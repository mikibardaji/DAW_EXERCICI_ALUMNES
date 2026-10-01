/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej1condicionales;

import java.util.Scanner;

/**
 *
 * @author cescs
 */
public class Ej1Condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String estado;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime el estado del producto");
        estado = teclado.nextLine();
        if (estado.equalsIgnoreCase("Nou")) {
            System.out.println("Producte excel·lent. Es publicarà ràpidament.");
        }else if (estado.equalsIgnoreCase("Com nou")) {
            System.out.println("Producte excel·lent. Es publicarà ràpidament.");
        }else if (estado.equalsIgnoreCase("Bo")) {
            System.out.println("Producte acceptat per al catàleg.");
        }else if (estado.equalsIgnoreCase("Accetable")) {
            System.out.println("Producte acceptat per al catàleg.");
        }else {
            System.out.println("El producte no es acceptable");
        }
    }
    
}
